package com.xworkz.xworkzapp.tourist;

public class TouristPlace {

	public TouristDTO[] tourist;
	int index;

	public TouristPlace(int size) {
		tourist = new TouristDTO[size];
	}

	public void addDetails(TouristDTO touristdto) {
		if (touristdto.getTouristPlace() != null)
			tourist[index++] = touristdto;
	}

	public void getDetails() {
		for (int i = 0; i < tourist.length; i++) {
			System.out.println( tourist[i].getTouristPlaceId()+ " " +tourist[i].getTouristPlace() + " " + tourist[i].getNoOfDays() + " "
					+ tourist[i].getDist() + " " + tourist[i].getPrice());
		}
	}

	public void getDetailsByDist(String dist) {
		for (int i = 0; i < tourist.length; i++) {
			if (tourist[i].getDist().equals(dist)) {
				System.out.println(tourist[i].getTouristPlaceId()+ " " +tourist[i].getTouristPlace() + " " + tourist[i].getNoOfDays() + " "
						+ tourist[i].getDist() + " " + tourist[i].getPrice());
			} else
				System.out.println("this place is not found");
		}
	}

	public void updatePrice(int id, double price) {
		if (price > 0) {
			for (int i = 0; i < tourist.length; i++) {
				if (tourist[i].getTouristPlaceId() == id) {
					tourist[i].setPrice(price);
					System.out.println("updated successfully");
				} else
					System.out.println("enter correct id");
			}
		}
	}
}
