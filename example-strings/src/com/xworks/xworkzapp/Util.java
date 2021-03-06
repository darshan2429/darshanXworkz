package com.xworks.xworkzapp;

public class Util {
	public Util() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName()+ " object is created");
	}
	
	public static void main(String[] args) {
		Util util =new Util();
		String name="KRS";
		String nm="KRS";
		System.out.println(name.equals(nm));//true
		System.out.println(name == nm);//true because same object
		
		String nmm=new String("KRS");
	
		System.out.println(name.equals(nmm));//true
		System.out.println(name == nmm);//false because different object
		
		String nm1=new String("KRS");
		System.out.println(nmm==nm1);//false because different object		
	}
}
