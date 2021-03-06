package com.xworkz.xworkzapp.dto;

public class ShowroomDTO {
	private String name;
	private String address;
	public static String brand="ROYAL ENFIELD";
	
	public ShowroomDTO() {
		System.out.println("welcome to royal bikes");
	}
	public ShowroomDTO(String nm,String addr){
		name=nm;
		address=addr;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
}
