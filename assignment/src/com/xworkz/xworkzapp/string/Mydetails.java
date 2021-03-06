package com.xworkz.xworkzapp.string;

public class Mydetails {

	public static void main(String[] args) {
		String name = "hello darshan how are you darshan. By Darshan";
		String name1 = "darshan";
		String nam = "mangalam";
		String name2 = "BASAVARAJ";

		Mydetails mydetails = new Mydetails();
		mydetails.replacing(name);
		mydetails.split(name);
		mydetails.upperCase(name1);
		mydetails.lowerCase(name2);
		mydetails.stringToInt();
		mydetails.reverseString(name1);
		mydetails.duplicate();
		String unique=mydetails.uniquevalue();
		System.out.println(unique);
	}

	public void replacing(String name) {
		String st = new String("darshan");
		System.out.println(name);
		System.out.println(name.replace("darshan", "ali"));
		System.out.println(name.replaceAll(name, "Welcome to xworkz"));
	}

	public void split(String name) {
		String[] st1 = name.split(" ");
		for (int i = 0; i < st1.length; i++) {
			System.out.println(st1[i]);
		}
	}

	public void upperCase(String name1) {

		String upper = name1.toUpperCase();
		System.out.println("UPPER CASE =" + upper);
	}

	public void lowerCase(String name2) {
		String lower = name2.toLowerCase();
		System.out.println("LOWER CASE =" + lower);
	}

	public void stringToInt() {
		String value = "1125";
		int val = Integer.parseInt(value);
		System.out.println(val);
	}

	public void reverseString(String name1) {
		for (int i = name1.length() - 1; i >= 0; i--) {
			String s = "";
			s = s + name1.charAt(i);
			System.out.print(s);
		}
	}

	public void duplicate() {
		String nam = "malayalam";
		for (int i = 0; i < nam.length(); i++) {
			for (int j = i + 1; j < nam.length(); j++) {
				if (nam.charAt(i) == nam.charAt(j)) {
					System.out.println(nam.charAt(i));
					break;
				}
			}
		}
	}

	public String uniquevalue() {
		String nam = "darshanda";
		String res="";
		for (int i = 0; i < nam.length(); i++) {
			int count=0;
			for (int j = 0; j < res.length(); j++) {
				if(res.charAt(j)==nam.charAt(i)) {
					count++;
				}
			}
			if(count==0) {
				res=res+nam.charAt(i);
			}
		}
		return res;  
	}
}
