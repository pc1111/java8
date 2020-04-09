package java8_11;

import java.util.Scanner;

public class Day0327_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] me = new int[4];
		int arg = 0;
		for(int i = 0 ; i < 4 ; i ++)
			me[i] = s.nextInt();
		
		for(int i = 0 ; i < 4; i++)
		{
			if(i < i/2)
				arg += me[i] % 20;
			else
				arg += me[i] % 20;
		}
		
		

	}

}
