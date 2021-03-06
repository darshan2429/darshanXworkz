package com.xworkz.workzapp;

public class Party {
	public String name;
	public double cost;

	public Party() {
		
		System.out.println("1st");
	}

	public Party(String name) {
		this();
		System.out.println("2nd");
		this.name = name;
	}

	public Party(String name, double cost) {
		this("darshan");
		System.out.println("3rd");
		this.name = name;
		this.cost = cost;
	}
z
}
