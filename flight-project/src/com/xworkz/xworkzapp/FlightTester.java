package com.xworkz.xworkzapp;

import java.util.Scanner;

import com.xworkz.xworkzapp.constant.CompanyNames;
import com.xworkz.xworkzapp.flight.CompanyFlightNameDTO;
import com.xworkz.xworkzapp.flight.FlightBooking;

public class FlightTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scanner.nextInt();
		
		

		FlightBooking flight = new FlightBooking(size);
		for (int i = 0; i < size; i++) {
			System.out.println("enter the flightnumber");
			int flightNumber = scanner.nextInt();

			System.out.println("enter the companyname");
			String companyName = scanner.next();

			System.out.println("enter the starting point");
			String startingPoint = scanner.next();

			System.out.println("enter the destination");
			String destination = scanner.next();

			System.out.println("enter total seats");
			int seats = scanner.nextInt();
			
			System.out.println(" is domestic ");
			boolean domestic=scanner.nextBoolean();
			
			System.out.println("enter businessclass price");
			double businessClass = scanner.nextDouble();


			System.out.println("enter economic class price");
			double economicClass = scanner.nextDouble();

			CompanyFlightNameDTO companyFlightNameDTO = new CompanyFlightNameDTO();
			companyFlightNameDTO.setFlightNumber(flightNumber);
			companyFlightNameDTO.setCompanyName(CompanyNames.valueOf(companyName));
			companyFlightNameDTO.setStartingPoint(startingPoint);
			companyFlightNameDTO.setDestination(destination);
			companyFlightNameDTO.setTotalSeats(seats);
			 companyFlightNameDTO.setDomestic(domestic);
			companyFlightNameDTO.setBusinessClassPrice(businessClass);
			companyFlightNameDTO.setEconomicClassPrice(economicClass);

			flight.addFlightDetails(companyFlightNameDTO);
		}
		flight.getFlightDetails();

		System.out.println("enter the starting point");
		String startingPoint = scanner.next();
		flight.flightDetailsByStartingPoint(startingPoint);
	}
}