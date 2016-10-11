package com.hackerrank.sortingbubblesort;

public class Solution {
	public static void main(String[] args) {
		int[] array = { 3, 2, 1 };

		int numberOfSwap = bubbleSort(array);

		System.out.println("Array is sorted in " + numberOfSwap + " swaps.");
		System.out.println("First Element: " + array[0]);
		System.out.println("Last Element: " + array[array.length - 1]);
	}

	public static int bubbleSort(int[] array) {
		boolean isSorted = false;
		int numberOfSwap = 0;
		// mark last index of unsorted portion of array and avoid iterating
		// sorted portion of array
		int lastIndex = array.length - 1;

		do {
			isSorted = false;

			for (int i = 0; i < lastIndex; i++) {
				if (array[i] > array[i + 1]) {
					int tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;

					isSorted = true;
					numberOfSwap++;
				}
			}

			lastIndex--;
		} while (isSorted);

		return numberOfSwap;
	}
}
