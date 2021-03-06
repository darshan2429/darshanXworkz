package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.TrekkingDTO;

public class TrekkingTester {
	public static void main(String[] args) {
		
		TrekkingDTO dto = new TrekkingDTO();
			dto.setPlace("gokarna");
			dto.setMembers(31);
			dto.setCost(3300.0);
			System.out.println(dto.getPlace()+"  "+dto.getMembers()+"    "+dto.getCost());
		}
	}


