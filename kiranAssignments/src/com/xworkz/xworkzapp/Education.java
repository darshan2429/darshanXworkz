package com.xworkz.xworkzapp;

public class Education extends GST {
	int intrest = 14;

	@Override
	double gstCalculator(int amount) {
		System.out.println("Education ");
		{
			int a = amount * intrest / 100;
			return a;
		}
	}

}
