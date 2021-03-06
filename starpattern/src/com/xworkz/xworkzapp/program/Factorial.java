package com.xworkz.xworkzapp.program;

public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		int f = 1;
		int i = 1;
		Factorial ff = new Factorial();
//		ff.factfor(num,f);
//		ff.factwhile(num, f, i);
//		ff.factdo(num, f, i);
//		ff.factrecurtion(num, f, i);
		int fact=ff.factrecurtion1(num, f, i);
		System.out.println(fact);
	}

	public void factfor(int num,int f) {
		for (int i = 1; i <= num; i++) {
			f = f * i;
			System.out.println(f);
		}
	}

	public void factwhile(int num,int f,int i) {
		while (i <= num) {
			f = f * i;
			System.out.println(f);
			i++;
		}
	}

	public void factdo(int num,int f,int i) {
		do {
			f = f * i;
			System.out.println(f);
			i++;
		} while (i <= num);
	}

	public void factrecurtion(int num, int f, int i) {
		if (i<=num) {
			System.out.println(f);
			
			f=f*i;
			i++;
			factrecurtion(num, f, i);		
		}
	}
	
	public int factrecurtion1(int num, int f, int i) {
		if (i<=num) {
			f=f*i;
			i++;
			f=factrecurtion1(num, f, i);
		}
		return f;
	}
}
