package com.xworkz.xworkzapp.bank;

public class Bank {
	public String name;
	public String branch;
	
	public Bank() {
		//this("SBI","Rajajinagar");
		System.out.println("bank object is created");
		// TODO Auto-generated constructor stub
	}
	public Bank(String name , String branch) {
		this.name=name;
		this.branch=branch;
		
		
	}

	public String bankIntrest() {
		System.out.println("intrest is 7%");
		return null;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}

}
