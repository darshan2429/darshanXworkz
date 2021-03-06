package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.company.Apple;
import com.xworkz.xworkzapp.company.Company;
import com.xworkz.xworkzapp.company.Microsoft;

public class CompanyTester {
	
	public static void main(String[] args) {
		
		Company apple = new Apple();
		apple.software();
		apple.name="apple";
		apple.noOfWorkers=10000;
		apple.hardware();
		System.out.println("company name:"+apple.name+"\n NoOfWorkers: "+apple.noOfWorkers+"\n");
	
		
		
		Microsoft microsoft = new Microsoft();
		microsoft.software();
		microsoft.name="Microsoft";
		microsoft.noOfWorkers=34000;
		System.out.println("company name:"+microsoft.name+"\n NoOfWorkers: "+microsoft.noOfWorkers);
		
	}

}
