package com.xworkz.xworkzapp;

import java.util.Scanner;

public class GSTUtil {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		GST garments=new Garments();
		double a=garments.gstCalculator(10000);
		System.out.println(a);
		
		GST education=new Education();
		double b=education.gstCalculator(10000);
		System.out.println(b);
		
		GST hospital=new Hospital();
		double c=hospital.gstCalculator(10000);
		System.out.println(c);
		
		GST restarent=new Restarent();
		double d=restarent.gstCalculator(10000);
		System.out.println(d);
		
		GST elect=new Electronics();
		double e=elect.gstCalculator(10000);
		System.out.println(e);
		
	}

}
