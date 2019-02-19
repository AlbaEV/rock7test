package com.rock7.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEAM")
public class TeamEntity {
	
	@Column(name = "MARKER")
	private int marker;
	
	@Column(name = "NAME")
	private String name;
	
	@Id
	@Column(name = "SERIAL")
	private int serial;
	/**
	 * 
	 */
	public TeamEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param position
	 * @param marker
	 * @param name
	 * @param serial
	 */
	public TeamEntity(int marker, String name, int serial) {
		this.marker = marker;
		this.name = name;
		this.serial = serial;
	}
	
	public int getMarker() {
		return marker;
	}
	public void setMarker(int marker) {
		this.marker = marker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	
	
	

}
