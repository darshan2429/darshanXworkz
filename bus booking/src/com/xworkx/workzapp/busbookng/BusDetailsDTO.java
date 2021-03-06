package com.xworkx.workzapp.busbookng;

import java.time.format.DateTimeFormatter;

import com.xworkx.workzapp.constants.TravelsName;

public class BusDetailsDTO {
	
	private TravelsName travelsName;
	private String startingpoint;
	private String destination;
	private int price; 
	
	public TravelsName getTravelsName() {
		return travelsName;
	}
	public void setTravelsName(TravelsName travelsName) {
		this.travelsName = travelsName;
	}
	public String getStartingpoint() {
		return startingpoint;
	}
	public void setStartingpoint(String startingpoint) {
		this.startingpoint = startingpoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
