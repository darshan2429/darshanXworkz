package com.xworkz.xworkzapp.arrays;

import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter string ");
		String st=scanner.nextLine();
		System.out.println("enter character");
		char ch=scanner.next().charAt(0);
		CountChar char1=new CountChar();
		char1.charact(st,ch);
		}
	

	public void charact(String st,char ch) {
		int count = 0;

		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i)==ch)
			// if(st.charAt(i) != ' ')
			count++;
		}

		System.out.println(count);
	}

}
