package com.xworkz.xworkzapp.dto;

public class Trekking1DTO {

	private String place;
	private int members;
	private Double cost;
	
	public Trekking1DTO(String place,int members,double cost) {
		System.out.println("trecking object is created");
		this.place=place;
		this.members=members;
		this.cost=cost;
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
