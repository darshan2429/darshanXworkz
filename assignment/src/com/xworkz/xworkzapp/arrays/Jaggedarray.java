package com.xworkz.xworkzapp.arrays;

public class Jaggedarray {
	public static void main(String[] args) {
		Jaggedarray jaggedarray = new Jaggedarray();
		int[][] ar = new int[5][];
		// ar[0] = new int[4];
		// ar[1] = new int[5];
		
		jaggedarray.jag(ar);
	}

	public void jag(int[][] ar) {

		for (int i = 0; i < ar.length; i++)
			ar[i] = new int[i + 1];

		int count = 0;
		for (int i = 0; i < ar.length; i++)
			for (int j = 0; j < ar[i].length; j++)
				ar[i][j] = count++;

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}

}
