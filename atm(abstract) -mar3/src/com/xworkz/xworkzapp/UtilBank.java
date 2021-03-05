package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.bank.IntrestRate;
import com.xworkz.xworkzapp.bank.SBIBank;

public class UtilBank {
	public static void main(String[] args) {
		IntrestRate bank = new SBIBank();
		System.out.println("Home lone Intrest : " + bank.getHomeLoanIntrest());
		System.out.println("Car lone Intrest : " + bank.getCarLoanIntrest());
		System.out.println("Personal lone Intrest : " + bank.getPersonalLoanIntrest());
	}

}
