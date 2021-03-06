package com.xworkz.xwprkzapp.sunflower;

public class SunFlower {

	static private String name;
	static private double price;

	public SunFlower() {
		System.out.println("hairoil objected is created");
	}
//static block
	static {
		name = "coconet oil";
		price = 125.5;
		System.out.println("static block is executed");
	}
//nonstatic block
	{
		String name = "VeDol";
		double price = 350.00;

		this.name = name;
		this.price = price;
		System.out.println("Non static Block is executed");

	}

	public static void massage() {
		System.out.println("head massage");

	}

	public static void main(String[] args) {
		SunFlower.massage();
		SunFlower sunFlower = new SunFlower();
		System.out.println(SunFlower.name + "   " + SunFlower.price);
	}

}
