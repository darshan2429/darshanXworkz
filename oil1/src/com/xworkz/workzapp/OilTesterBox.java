package com.xworkz.workzapp;

public class OilTesterBox {
	public static void main(String[] args) {

		int i = 10;
		// boxing
		Integer integer = new Integer(i);
		System.out.println(integer);
		// unboxing
		int i1 = integer.intValue();
		System.out.println(i1);

		double value = 20.00;
		// auto-boxing
		Double double1 = value;
		System.out.println(double1);
		// auto-unboxing
		double d = double1;
		System.out.println(d);

		float f = 2000.0f;
		// boxing
		Float float1 = new Float(f);
		System.out.println(float1);
		// unboxing
		float f1 = float1.floatValue();
		System.out.println(f1);

		boolean b = true;
		// auto boxing
		Boolean boolean1=b;
		System.out.println(boolean1);
		//auto unboxing 
		boolean c=boolean1;
		System.out.println(c);
		
		char a='A';
		//boxing
		Character ch=new Character(a);
		System.out.println(ch);
		//unboxing
		char e=ch.charValue();
		System.out.println(e);
		
		long aa1=987376;
		//boxing
		Long long1=new Long(aa1);
		System.out.println(long1);
		//unboxing
		long l=long1.longValue();
		System.out.println(l);
		
		byte g=123;
		Byte byte1=new Byte(g);
		System.out.println(byte1);
		byte h1=byte1.byteValue();
		System.out.println(h1);
		

	}

}
