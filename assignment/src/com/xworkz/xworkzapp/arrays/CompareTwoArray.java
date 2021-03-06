package com.xworkz.xworkzapp.arrays;

import java.util.Arrays;

public class CompareTwoArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3, 5 };
		array(arr1, arr2);
	}

	public static void array(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			if ((arr1[i] == arr2[i])) {
				System.out.println("same");
			} else
				System.out.println("different");
		}
	}
}
