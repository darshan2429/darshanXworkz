package com.xworkz.xworkzapp.arrays;

public class MultidimentionalArray {

	public static void main(String[] args) {

		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][][] num1 = { { { 1, 2 }, { 4, 5 } }, 
				{ { 5, 6 }, { 7, 8} } };
		MultidimentionalArray array = new MultidimentionalArray();
		// array.array(num);
		array.array1(num1);
	}

	public void array(int[][] num) {
		System.out.println(num.length);
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.println("arr[" + i + "]" + "[" + j + "]" + num[i][j]);
			}
		}
	}

	public void array1(int[][][] num1) {
		System.out.println(num1.length);
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				for (int k = 0; k < num1.length; k++) {
					System.out.println("arr[" + i + "]" + "[" + j + "]" + "[" + k + "]" + num1[i][j][k]);
				}
			}
		}
	}

}
