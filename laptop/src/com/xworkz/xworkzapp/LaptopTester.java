package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.laptop.Dell;
import com.xworkz.xworkzapp.laptop.Lenovo;

public class LaptopTester {
	public static void main(String[] args) {
		
		Lenovo lenovo = new Lenovo();
		lenovo.developPrograms();
		lenovo.companyName="Lenovo";
		lenovo.price=45000;
		lenovo.ram="8GB RAM";
		System.out.println(lenovo.companyName+"   "+ lenovo.price +"     "+ lenovo.ram);
		
		Dell dell = new Dell();
		dell.developPrograms();
		dell.companyName="Dell";
		dell.price=35000;
		dell.ram="4GB RAM";
		System.out.println(dell.companyName+"    "+dell.price+"    "+dell.ram);
		
		
	}

}
