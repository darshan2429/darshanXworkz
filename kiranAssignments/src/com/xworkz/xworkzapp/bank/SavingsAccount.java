package com.xworkz.xworkzapp.bank;

public class SavingsAccount implements BankOperation {
	int amount = 10000;

	@Override
	public void withdraw(int withdrawAmount) {
		int a = amount - withdrawAmount;
		System.out.println("withdraw " + withdrawAmount + " successfully");
		System.out.println("total amount after withdraw is "+a);
	}

	@Override
	public void deposit(int depositAmount) {
		int b = amount + depositAmount;
		System.out.println("deposit " + depositAmount + " successfully");
		System.out.println("total amount after deposit is "+b);
	}

}
