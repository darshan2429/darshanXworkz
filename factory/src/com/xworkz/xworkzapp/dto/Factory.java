package com.xworkz.xworkzapp.dto;

public class Factory {
	private String name;
	private String address;
	private int employers;

	public Factory() {
		System.out.println("factory object is created");
	}

	public Factory(String name) {
		this.name = name;
	}

	public Factory(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Factory(int employers) {
		this.employers = employers;
	}

	

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getEmployers() {
		return employers;
	}

}
