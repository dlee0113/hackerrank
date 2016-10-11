package com.hackerrank.sortingcomparator;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public static void main(String[] args) {
		Player player1 = new Player("amy", 100);
		Player player2 = new Player("david", 100);
		Player player3 = new Player("heraldo", 50);
		Player player4 = new Player("aakansha", 75);
		Player player5 = new Player("aleksa", 150);
		
		Player[] player = {player1, player2, player3, player4, player5};
		Checker checker = new Checker();

		Arrays.sort(player, checker);
		
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}

class Checker implements Comparator<Player> {
	public int compare(Player player1, Player player2) {
		if (player2.score > player1.score) {
			return 1;
		}
		else if (player2.score < player1.score) {
			return -1;
		}
		else {
			if (player1.name.compareTo(player2.name) > 0) {
				return 1;
			}
			else if (player1.name.compareTo(player2.name) < 0) {
				return -1;
			}
			
			return 0;
		}
	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
