package com.xworkz.xworkzapp;

import java.util.Scanner;

public class CityTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter th size");
		int size = scanner.nextInt();

		City city = new City(size);
		for (int i = 0; i < size; i++) {
			
			System.out.println("enter the ward no");
			int wardnumber = scanner.nextInt();
			System.out.println("enter the ward name");
			String wardName = scanner.next();
			System.out.println("enter the ward population");
			long pop = scanner.nextLong();
			System.out.println("enter the ward area");
			String area = scanner.next();

		
		CityWardDTO dto = new CityWardDTO();
		dto.setCityWardNo(wardnumber);
		dto.setWardName(wardName);
		dto.setPopulation(pop);
		dto.setArea(area);
		city.addDetails(dto);
		}

		city.getDetails();
		
		System.out.println("enter your wardnumber to update pop");
		int wardno=scanner.nextInt();
		System.out.println("enter current pop");
		long pop=scanner.nextLong();
		city.updateUsingWardNumber(wardno, pop);
		city.getDetails();
		
		System.out.println("enter wardname");
		String wd=scanner.next();
		city.deleteWardByWardName(wd);
		
		city.getDetails();

	}

}
