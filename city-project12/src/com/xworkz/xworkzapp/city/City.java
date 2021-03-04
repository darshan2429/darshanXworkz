package com.xworkz.xworkzapp.city;

import com.xworkz.xworkzapp.constant.WardName;

public class City {

	private String name = "Bengaluru";
	public CityWardDTO[] cityward;
	private int index;

	public City(int size) {
		cityward = new CityWardDTO[size];

		// TODO Auto-generated constructor stub
	}

	public void addCityWard(CityWardDTO cityWardDTO) {
		cityward[index++] = cityWardDTO;
	}

	public void getWardDetails() {
		System.out.println(name);
		for (int i = 0; i < cityward.length; i++) {
			if (cityward[i] != null) {
				System.out.println(cityward[i].getWardNo() + " " +
			cityward[i].getWardName() + " " +cityward[i].getCorporateName()+ " " + 
				cityward[i].getPapulation() + " " + cityward[i].getArea());
			} else {
				System.out.println("no wards found");
			}
		}
	}

	public void getWardByName(String name) {
		for (int i = 0; i < cityward.length; i++) {
			if (cityward[i].getWardName().equals(name)) {
				System.out.println(
						cityward[i].getWardNo() + " " + cityward[i].getWardName() + " " + cityward[i].getCorporateName()
								+ " " + cityward[i].getPapulation() + " " + cityward[i].getArea());

			}
		}
	}

	public void updateCityWardPopulation(int wardNo, long population) {
		if (population > 0) {
			for (int i = 0; i < cityward.length; i++) {
				if (cityward[i].getWardNo() == wardNo) {
					cityward[i].setPapulation(population);
				} else {
					System.out.println("you entered wrong ward number");
				}
			}
		}
	}

	public void deleteCityWardDetails(int wardNo) {
		for (int i = 0; i < cityward.length; i++) {
			if (cityward[i].getWardNo() == wardNo) {
				cityward[i] = null;
			} else {
				System.out.println("no ward found");
			}
		}
	}

	public String getCorporaterNameByWardName(WardName wardName) {
		for (CityWardDTO cityWardDTO : cityward) {
			if (cityWardDTO.getWardName().equals(wardName)) {
				return cityWardDTO.getCorporateName();
				
			}
		}
		return null;
	}
}
