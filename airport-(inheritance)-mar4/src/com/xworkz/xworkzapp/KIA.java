package com.xworkz.xworkzapp;

public class KIA implements Airport {
	private String airportName;
	private String airportId;
	private int noOfRunways;

	public KIA(String airportName, String airportId, int noOfRunways) {
		super();
		this.airportName = airportName;
		this.airportId = airportId;
		this.noOfRunways = noOfRunways;
		
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportId() {
		return airportId;
	}

	public void setAirportId(String airportId) {
		this.airportId = airportId;
	}

	public int getNoOfRunways() {
		return noOfRunways;
	}

	public void setNoOfRunways(int noOfRunways) {
		this.noOfRunways = noOfRunways;
	}

	@Override
	public void securityCheck() {
		System.out.println("security check is done");
	}

	@Override
	public void ticketIssue() {
		System.out.println("tickect issued");

	}

}
