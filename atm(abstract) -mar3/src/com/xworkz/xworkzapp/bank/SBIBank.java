package com.xworkz.xworkzapp.bank;

public class SBIBank extends IntrestRate {
	
	public SBIBank() {
		super();
		System.out.println("inside sbibank object");
	}

	@Override
	public int getHomeLoanIntrest() {
		return 7;
	}

	@Override
	public int getCarLoanIntrest() {
		return 8;
	}

	@Override
	public int getPersonalLoanIntrest() {
		return 10;
	}

	

}
