package com.ticketbooking.model;

public class Theater {
	private int theaterId;
	private String theaterName;
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public Theater(int theaterId,String theaterName) {
		this.theaterId=theaterId;
		this.theaterName=theaterName;
	}

}
