package com.xworkz.xworkzapp;

public class City {
	public CityWardDTO[] cityward;
	int index;

	public City(int size) {
		cityward = new CityWardDTO[size];
	}

	public void addDetails(CityWardDTO cityward) {
		this.cityward[index] = cityward;
		index++;

	}

	public void getDetails() {
		for (int i = 0; i < cityward.length; i++) {
			if (cityward[i] != null) {
				System.out.println(cityward[i].getWardName() + " " + cityward[i].getCityWardNo() + " "
						+ cityward[i].getPopulation() + " " + cityward[i].getArea());
			} else
				System.out.println("no wards found");
		}
	}

	public void updateUsingWardNumber(int wardNo, long pop) {

		for (int i = 0; i < cityward.length; i++) {
			if (cityward[i].getCityWardNo() == wardNo) {
				cityward[i].setPopulation(pop);
			}
		}
	}
	public void deleteWardByWardName(String wardName){
		for (int i = 0; i < cityward.length; i++) {
			if(cityward[i].getWardName().equals(wardName)){
				cityward[i]=null;
			}
		}
		
	}
}
