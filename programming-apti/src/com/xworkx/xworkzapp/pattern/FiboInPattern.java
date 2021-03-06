package com.xworkx.xworkzapp.pattern;


public class FiboInPattern {
	public static void main(String[] args) {
		FiboInPattern angle = new FiboInPattern();
		angle.fibo();
	}
	
	
	void fibo() {
		int n = 5;int a=0;int b=1;int sum=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1) {
					sum=a+b;
					System.out.print( a+" ");
					a=b;
					b=sum;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
