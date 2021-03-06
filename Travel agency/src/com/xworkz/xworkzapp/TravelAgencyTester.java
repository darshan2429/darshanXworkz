package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.TravelAgency;

public class TravelAgencyTester {
	public static void main(String[] args) {
		TravelAgency dto = new TravelAgency();
		System.out.println("enjoy your booking");
		
		TravelAgency dto1 = new TravelAgency("SRS");
		System.out.println(dto1.getName());
		
		TravelAgency dto2 = new TravelAgency("VRL","Bengaluru");
		System.out.println(dto2.getName()+"   "+dto2.getAddress());
		
		TravelAgency dto3 = new TravelAgency("REDBUS","Shivamogga","Bus");
		System.out.println(dto3.getName()+"   "+dto3.getAddress()+"   "+dto3.getBookingType());
		
		TravelAgency dto4 = new TravelAgency("ABHIBUS","Mysore","Bus");
		System.out.println(dto4.getName()+"   "+dto4.getAddress()+"   "+dto4.getBookingType());
		
		TravelAgency dto5 = new TravelAgency("IRCTC","SBC","Train");
		System.out.println(dto5.getName()+"   "+dto5.getAddress()+"   "+dto5.getBookingType());
	}

}
