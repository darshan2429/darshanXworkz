package com.xworkz.xworkzapp.tourist;

public class TouristDTO {
	int touristPlaceId;
	String touristPlace;
	String dist;
	String noOfDays;
	double price;

	public String getTouristPlace() {
		return touristPlace;
	}

	public void setTouristPlace(String touristPlace) {
		this.touristPlace = touristPlace;
	}

	public String getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public int getTouristPlaceId() {
		return touristPlaceId;
	}

	public void setTouristPlaceId(int touristPlaceId) {
		this.touristPlaceId = touristPlaceId;
	}

}
