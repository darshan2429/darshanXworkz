package com.xworkx.workzapp;

import java.util.Scanner;

import com.xworkx.workzapp.busbookng.BusBooking;
import com.xworkx.workzapp.busbookng.BusDetailsDTO;
import com.xworkx.workzapp.constants.TravelsName;

public class BusTesting {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		BusBooking booking=new BusBooking(size);
		for (int i = 0; i < size; i++) {
			System.out.println("enter the TravesName");
			String travelsName=sc.next();
			
			System.out.println("enter the starting point");
			String start=sc.next();
			
			System.out.println("enter the destination");
			String dest=sc.next();
			
			System.out.println("enter the price");
			int price=sc.nextInt();
			
			BusDetailsDTO busDetailsDTO=new BusDetailsDTO();
			busDetailsDTO.setTravelsName(TravelsName.valueOf(travelsName));
			busDetailsDTO.setStartingpoint(start);
			busDetailsDTO.setDestination(dest);
			busDetailsDTO.setPrice(price);
			
			booking.addBusDetails(busDetailsDTO);
		}
		booking.getBusDetails();
		
		System.out.println("enter the starting point");
		String start=sc.next();
		System.out.println("enter the destination");
		String dest=sc.next();
		booking.getBusDetailsByName(start,dest);
	}
}
