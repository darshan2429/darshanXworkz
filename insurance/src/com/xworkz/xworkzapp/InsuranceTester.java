package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.insurance.Insurance;

public class InsuranceTester {

	public static void main(String[] args) {
		Insurance insurance = new Insurance();
		insurance.insuranceId = 430;
		insurance.type = "health-insurance";
		System.out.println(insurance.insuranceId + " " + insurance.type);
		Insurance insurance1 = new Insurance();
		insurance1.insuranceId = 435;
		insurance1.type = "vehical-insurance";
		System.out.println(insurance1.insuranceId + " " + insurance1.type);
		
		System.out.println(insurance.hashCode());
		System.out.println(insurance1.hashCode());
		System.out.println(insurance.toString());
		System.out.println(insurance1.toString());
		System.out.println(insurance.equals(insurance1));
	}

}
