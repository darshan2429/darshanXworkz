package com.xworkz.xwprkzapp.coconet;

public class HairOil {

	static private String name;
	static private double price;

	public HairOil() {
		// TODO Auto-generated constructor stub
		System.out.println("hairoil objected is created");
	}

	static {
		name = "coconet oil";
		price = 125.5;
		System.out.println("block is executed");
	}

	public static void massage() {
		System.out.println("head massage");

	}

	public static void main(String[] args) {

		HairOil.massage();
		System.out.println(HairOil.name + "   " + HairOil.price);
	}

}
