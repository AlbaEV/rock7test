package com.rock7.test.vo.json;

import java.util.List;

import com.google.gson.annotations.*;

public class PositionsTeamsJson {

	@Expose(serialize = false)
	private List<TeamJson> teams;

	/**
	 * 
	 */
	public PositionsTeamsJson() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param team
	 */
	public PositionsTeamsJson(List<TeamJson> team) {
		super();
		this.teams = team;
	}

	public List<TeamJson> getTeam() {
		return teams;
	}

	public void setTeam(List<TeamJson> team) {
		this.teams = team;
	}

	@Override
	public String toString() {
		return "PositionsJson [teams=" + teams + "]";
	}
	
}
