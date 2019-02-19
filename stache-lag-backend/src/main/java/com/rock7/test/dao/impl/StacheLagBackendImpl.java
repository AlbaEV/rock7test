package com.rock7.test.dao.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.RollbackException;
import javax.persistence.TransactionRequiredException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.rock7.test.dao.StacheLagBackend;
import com.rock7.test.domain.PositionEntity;
import com.rock7.test.domain.TeamEntity;
import com.rock7.test.vo.json.PositionJson;
import com.rock7.test.vo.json.PositionsTeamsJson;
import com.rock7.test.vo.json.TeamJson;

public class StacheLagBackendImpl implements StacheLagBackend {

	@PersistenceUnit
	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("persistence");

	public void insertJson(String pathFile) {

		try {
			// Set the format DateTime of the json
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").create();

			// Load the json form
			InputStream is = StacheLagBackendImpl.class.getResourceAsStream(pathFile);
			InputStreamReader isr = new InputStreamReader(is);

			// Parse json into Java Object
			PositionsTeamsJson teams = gson.fromJson(isr, PositionsTeamsJson.class);
			this.recordPositions(teams);
		} catch (JsonSyntaxException e) {
			throw new JsonSyntaxException(e.getCause());
		} catch (JsonIOException e) {
			throw new JsonIOException(e.getCause());
		}
	}

	@SuppressWarnings("unchecked")
	public List<Object> findViewedVessels() {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Create query
		String sql = "SELECT COUNT(DISTINCT A.ID_TEAM), A.GPS_AT\r\n"
				+ "FROM POSITIONS A INNER JOIN POSITIONS B \r\n"
				+ "ON A.ID_TEAM <> B.ID_TEAM AND A.SOG_KMPH > 0 AND B.SOG_KMPH > 0 AND A.DTF_KM > 0 AND B.DTF_KM > 0 AND\r\n"
				+ "(B.GPS_AT_MILLIS BETWEEN A.GPS_AT_MILLIS -30000 AND A.GPS_AT_MILLIS +30000) AND \r\n"
				+ "(B.LONGITUDE BETWEEN A.LONGITUDE -0.05 AND A.LONGITUDE +0.05) AND \r\n"
				+ "(B.LATITUDE BETWEEN A.LATITUDE -0.05 AND A.LATITUDE +0.05)\r\n"
				+ "GROUP BY DAY(A.GPS_AT)";

		try {
			Query query = entityManager.createNativeQuery(sql);

			// Obtain result from query
			List<Object> viewedVesselsObj = query.getResultList();
			return viewedVesselsObj;

		} catch (IllegalStateException e) {
			throw new IllegalStateException(e.getCause());
		} catch (TransactionRequiredException e) {
			throw new TransactionRequiredException(e.getMessage());
		} catch (PersistenceException e) {
			throw new PersistenceException(e.getCause());
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}

	private void recordPositions(PositionsTeamsJson teams) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {
			// Lop the teams and the positions teams to create EntityObject
			for (TeamJson team : teams.getTeam()) {
				TeamEntity teamEntity = new TeamEntity(team.getMarker(), team.getName(),
						team.getSerial());
				entityManager.getTransaction().begin();
				for (PositionJson position : team.getPosition()) {
					PositionEntity positionEntity = new PositionEntity(position.isAlert(),
							position.getAltitude(), position.getType(), position.getDtfKm(),
							position.getId(), position.getGpsAt(), position.getSogKnots(),
							position.getBattery(), teamEntity, position.getCog(),
							position.getDtfNm(), position.getTxAt(), position.getLongitud(),
							position.getLatitud(), position.getGpsAtMillis(),
							position.getSogKmph());
					// Persist the positions into DB
					entityManager.persist(positionEntity);
				}
				entityManager.getTransaction().commit();
			}

		} catch (EntityExistsException e) {
			throw new EntityExistsException(e.getCause());
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e.getCause());
		} catch (TransactionRequiredException e) {
			throw new TransactionRequiredException(e.getMessage());
		} catch (RollbackException e) {
			throw new RollbackException(e.getCause());
		} finally {
			entityManager.close();
		}

	}

}
