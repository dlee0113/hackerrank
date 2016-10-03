package hackerrank.hackerrank;

import java.util.Arrays;

public class ArraysLeftRotation {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(arrayLeftRotation(a, a.length, 3)));
	}
	
	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		for (int j = 0; j < k; j++) {
			int tmp = a[0];
			for (int i = 1; i < n; i++) {
				a[i - 1] = a[i];
			}
			a[a.length - 1] = tmp;
		}
		
		return a;
    }
}
