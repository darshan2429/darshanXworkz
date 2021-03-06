package com.xworkz.xworkzapp.flight;

import javax.xml.crypto.dsig.CanonicalizationMethod;

public class FlightBooking {
	public CompanyFlightNameDTO[] companyflight;
	private int index;

	public FlightBooking(int size) {
		companyflight = new CompanyFlightNameDTO[size];
	}

	public void addFlightDetails(CompanyFlightNameDTO companyflightname) {

			if (companyflightname.getFlightNumber() != 0 
					&& companyflightname.getCompanyName() != null
					&& companyflightname.getBusinessClassPrice() >= 1000.0
					&& companyflightname.getStartingPoint() != null
					&& companyflightname.getEconomicClassPrice() != 0.0) {
				companyflight[index++] = companyflightname;		
		}
	}

	public void getFlightDetails() {
		for (int i = 0; i < companyflight.length; i++) {
			System.out.println(companyflight[i].getFlightNumber() + " " + companyflight[i].getCompanyName() + " "
					+ companyflight[i].getStartingPoint() + " " + companyflight[i].getDestination() + " "
					+ companyflight[i].getTotalSeats());

		}
	}

	public void flightDetailsByStartingPoint(String startingPoint) {
		for (int i = 0; i < companyflight.length; i++) {
			if (companyflight[i].getStartingPoint().equals(startingPoint)) {
				System.out.println(companyflight[i].getFlightNumber() + " " + companyflight[i].getCompanyName() + " "
						+ companyflight[i].getStartingPoint() + " " + companyflight[i].getDestination() + " "
						+ companyflight[i].getTotalSeats());
			} else
				System.out.println("starting not pointnot found");
		}
	}
}
