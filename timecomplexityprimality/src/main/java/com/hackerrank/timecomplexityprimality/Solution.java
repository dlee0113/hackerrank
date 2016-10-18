package com.hackerrank.timecomplexityprimality;

public class Solution {
	public static void main(String[] args) {
		int[] numbers = {12, 5, 7};
//		int[] numbers = {1000000000, 1000000001, 1000000002, 1000000003, 1000000004};
		
		for (int number : numbers) {
			System.out.println(isPrime(number));
		}
	}
	
	private static String isPrime(int number) {
		if (number < 2) {
			return "Not prime";
		}
		
		//check if n is a multiple of 2
		if (number > 2 && number % 2 == 0) {
			return "Not prime";
		}
			
		// if not, then just check the odds
		for (int i = 3; i * i <= number; i += 2) {
			System.out.println(i);
			
			if (number % i == 0)
				return "Not prime";
		}
		
		return "Prime";
	}
}
