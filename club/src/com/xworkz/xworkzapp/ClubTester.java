package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.Club;

public class ClubTester {
	public static void main(String[] args) {
		Club dto = new Club();
		System.out.println();

		Club dto1 = new Club("taj");
		System.out.println(dto1.getName());

		Club dto2 = new Club("harsha club", "vijaynagar");
		System.out.println(dto2.getName() + "  " + dto2.getAddress());

		Club dto3 = new Club("rock club", 31, 35000);
		System.out.println(dto3.getName() + "  " + dto3.getMembers() + "  " + dto3.getCost());
	}
}