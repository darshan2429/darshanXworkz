package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.theater.Theater;

public class TheaterTester {
	public static void main(String[] args) {
		Theater navrang = new Theater("navrang", "Rajajinagar", 100, 500, 4, false);
		System.out.println(navrang.getName() + " "
				+ navrang.getCapacity() + "  " 
				+ navrang.getLocation() + " "
				+ navrang.getNoOFShows());

		navrang.ticketIssue();
		navrang.parkingCheck();
		navrang.orderFood();

	}
}
