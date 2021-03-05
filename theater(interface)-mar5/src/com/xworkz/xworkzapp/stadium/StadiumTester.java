package com.xworkz.xworkzapp.stadium;

import java.util.Scanner;

public class StadiumTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StadiumDaoImplimented stadium = new StadiumDaoImplimented();
		for (int i = 0; i < 1; i++) {
			System.out.println("ENTER NAME");
			String name = sc.next();
			System.out.println("location");
			String loc = sc.next();
			StadiumDTO dto = new StadiumDTO(name, 001, 10000, loc);

			stadium.addStadium(dto);

		}

		stadium.getStadiumDetails();

		System.out.println("enter the location");
		int id = sc.nextInt();
		stadium.delete(id);

		stadium.getStadiumDetails();

	}
}
