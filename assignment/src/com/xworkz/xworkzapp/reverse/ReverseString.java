package com.xworkz.xworkzapp.reverse;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {

		String nmmm = "welcome to talent quest";
		String name = "darshan is a good boy";
		System.out.println("string " + name);

		// convert string to string array
		String[] name1 = name.split(" ");
		String name2 = Arrays.toString(name1);
		System.out.println("string array " + name2);
		// converting string to chararray
		char[] revName = name.toCharArray();

		for (int i = revName.length - 1; i >= 0; i--) {

			System.out.print(revName[i]);
		}
		duplicate(nmmm);

	}

	public static void duplicate(String nmmm) {
		char[] nm = nmmm.toCharArray();
		System.out.println(nm);
		for (int i = 0; i < nm.length; i++) {
			if (nm[i] == nm[1]) {
				System.out.println(nm[i] + " ");
				
			}
		}
	}

}
