package com.xworkz.xworkzapp.dto;

public class Malldto {
	public static  String name;
	private String address;
	
	public Malldto() {
		System.out.println("welcome ");
	}
	public void setName(String nm) {
		name=nm;
	}
	public void setAddress(String add) {
		address=add;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}

}
