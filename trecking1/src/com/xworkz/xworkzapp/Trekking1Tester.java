package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.Trekking1DTO;

public class Trekking1Tester {
	public static void main(String[] args) {
		Trekking1DTO dto = new Trekking1DTO("kedarnath",40,3300.00);
				
		System.out.println(dto.getPlace()+"   "+dto.getMembers()+"    "+dto.getCost());
	}
}
