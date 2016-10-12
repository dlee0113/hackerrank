package com.hackerrank.binarysearchicecreamparlor;

import java.util.Arrays;

class IceCream implements Comparable {
	int flavor;
	int index;

	public IceCream(int flavor, int index) {
		this.flavor = flavor;
		this.index = index;
	}

	public int compareTo(Object o) {
		IceCream iceCream = (IceCream) o;
		
		return this.flavor - iceCream.flavor;
	}

//	@Override
//	public boolean equals(Object o) {
//		
//	}
	
	@Override
	public String toString() {
		return "IceCream [flavor=" + flavor + ", index=" + index + "]";
	}
}

public class Solution {

	public static int binarySearch(int first, int last, IceCream[] arr, int search) {
		int index = -1;
		
		while (first <= last) {
			int mid = first + (last - first) / 2;
			
			if (arr[mid].flavor == search) {
				index = arr[mid].index;
				
				break;
			}
			else {
				// data is in upper half
				if (arr[mid].flavor < search) {
					first = mid + 1;
				}
				// data is in lower half
				else {
					last = mid - 1;
				}
			}
		}
		
		return index;
	}

	public static void main(String[] args) {

//		int t;
		int n = 5;
		int m = 4;

		IceCream[] arr = new IceCream[5];

		IceCream iceCream1 = new IceCream(1, 1);
		IceCream iceCream2 = new IceCream(4, 2);
		IceCream iceCream3 = new IceCream(5, 3);
		IceCream iceCream4 = new IceCream(3, 4);
		IceCream iceCream5 = new IceCream(2, 5);

		arr[0] = iceCream1;
		arr[1] = iceCream2;
		arr[2] = iceCream3;
		arr[3] = iceCream4;
		arr[4] = iceCream5;

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		int index = binarySearch(0, 4, arr, 2);
//		System.out.println(index);
		
		for (int i = 0; i < n - 1; i++) {
			int search = m - arr[i].flavor;
			
			if (search >= arr[i].flavor) {
				int index = binarySearch(i + 1, n - 1, arr, search);
				if (index != -1) {
					System.out.println(Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
					break;

				}
			}
		}
	}
}