package com.hackerrank.stringsmakinganagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		String first = "abce";
		String second = "abcd";

		System.out.println(numberNeeded(first, second));
	}

	public static int numberNeeded(String first, String second) {
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		for (char ch : first.toCharArray()) {
			int ct = count.containsKey(ch) ? count.get(ch) : 0;
			count.put(ch, (ct + 1));
		}
		System.out.println("first map: " + Arrays.toString(count.entrySet().toArray()));

		for (char ch : second.toCharArray()) {
			int ct = count.containsKey(ch) ? count.get(ch) : 0;
			count.put(ch, (ct - 1));
		}
		System.out.println("second map: " + Arrays.toString(count.entrySet().toArray()));

		List<Integer> values = new ArrayList<Integer>(count.values());
		System.out.println("values: " + values);
		int total = 0;
		for (Integer v : values) {
			total += Math.abs(v);
		}
		return total;
	}
}
