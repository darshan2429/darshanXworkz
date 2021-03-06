package com.xworkz.xworkzapp;

import java.util.Scanner;


import com.xworkz.xworkzapp.city.City;
import com.xworkz.xworkzapp.city.CityWardDTO;
import com.xworkz.xworkzapp.constant.WardName;

import static com.xworkz.xworkzapp.constant.WardName.*;


public class CityUtil {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of wards");
		int size=sc.nextInt();
		
		City city = new City(size);
		for (int i = 0; i < size; i++) {
			
			System.out.println("enter the ward number");
			int wardNo=sc.nextInt();
			
			System.out.println("enter the ward name");
			String wardName=sc.next();
			
			System.out.println("enter the corporater name");
			String corporateName=sc.next();
			
			System.out.println("enter the population");
			long pop=sc.nextLong();
			
			System.out.println("enter the area in square kilo meter");
			String area=sc.next();
			
			CityWardDTO cityWardDTO=new CityWardDTO();
			cityWardDTO.setWardNo(wardNo);
			cityWardDTO.setWardName(WardName.valueOf(wardName));
			cityWardDTO.setCorporateName(corporateName);
			cityWardDTO.setPapulation(pop);
			cityWardDTO.setArea(area);
			
			city.addCityWard(cityWardDTO);
			
		}
		city.getWardDetails();
		
//		System.out.println("enter word no you want to change this population");
//		int wardNo=sc.nextInt();
//		System.out.println("enter the population");
//		long population=sc.nextLong();
//		city.updateCityWardPopulation(wardNo, population);
//		city.getWardDetails();
//		
//		System.out.println("you want delete, enter the ward number");
//		int ward=sc.nextInt();
//		city.deleteCityWardDetails(ward);
//		System.out.println("deleted successfully");
//		city.getWardDetails();
		
		
		System.out.println("enter the WardName");
		String name=sc.next();
		city.getWardByName(name);
		
//		System.out.println("enter the ward name");
////		String wardName=sc.next();
//		String name=String.valueOf(wardName);
//		String cn=city.getCorporaterNameByWardName(RAJAJINAGAR);
//		System.out.println(cn);
	}

}
 