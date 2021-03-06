package com.xworkz.xworkzapp.cricket;

public class PlayersDTO {

	private String name;
	private int jerseyNo;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getJerseyNo() {
		return jerseyNo;
	}
	
	public String getAddress() {
		return address;
	}

}
