package com.hackerrank.recursionfibonaccinumbers;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		System.out.println(solution.fibonacci(6));
	}
	
	// fibonacci(0) = 0
	// fibonacci(1) = 1
	// fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
    public static int fibonacci(int n) {
    	if (n == 0) {
    		return 0;
    	}
    	else if (n == 1) {
    		return 1;
    	}
    	
    	return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
