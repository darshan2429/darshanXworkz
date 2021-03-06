package com.xworkz.xworkzapp;

import java.util.Scanner;

import com.xworkz.xworkzapp.tourist.TouristDTO;
import com.xworkz.xworkzapp.tourist.TouristPlace;

public class TourUtil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();

		TouristPlace place = new TouristPlace(size);
		for (int i = 0; i < size; i++) {

			System.out.println("enter the tourist place ID");
			int touristplaceId = sc.nextInt();
			System.out.println("enter the tourist place");
			String touristplace = sc.next();
			System.out.println("enter no of days");
			String noOfDays = sc.next();
			System.out.println("enter district name");
			String dist = sc.next();
			System.out.println("enter price");
			double price = sc.nextDouble();

			TouristDTO dto = new TouristDTO();
			dto.setTouristPlaceId(touristplaceId);
			dto.setTouristPlace(touristplace);
			dto.setNoOfDays(noOfDays);
			dto.setDist(dist);
			dto.setPrice(price);

			place.addDetails(dto);
		}
		place.getDetails();

		System.out.println("enter district name");
		String name = sc.next();
		place.getDetailsByDist(name);

		System.out.println("enter id to update price");
		int id= sc.nextInt();
		System.out.println("enter price to update");
		double price1 = sc.nextDouble();
		place.updatePrice(id, price1);

		place.getDetails();
	}
}
