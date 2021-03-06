package com.xworkz.xworkzapp.institute;

public class InstituteTester {
	public static void main(String[] args) {

		Xworkz xworkz = new Xworkz();
		xworkz.training();
		xworkz.name = "X-Workz";
		xworkz.address = "Rajajinagr";
		System.out.println("Institute Name:" +xworkz.name + "\nAddress:   " + xworkz.address);

		Pentagon pentagon = new Pentagon();
		pentagon.training();
		pentagon.name = "Pentagon";
		pentagon.address = "BTM";
		System.out.println("Institute Name:"+pentagon.name + "\nAddress:   " + pentagon.address);

	}

}
