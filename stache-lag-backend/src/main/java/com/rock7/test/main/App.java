package com.rock7.test.main;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.rock7.test.dao.StacheLagBackend;
import com.rock7.test.dao.impl.StacheLagBackendImpl;

/**
 * 
 * @author AlbaEV
 *
 */
public class App {

	final static String pathFile = "/positions.json";
	
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException,
			FileNotFoundException, ClassNotFoundException, SQLException {
		
		StacheLagBackend stacheLag = new StacheLagBackendImpl();
		stacheLag.insertJson(pathFile);
		List<Object> viewedVessels = stacheLag.findViewedVessels();
	}

}
