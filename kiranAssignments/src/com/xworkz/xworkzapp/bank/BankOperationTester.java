package com.xworkz.xworkzapp.bank;

public class BankOperationTester {
	public static void main(String[] args) {
		BankOperation account=new SavingsAccount();
		System.out.println("savings account");
		account.withdraw(1000);
		account.deposit(2000);
		
		System.out.println();
		
		BankOperation loan =new LoanAmount();
		System.out.println("loan account");
		loan.withdraw(1000);
		loan.deposit(2000);		
	}

}
