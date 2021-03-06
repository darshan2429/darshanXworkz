package com.xworkz.xworkzapp.program;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(array);

		for (int i = 0; i < array.length; i++)
			System.out.println(array[i] + " ");
	}

	void bubbleSort(int[] array) {
		int i = 0;
		while (i < array.length) {
			int j = i + 1;
			while (j < array.length) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				j++;
			}
			i++;
		}
	}
}
