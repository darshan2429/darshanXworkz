package com.xworkz.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringTester {
	public static void main(String[] args) {

		String bengaluru = "Bangalore is also called as it hub"
				+ " Bangalore recently awarded best city to live Bangalore is also called as green city Bangalore is capital city of karnataka";

		findLengthOfArray(bengaluru);
		addingStringIntoCollection(bengaluru);
		removeDuplicate(bengaluru);

	}

	public static void findLengthOfArray(String str) {
		System.out.println("******************************************");
		String[] split = str.split(" ");
		System.out.println("size of the string is: " + split.length);
		System.out.println("******************************************");
	}

	public static void addingStringIntoCollection(String str) {
		System.out.println("******************************************");
		List<String> arrayList = new ArrayList<String>();
		arrayList.add(str);
		System.out.println(arrayList);
		System.out.println("******************************************");
	}

	public static void removeDuplicate(String str) {
		System.out.println("******************************************");
		Set<String> set = new LinkedHashSet<String>();
		String[] split = str.split(" ");
		for (String string : split) {
			set.add(string);
		}

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println("******************************************");
	}

}
