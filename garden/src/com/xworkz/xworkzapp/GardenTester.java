package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.GardenDTO;

public class GardenTester {
	public static void main(String[] args) {
		
		GardenDTO dto= new GardenDTO();
		dto.setName("brundhavan garden");
		dto.setAddress("bengaluru");
		System.out.println(dto.getName()+"  "+ dto.getAddress());
	}

}
