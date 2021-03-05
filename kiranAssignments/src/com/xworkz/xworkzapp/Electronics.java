package com.xworkz.xworkzapp;

public class Electronics extends GST {
	int gst = 9;

	@Override
	double gstCalculator(int amount) {
		System.out.println("Electronics ");
		{
			int a = amount * gst / 100;
			return a;
		}
	}

}
