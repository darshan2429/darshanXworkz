package com.xworkx.workzapp.busbookng;

public class BusBooking {
	public BusDetailsDTO[] busDetails;
	int index;

	public BusBooking(int size) {
		busDetails = new BusDetailsDTO[size];
	}

	public void addBusDetails(BusDetailsDTO busDetailsDTOs) {
		busDetails[index++] = busDetailsDTOs;
	}

	public void getBusDetails() {
		for (int i = 0; i < busDetails.length; i++) {
			System.out.println(busDetails[i].getTravelsName() + " " + busDetails[i].getStartingpoint() + " "
					+ busDetails[i].getDestination() + " " + busDetails[i].getPrice());
		}
	}

	public void getBusDetailsByName(String start,String dest) {
		for (int i = 0; i < busDetails.length; i++) {
			if (busDetails[i].getStartingpoint().equals(start) 
					&& busDetails[i].getDestination().equals(dest)) {
				System.out.println(busDetails[i].getTravelsName() + " " + busDetails[i].getStartingpoint() + " "
						+ busDetails[i].getDestination() + " " + busDetails[i].getPrice());
			}
		}
	}
}
