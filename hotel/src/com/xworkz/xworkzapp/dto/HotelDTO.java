package com.xworkz.xworkzapp.dto;

public class HotelDTO {
	
	private String name;
	private String address;
	
	public HotelDTO() {
		System.out.println("object to hotel DTO create");
	}

	public void setName(String nm) {
		name=nm;
	}
	public void setAddress(String add) {
		address=add;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
}
