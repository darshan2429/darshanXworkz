package com.xworkz.xworkzapp.dto;

public class HospitalDTO {
	private String licenceNo;
	private String name;
	private String location;
	private String founder;
	private String specialized;
	private String phoneNo;
	
	public HospitalDTO(String licenceNo, String name, String location, String founder, String specialized,
			String phoneNo) {
		super();
		this.licenceNo = licenceNo;
		this.name = name;
		this.location = location;
		this.founder = founder;
		this.specialized = specialized;
		this.phoneNo = phoneNo;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
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

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}
	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	

}
