package com.xworkz.xworkzapp.stadium;

public class StadiumDTO {
	
	private String name;
	private int stadiumId;
	private int capacity;
	private String location;

	public StadiumDTO(String name, int stadiumId, int capacity, String location) {
		super();
		this.name = name;
		this.stadiumId = stadiumId;
		this.capacity = capacity;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStadiumId() {
		return stadiumId;
	}
	public void setStadiumId(int stadiumId) {
		this.stadiumId = stadiumId;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
