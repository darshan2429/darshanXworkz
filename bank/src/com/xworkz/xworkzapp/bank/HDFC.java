package com.xworkz.xworkzapp.bank;

public class HDFC extends Bank {
	public HDFC() {
		super();
		System.out.println("hdfc object is created");
		// TODO Auto-generated constructor stub
	}

	public HDFC(String name, String branch) {
		super(name, branch);
		System.out.println("hdfc object is created");

		// TODO Auto-generated constructor stub
	}

	@Override
	public String bankIntrest() {
		// TODO Auto-generated method stub
		// System.out.println("intrest is 10%");
		return "intrest is 10%";
	}

}
