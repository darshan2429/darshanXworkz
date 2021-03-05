package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.*;

public class LaptopTester {
	public static void main(String[] args) {
		LaptopDTO laptop[]=new LaptopDTO[5];
		LaptopDTO dto=new LaptopDTO();
		dto.setBrandName("dell");
		dto.setModelName("inspiron");
		dto.setPrice(25000);
		dto.setColour("black");
		
		laptop[0]=dto;
		for (int i = 0; i < laptop.length; i++) {
			System.out.println(laptop[i]);
		}	
	}
}
