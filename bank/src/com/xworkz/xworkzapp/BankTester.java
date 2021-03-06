package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.bank.Bank;
import com.xworkz.xworkzapp.bank.HDFC;
import com.xworkz.xworkzapp.bank.SBI;

public class BankTester {
	public static void main(String[] args) {
		Bank sbi=new SBI("Sbi","mejestic");
//		sbi.name="SBI";
//		System.out.println(sbi.name);
		String sbi1=sbi.bankIntrest();
		System.out.println(sbi.getName()+"  "+sbi.getBranch()+"  "+sbi1);
		
		Bank hdfc=new HDFC("hdfc","mejestic");
//		hdfc.name="HDFC Bank";
//		System.out.println(hdfc.name);
		String hdfc1=hdfc.bankIntrest();
		System.out.println(hdfc.name+"  "+hdfc.branch+"  "+ hdfc1);
		
		
		
	}



}
