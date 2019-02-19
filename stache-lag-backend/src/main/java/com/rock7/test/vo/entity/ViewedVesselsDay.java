package com.rock7.test.vo.entity;

import java.math.BigInteger;
import java.sql.Timestamp;

public class ViewedVesselsDay {

	private long viewedVessels;
	private Timestamp date;

	public ViewedVesselsDay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ViewedVesselsDay(long viewedVessels, Timestamp date) {
		super();
		this.viewedVessels = viewedVessels;
		this.date = date;
	}

	public long getViewedVessels() {
		return viewedVessels;
	}

	public void setViewedVessels(long viewedVessels) {
		this.viewedVessels = viewedVessels;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ViewedVesselsDay [viewedVessels=" + viewedVessels + ", date=" + date + "]";
	}

	
}
