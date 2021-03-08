package com.xworkz.xworkzapp.dto;

public class PubDTO {
	private String licenceNumber;
	private String gstNumber;
	private String name;
	private String location;
	private int noOfTables;
	private int entryFees;

	public PubDTO(String licenceNumber, String gstNumber, String name, String location, int noOfTables, int entryFees) {
		System.out.println("pub dto constructor is cretaed");
		this.licenceNumber = licenceNumber;
		this.gstNumber = gstNumber;
		this.name = name;
		this.location = location;
		this.noOfTables = noOfTables;
		this.entryFees = entryFees;
	}

	public PubDTO() {
		System.out.println("pub default constructor is created");
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(int noOfTables) {
		this.noOfTables = noOfTables;
	}

	public int getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(int entryFees) {
		this.entryFees = entryFees;
	}

}
