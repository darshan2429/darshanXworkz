package com.xworkz.workapp.pvr;

public class Theatre {
	private String name;
	private String address;
	private int noOfSeats;

	public Theatre() {
		// TODO Auto-generated constructor stub
		System.out.println("Theatre object is created ");
	}

	// blocks
	{
		String name = "Narthaki";
		String address = "Gandhi Nagar";
		int noOfSeats = 100;
		this.name = name;
		this.address = address;
		this.noOfSeats = noOfSeats;
		System.out.println("block is executed");

	}

	public void releasingMovies() {
		System.out.println("raleasing master");
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public static void main(String[] args) {

		Theatre theatre = new Theatre();
		theatre.releasingMovies();
		System.out.println(theatre.name + "    " + theatre.address + "   " + theatre.noOfSeats);

	}

}
