package com.xworkz.xworkzapp.theater;

public class Theater extends TheaterBranck implements TheaterOperation {

	private String name;
	private String location;
	private int capacity;
	private int noOfSeats;
	private int noOFShows;
	private boolean isAc;

	public Theater(String name, String location, int capacity, int noOfSeats, int noOFShows, boolean isAc) {
		super();
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.noOfSeats = noOfSeats;
		this.noOFShows = noOFShows;
		this.isAc = isAc;
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getNoOFShows() {
		return noOFShows;
	}

	public void setNoOFShows(int noOFShows) {
		this.noOFShows = noOFShows;
	}

	public boolean isAc() {
		return isAc;
	}

	public void setAc(boolean isAc) {
		this.isAc = isAc;
	}

	@Override
	public void ticketIssue() {
		System.out.println(super.name);
		System.out.println(super.gst);
		System.out.println("Ticket issue Successfully");
	}

	@Override
	public void parkingCheck() {
		System.out.println("Parking Successfully");
	}

	@Override
	public void orderFood() {
		System.out.println("Order food Successfully!!! thank you for order");
	}

}
