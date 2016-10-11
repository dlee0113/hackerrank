package com.hackerrank.treesisthisabinarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		Node node1 = new Node();
		node1.data = 1;
		Node node2 = new Node();
		node2.data = 2;
		Node node3 = new Node();
		node3.data = 3;
		Node node4 = new Node();
		node4.data = 5;
		Node node5 = new Node();
		node5.data = 8;
		Node node6 = new Node();
		node6.data = 6;
		Node node7 = new Node();
		node7.data = 7;
		
		node1.right = node2;
		node2.right = node3;
		node3.right = node4;
		node4.left = node5;
		node4.right = node6;
		node6.right = node7;
		
		
		Solution solution = new Solution();
		List<Integer> nodeList = new ArrayList<Integer>();
//		solution.printInorder(node1);
		System.out.println(solution.checkBST(node1));
	}

	Node previousNode;
	boolean flag = true;
	
	boolean checkBST(Node root) {
		if (flag == false) {
			return flag;
		}
		
		if (root.left != null) {
			checkBST(root.left);
		}
		
		if (previousNode != null) {
			System.out.println("prev: " + previousNode.data);
		}
		else {
			System.out.println("prev: " + null);
		}
		
		System.out.println("curr: " + root.data);
		
		if (previousNode != null && previousNode.data > root.data) {
			System.out.println("false found");
			flag = false;
		}
		
		previousNode = root;
		
		if (root.right != null) {
			checkBST(root.right);
		}
		
		return flag;
	}
	
	void printInorder(Node root) {
		if (root.left != null) {
			printInorder(root.left);
		}
		
		System.out.print(root.data + " ");
		
		if (root.right != null) {
			printInorder(root.right);
		}
	}
}
