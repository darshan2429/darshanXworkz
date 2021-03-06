package com.xworkz.xworkzapp;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class StarPrgm {
	public static void main(String[] args) {
		int n = 5;
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == 2)
					System.out.print(i + "" + j + "  ");

				else if (i == 2)
					System.out.print(i + "" + j + "  ");

				else if (i == 1 && j == 3)
					System.out.print(i + "" + j + "  ");

				else
					System.out.print("    ");

				// if (i + j == 4 && i >= mid)
				// System.out.print(i + "" + j+" ");
				//
				// else if (i == j && i >= mid)
				// System.out.print(i + "" + j+" ");
				//
				// else if (i == 4)
				// System.out.print(i + "" + j+" ");
				//
				// else if (j==2&&i>mid)
				// System.out.print(i + "" + j+" ");
				//
				// else
				// System.out.print(" ");
			}
			System.out.println();
		}

	}

}
