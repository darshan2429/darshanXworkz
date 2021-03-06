package com.xworkz.xworkzapp.dto;

public class TrekkingDTO {

	private String place;
	private int members;
	private Double cost;
	
	public TrekkingDTO() {
		System.out.println("trekking object is created");
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getPlace() {
		return place;
	}
	public int getMembers() {
		return members;
	}
	public Double getCost() {
		return cost;
	}
}
