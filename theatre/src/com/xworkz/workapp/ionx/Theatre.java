package com.xworkz.workapp.ionx;


public class Theatre {

	static private String name;
	static private String address;
	static int noOfSeats;

	public Theatre() {
		// TODO Auto-generated constructor stub
		System.out.println("Theatre object is created ");
	}

	// blocks
	static
	{
		name = "Narthaki";
		address = "Gandhi Nagar";
		noOfSeats = 100;
		System.out.println("block is executed");

	}

	public static void releasingMovies() {
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
		
		//TheatreTester theatre=new TheatreTester();
		Theatre.releasingMovies();
		System.out.println(Theatre.name+"    "+Theatre.address+"   "+Theatre.noOfSeats);
		
	}

}
