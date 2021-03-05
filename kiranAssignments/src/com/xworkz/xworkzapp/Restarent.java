package com.xworkz.xworkzapp;

public class Restarent extends GST {

	int gst = 10;

	@Override
	double gstCalculator(int amount) {
		System.out.println("Restorent ");
		{
			int a = amount * gst / 100;
			return a;
		}
	}

}
