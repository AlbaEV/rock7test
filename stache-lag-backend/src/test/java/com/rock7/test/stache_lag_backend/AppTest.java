package com.rock7.test.stache_lag_backend;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.junit.Test;

import com.rock7.test.dao.StacheLagBackend;
import com.rock7.test.dao.impl.StacheLagBackendImpl;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@PersistenceUnit
	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("persistence");

	@SuppressWarnings("unchecked")
	@Test
	public void testApp() {
		StacheLagBackend stacheLag = new StacheLagBackendImpl();
		stacheLag.insertJson("/positionsTest.json");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT * FROM POSITIONS WHERE POSITIONS.ID_TEAM = 1234";

		Query query = entityManager.createNativeQuery(sql);
		List<Object> testPositions = query.getResultList();
		Assert.assertEquals(3, testPositions.size());

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testApp2() {

		StacheLagBackend stacheLag = new StacheLagBackendImpl();
		List<Object> viewedVesselsReturned = stacheLag.findViewedVessels();

		Assert.assertEquals(2, viewedVesselsReturned.size());
	}

}
