package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.HotelDTO;

public class HotelTester {
	public static void main(String[] args) {
		
		HotelDTO dto = new HotelDTO();
		dto.setName("kamat");
		dto.setAddress("rajajinagar");
		System.out.println(dto.getName()+"  "+dto.getAddress());
		
	}

}
