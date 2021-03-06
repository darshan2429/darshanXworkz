package com.xworkz.xworkzapp.bank;

public class SBI extends Bank{
	
	public SBI() {
		super();
		System.out.println("sbi object is created");
		// TODO Auto-generated constructor stub
	}
	
	public SBI(String name, String branch) {
		super(name, branch);
		System.out.println("sbi object is created");
		// TODO Auto-generated constructor stub
	}


	@Override
	public String bankIntrest() {
		// TODO Auto-generated method stub
//		System.out.println("intrest is 8%");
		return "intrest is 8%";
	}

}
