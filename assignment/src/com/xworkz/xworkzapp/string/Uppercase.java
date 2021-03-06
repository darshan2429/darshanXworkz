package com.xworkz.xworkzapp.string;

import java.util.Scanner;

public class Uppercase {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the string");
		String s=scanner.next();
		String ss=LowerToUpper(s);
		System.out.println(ss);
	}

	static String LowerToUpper(String s) {
		String result = "";
		char ch =' ';
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ) {
				ch = (char) (s.charAt(i) -  32);
			}
			// else keep the same alphabet or any character
			else {
				ch = (char) (s.charAt(i));
			}

			result += ch; 
		}
		return result;
	}

}
