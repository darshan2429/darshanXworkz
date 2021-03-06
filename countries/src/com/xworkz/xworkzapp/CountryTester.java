package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.country.Australia;
import com.xworkz.xworkzapp.country.Country;
import com.xworkz.xworkzapp.country.India;

public class CountryTester {
	
	public static void main(String[] args) {
		//polymorphism
		//upcasting 
		Country india = new India();
		india.developement();
		india.noOfStates=30;
		india.population=131000000l;
		india.capital="Delhi";
		System.out.println(india.noOfStates + "   " + india.population + "   " + india.capital);
		
		Country australia = new Australia();
		australia.developement();
		australia.noOfStates=10;
		australia.population=29999900;
		System.out.println(australia.noOfStates+"     "+ australia.population);
	}

}
