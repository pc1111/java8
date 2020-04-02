package java8_15;

import java.util.Scanner;

public class HangmanEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String player;
		StringBuffer map;
		int[] arr = new int[26];
		int life = 6;
		int count = 0;
		
		player = s.nextLine();
		Hangman hgp = new Hangman(player);
		
		System.out.println(hgp.hiddenString);
		hgp.playGame();
		
		
		while(life > 0 && life < 30) {
			hgp.ready();
			player = s.nextLine();
			map = new StringBuffer(player);
			life = hgp.go(map);
			
			
		}

	}

}
