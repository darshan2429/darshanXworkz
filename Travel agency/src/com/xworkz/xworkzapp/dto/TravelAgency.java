package com.xworkz.xworkzapp.dto;

public class TravelAgency {
	private String name;
	private String address;
	private String bookingType;

	public TravelAgency() {
		System.out.println("welcome ");
	}

	public TravelAgency(String name) {
		this.name = name;
	}

	public TravelAgency(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public TravelAgency(String name, String address, String bookingType) {
		this.name = name;
		this.address = address;
		this.bookingType = bookingType;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getBookingType() {
		return bookingType;
	}
}
