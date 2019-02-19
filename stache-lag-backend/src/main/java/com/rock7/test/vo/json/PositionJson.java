package com.rock7.test.vo.json;

import java.sql.Timestamp;

public class PositionJson {

	private boolean alert;
	private int altitude;
	private String type;
	private float dtfKm;
	private int id;
	private Timestamp gpsAt;
	private float sogKnots;
	private int battery;
	private int cog;
	private float dtfNm;
	private Timestamp txAt;
	private float longitude;
	private float latitude;
	private long gpsAtMillis;
	private float sogKmph;

	/**
	 * 
	 */
	public PositionJson() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param alert
	 * @param altitude
	 * @param type
	 * @param dtfKm
	 * @param id
	 * @param gpsAt
	 * @param sogKnots
	 * @param battery
	 * @param cog
	 * @param dtfNm
	 * @param txAt
	 * @param longitud
	 * @param latitud
	 * @param gpsAtMillis
	 * @param sogKmph
	 */
	public PositionJson(boolean alert, int altitude, String type, float dtfKm, int id, Timestamp gpsAt, float sogKnots,
			int battery, int cog, float dtfNm, Timestamp txAt, float longitude, float latitude, long gpsAtMillis,
			float sogKmph) {
		super();
		this.alert = alert;
		this.altitude = altitude;
		this.type = type;
		this.dtfKm = dtfKm;
		this.id = id;
		this.gpsAt = gpsAt;
		this.sogKnots = sogKnots;
		this.battery = battery;
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

	public float getLongitud() {
		return longitude;
	}

	public void setLongitud(float longitud) {
		this.longitude = longitud;
	}

	public float getLatitud() {
		return latitude;
	}

	public void setLatitud(float latitud) {
		this.latitude = latitud;
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

	@Override
	public String toString() {
		return "Position [alert=" + alert + ", altitude=" + altitude + ", type=" + type + ", dtfKm=" + dtfKm + ", id="
				+ id + ", gpsAt=" + gpsAt + ", sogKnots=" + sogKnots + ", battery=" + battery + ", cog=" + cog
				+ ", dtfNm=" + dtfNm + ", txAt=" + txAt + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", gpsAtMillis=" + gpsAtMillis + ", sogKmph=" + sogKmph + "]";
	}

}
