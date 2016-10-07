package com.hackerrank.stacksbalancedbrackets;

import java.util.Stack;

public class Solutioin {
	public static void main(String[] args) {
		System.out.println(isBalanced("{[()]}"));
		System.out.println(isBalanced("{[(])}"));
		System.out.println(isBalanced("{{[[(())]]}}"));
		System.out.println(isBalanced("()[]{}"));
		System.out.println(isBalanced("]"));
		System.out.println(isBalanced("["));
	}
	
	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		
		for (char expressionChar : expression.toCharArray()) {
			if (expressionChar == '{' || expressionChar == '[' || expressionChar == '(') {
				stack.push(expressionChar);
			}
			else if (expressionChar == '}') {
				if (stack.isEmpty() || stack.peek() != '{') {
					return false;
				}
				else {
					stack.pop();
				}
			}
			else if (expressionChar == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					return false;
				}
				else {
					stack.pop();
				}
			}
			else if (expressionChar == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					return false;
				}
				else {
					stack.pop();
				}
			}
		}
		
		if (stack.isEmpty()) {
			return true;
		}
		
		return false;
	}
}
