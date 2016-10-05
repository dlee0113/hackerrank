package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashTablesRansomNote {
	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	public HashTablesRansomNote(String magazine, String note) {
		magazineMap = new HashMap<String, Integer>();
		noteMap = new HashMap<String, Integer>();
		
		for (String token : magazine.split(" ")) {
			if (magazineMap.get(token) == null) {
				magazineMap.put(token, 1);
			}
			else {
				magazineMap.put(token, magazineMap.get(token) + 1);
			}
        }
		
		for (String token : note.split(" ")) {
			if (noteMap.get(token) == null) {
				noteMap.put(token, 1);
			}
			else {
				noteMap.put(token, noteMap.get(token) + 1);
			}
		}
		
		System.out.println(Arrays.toString(magazineMap.entrySet().toArray()));
		System.out.println(Arrays.toString(noteMap.entrySet().toArray()));
    }

	public boolean solve() {
		for (Entry<String, Integer> entry : noteMap.entrySet()) {
			String noteMapkey = entry.getKey();
			Integer noteMapValue = entry.getValue();
			
			// word is in note is not found in magazine
			if (magazineMap.get(noteMapkey) == null) {
				return false;
			}
			else {
				Integer magazoneMapValue = magazineMap.get(noteMapkey);
				
				// word in note needs more instances of word in magazine
				if (noteMapValue > magazoneMapValue) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String magazine = "today night";
		String note = "today today";

		HashTablesRansomNote s = new HashTablesRansomNote(magazine, note);
		
		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
