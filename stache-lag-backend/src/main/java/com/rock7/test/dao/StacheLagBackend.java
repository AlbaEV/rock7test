package com.rock7.test.dao;

import java.util.List;

public interface StacheLagBackend {

	/**
	 * Insert all data from positions.json into DB
	 */
	public void insertJson(String nameFile);

	/**
	 * 
	 * Find how many vessels are viewed during the race and grouped by day
	 */
	public List<Object> findViewedVessels();

}
