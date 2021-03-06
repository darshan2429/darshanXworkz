package com.xworkz.xworkzapp.program;

import java.util.Scanner;

public class Fibonacci {
	static int count;
	static char enter;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int s = 0;
		int n = 1;
		Fibonacci fibonacci = new Fibonacci(s,n);
	}
	
	public Fibonacci(int s,int n) {
		fibofor(s, n);
		// TODO Auto-generated constructor stub
	}

	public void fibofor(int s, int n) {
		System.out.println("\n if u find fibo number press y ");
		enter = sc.next().charAt(0);
		if (enter == 'y')
			System.out.println(" \n enter the number :");
		count = sc.nextInt();
		System.out.println("the fibonaci series is :");
		for (int i = 1; i <= count; i++) {
			System.out.print(s + " ");
			int sum = s + n;
			s = n;
			n = sum;
		fibofor(s, n);	
		}
	}
}
