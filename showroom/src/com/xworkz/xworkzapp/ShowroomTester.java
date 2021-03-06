package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.ShowroomDTO;

public class ShowroomTester {
	public static void main(String[] args) {
		ShowroomDTO dto= new ShowroomDTO("Manavi Royal","Electronic city");
				System.out.println("Showroom name  "+dto.getName()+" \n address  "+dto.getAddress()+" \ncompany name  "+ ShowroomDTO.brand);
	}

}
