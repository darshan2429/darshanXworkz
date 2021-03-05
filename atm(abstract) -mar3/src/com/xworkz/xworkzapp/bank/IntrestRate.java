package com.xworkz.xworkzapp.bank;

public abstract class IntrestRate {
	
	String bankName;
	String branchCode;
	
	public IntrestRate() {
		System.out.println("Intrest rate");
	}
	
	public abstract int getHomeLoanIntrest();
	public abstract int getCarLoanIntrest();
	public abstract int getPersonalLoanIntrest();
	
	public int getEducationLoan(){
	return 12;	
	}
}
