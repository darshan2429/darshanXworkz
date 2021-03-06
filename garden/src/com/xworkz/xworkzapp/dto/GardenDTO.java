package com.xworkz.xworkzapp.dto;

public class GardenDTO {
	
	private String name;
	private String address;
	
	public GardenDTO() {
		System.out.println("object to garden DTO created");
		
	}
	public void setName(String nm) {
		name=nm;
	}
	public void setAddress(String addr) {
		address=addr;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}

}
