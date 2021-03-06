package com.xworkz.workzapp;

import java.util.Scanner;

public class OilTester {

	public static void main(String[] args) {

		Oil oil = new Oil();
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter price");
		String price = scanner.next();
		int price1 = Integer.parseInt(price);
		System.out.println("price  is: " + price1 + ", converted string to int");

		System.out.println("enter money");
		String money = scanner.next();
		long money1 = Long.parseLong(money);
		System.out.println("money is : " + money1 + ", converted string to long");

		System.out.println("enter name");
		String name = scanner.next();
		System.out.println("name is : " + name + ", string type");

		System.out.println("enter value");
		Float value1 = scanner.nextFloat();
		System.out.println("value is : " + value1 + ", float type");

		System.out.println("enter cost");
		String cost = scanner.nextLine();
		Double cost1 = Double.parseDouble(cost); 
		System.out.println("cost is : " + cost1);

	}
}
