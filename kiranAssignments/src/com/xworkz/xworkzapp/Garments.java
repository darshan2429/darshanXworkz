package com.xworkz.xworkzapp;

public class Garments extends GST {

	int gst = 7;

	@Override
	double gstCalculator(int amount) {
		System.out.println("Garment ");
		{
			int a = amount * gst / 100;
			return a;
		}

	}

}
