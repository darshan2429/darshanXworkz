package com.xworkz.xworkzapp.flight;

import com.xworkz.xworkzapp.constant.CompanyNames;

public class CompanyFlightNameDTO {
	
	private int flightNumber;
	private CompanyNames companyname;
	private String startingPoint;
	private String destination;
	private int totalSeats;
	private static boolean domestic;
	private double businessClassPrice;
	private double economicClassPrice;

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public CompanyNames getCompanyName() {
		return companyname;
	}

	public void setCompanyName(CompanyNames company) {
		this.companyname = company;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public static boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}

	public double getBusinessClassPrice() {
		return businessClassPrice;
	}

	public void setBusinessClassPrice(double businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}

	public double getEconomicClassPrice() {
		return economicClassPrice;
	}

	public void setEconomicClassPrice(double economicClassPrice) {
		this.economicClassPrice = economicClassPrice;
	}
	
	

}
