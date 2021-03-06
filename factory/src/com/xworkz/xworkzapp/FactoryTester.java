package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.Factory;

public class FactoryTester {
	public static void main(String[] args) {

		Factory factory = new Factory("adb");
		
		System.out.println(factory.getName());

		Factory factory1 = new Factory("MPM", "bhadravathi");
		System.out.println(factory1.getName() + "   " + factory1.getAddress());

		Factory factory2 = new Factory(250);
		System.out.println(factory2.getEmployers());

		Factory factory3 = new Factory("shivamogga");
		System.out.println(factory3.getAddress());

	}

}
