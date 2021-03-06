package com.xworkz.xworkzapp.dto;

public class Club {
	private String name;
	private String address;
	private int members;
	private double cost;

	public Club() {
		System.out.println("welcome ");
	}

	public Club(String name) {
		this.name = name;
	}

	public Club(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Club(String name, int members, double cost) {
		this.name = name;
		this.members = members;
		this.cost = cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getMembers() {
		return members;
	}

	public double getCost() {
		return cost;
	}

}
