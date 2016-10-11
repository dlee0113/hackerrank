package com.hackerrank.queuesataleoftwostacks;

import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		 MyQueue<Integer> queue = new MyQueue<Integer>();
		 
		 queue.enqueue(42);
		 System.out.println(queue.dequeue());
		 
		 queue.enqueue(14);
		 System.out.println(queue.peek());
		 
		 queue.enqueue(28);
		 System.out.println(queue.peek());
		 
		 queue.enqueue(60);
		 queue.enqueue(78);
		 
		 System.out.println(queue.dequeue());
		 System.out.println(queue.dequeue());
	}
	
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
        	stackNewestOnTop.push(value);
        }

        public T peek() {
        	// once you have populated your dequeue stack for performing either a pop or front operation, 
        	// your dequeue stack is still in the right state for subsequent pop or top operations, until it's empty. 
        	// only when it's empty you dequeue again to perform further pop or front operations.
        	if (stackOldestOnTop.isEmpty()) {
            	while (!stackNewestOnTop.isEmpty()) {
            		stackOldestOnTop.push(stackNewestOnTop.pop());
            	}
        	}
        	
        	return stackOldestOnTop.peek();
        }

        public T dequeue() {
        	if (stackOldestOnTop.isEmpty()) {
	        	while (!stackNewestOnTop.isEmpty()) {
	        		stackOldestOnTop.push(stackNewestOnTop.pop());
	        	}
        	}
        	
        	return stackOldestOnTop.pop();
        }
    }
}
