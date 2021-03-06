package com.xworkz.xwprkzapp.castrol;

public class Castrol {
	private String name;
	private double price;

	// create default constructor
	public Castrol() {
		this("Castrol");
		
		// TODO Auto-generated constructor stub
		System.out.println("Castrol object is created");
	}

	public Castrol(String name) {
		this(name,5000);
		System.out.println("one parameterised constructer is created");

		this.name = name;
	}

	public Castrol(String name, double price) {

		System.out.println("two parameterised constructer is created");

		this.name = name;
		this.price = price;
	}

	// block
	{
		String name = "VeDol";
		double price = 350.00;

		this.name = name;
		this.price = price;
		System.out.println("Block is executed");

	}
	

	// method
	public void engine() {
		System.out.println("Bike or Car engine we can usethis oil");
	}

	// main method
	public static void main(String[] args) {

		Castrol castrol = new Castrol();
		castrol.engine();
		System.out.println(castrol.name + "    " + castrol.price);

	}

}
