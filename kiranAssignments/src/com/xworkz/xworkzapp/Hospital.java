package com.xworkz.xworkzapp;

public class Hospital extends GST {
	int gst=13;
	
	@Override
	double gstCalculator(int amount) {
		System.out.println("Hospital ");
		{
			int a = amount * gst / 100;
			return a;
		}
	}
}
