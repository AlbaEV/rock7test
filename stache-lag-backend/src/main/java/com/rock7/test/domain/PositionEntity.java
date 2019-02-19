package com.rock7.test.domain;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "POSITIONS")
public class PositionEntity {

	@Column(name = "ALERT")
	private boolean alert;

	@Column(name = "ALTITUDE")
	private int altitude;

	@Column(name = "TYPE")
	private String type;

	@Column(name = "DTF_KM")
	private float dtfKm;

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "GPS_AT")
	private Timestamp gpsAt;

	@Column(name = "SOG_KNOTS")
	private float sogKnots;

	@Column(name = "BATTERY")
	private int battery;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_TEAM", referencedColumnName = "SERIAL", columnDefinition = "int")
	private TeamEntity idTeam;

	@Column(name = "COG")
	private int cog;

	@Column(name = "DTF_NM")
	private float dtfNm;

	@Column(name = "TX_AT")
	private Timestamp txAt;

	@Column(name = "LONGITUDE")
	private float longitude;

	@Column(name = "LATITUDE")
	private float latitude;

	@Column(name = "GPS_AT_MILLIS")
	private long gpsAtMillis;

	@Column(name = "SOG_KMPH")
	private float sogKmph;

	/**
	 * 
	 */
	public PositionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PositionEntity(boolean alert, int altitude, String type, float dtfKm, int id,
			Timestamp gpsAt, float sogKnots, int battery, TeamEntity idTeam, int cog, float dtfNm,
			Timestamp txAt, float longitude, float latitude, long gpsAtMillis, float sogKmph) {
		super();
		this.alert = alert;
		this.altitude = altitude;
		this.type = type;
		this.dtfKm = dtfKm;
		this.id = id;
		this.gpsAt = gpsAt;
		this.sogKnots = sogKnots;
		this.battery = battery;
		this.idTeam = idTeam;
		this.cog = cog;
		this.dtfNm = dtfNm;
		this.txAt = txAt;
		this.longitude = longitude;
		this.latitude = latitude;
		this.gpsAtMillis = gpsAtMillis;
		this.sogKmph = sogKmph;
	}

	public boolean isAlert() {
		return alert;
	}

	public void setAlert(boolean alert) {
		this.alert = alert;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getDtfKm() {
		return dtfKm;
	}

	public void setDtfKm(float dtfKm) {
		this.dtfKm = dtfKm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getGpsAt() {
		return gpsAt;
	}

	public void setGpsAt(Timestamp gpsAt) {
		this.gpsAt = gpsAt;
	}

	public float getSogKnots() {
		return sogKnots;
	}

	public void setSogKnots(float sogKnots) {
		this.sogKnots = sogKnots;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getCog() {
		return cog;
	}

	public void setCog(int cog) {
		this.cog = cog;
	}

	public float getDtfNm() {
		return dtfNm;
	}

	public void setDtfNm(float dtfNm) {
		this.dtfNm = dtfNm;
	}

	public Timestamp getTxAt() {
		return txAt;
	}

	public void setTxAt(Timestamp txAt) {
		this.txAt = txAt;
	}

	public long getGpsAtMillis() {
		return gpsAtMillis;
	}

	public void setGpsAtMillis(long gpsAtMillis) {
		this.gpsAtMillis = gpsAtMillis;
	}

	public float getSogKmph() {
		return sogKmph;
	}

	public void setSogKmph(float sogKmph) {
		this.sogKmph = sogKmph;
	}

	public TeamEntity getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(TeamEntity idTeam) {
		this.idTeam = idTeam;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "PositionEntity [alert=" + alert + ", altitude=" + altitude + ", type=" + type
				+ ", dtfKm=" + dtfKm + ", id=" + id + ", gpsAt=" + gpsAt + ", sogKnots=" + sogKnots
				+ ", battery=" + battery + ", idTeam=" + idTeam + ", cog=" + cog + ", dtfNm="
				+ dtfNm + ", txAt=" + txAt + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", gpsAtMillis=" + gpsAtMillis + ", sogKmph=" + sogKmph + "]";
	}

}
