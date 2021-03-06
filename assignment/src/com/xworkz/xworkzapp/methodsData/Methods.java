package com.xworkz.xworkzapp.methodsData;

public class Methods {

	public String addTwoNumber(String nm, String nm1) {
		return nm + nm1;

	}

	public byte byteArray(byte a) {
		return a;
	}

	public int addTwoNumber(int a, int b) {
		int i = a + b;
		return i;
	}

	public float addTwoNumber(float a, float b) {
		float f = a + b;
		return f;
	}

	public double addTwoNumber(double a, double b) {
		double d = a + b;
		return d;
	}

	public long addTwoNumber(long a, long b) {
		long l = a + b;
		return l;
	}
	public boolean booleanValue(int number, int number1) {
		if (number == number1) {
			return true;
		} else {
			return false;
		}
	}

	public int[] addTwoNumber(int[] a, int[] b) {

		int[] sum = new int[3];
		for (int i = 0; i <= b.length; i++) {
			if (i < b.length) {
				sum[i] = a[i] + b[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		Methods methods = new Methods();

		String nmm = methods.addTwoNumber("darshan", "kumar");
		System.out.println(nmm);

		int integ = methods.addTwoNumber(10, 20);
		System.out.println(integ);

		float flo = methods.addTwoNumber(20.0f, 30.0f);
		System.out.println(flo);

		double dou = methods.addTwoNumber(30.0, 40.0);
		System.out.println(dou);

		long lon = methods.addTwoNumber(40l, 50l);
		System.out.println(lon);

		boolean boo = methods.booleanValue(10, 10);
		System.out.println(boo);

		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 40, 50, 60 };
		int[] inn = methods.addTwoNumber(arr1, arr2);
		for (int i = 0; i < inn.length; i++) {
			System.out.print(inn[i]+ " ");
		}

	}
}
