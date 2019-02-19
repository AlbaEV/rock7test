package com.rock7.test.vo.json;

import java.util.List;

public class TeamJson {
	
	private List<PositionJson> positions;
	private int marker;
	private String name;
	private int serial;
	
	public List<PositionJson> getPosition() {
		return positions;
	}
	public void setPosition(List<PositionJson> position) {
		this.positions = position;
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
	@Override
	public String toString() {
		return "Team [positions=" + positions + ", marker=" + marker + ", name=" + name + ", serial=" + serial + "]";
	}
	
	

}
