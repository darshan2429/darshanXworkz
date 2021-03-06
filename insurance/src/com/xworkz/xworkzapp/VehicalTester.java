package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.vehical.VehicalInsurance;

public class VehicalTester {
	
	public static void main(String[] args) {
		
		VehicalInsurance vehical=new VehicalInsurance();
		vehical.vehicalNo="KA05ES0024";
		vehical.insuranceID=420;
		vehical.type="Car-Insurance";
		VehicalInsurance vehical1=new VehicalInsurance();
		vehical1.vehicalNo="KA05ES0125";
		vehical1.insuranceID=420;
		vehical1.type="Car-Insurance";
		
		System.out.println(vehical.hashCode());
		System.out.println(vehical1.hashCode());
		System.out.println(vehical.toString());
		System.out.println(vehical1.toString());
		System.out.println(vehical.equals(vehical1));	
	}
}
