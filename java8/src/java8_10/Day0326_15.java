package java8_10;

import java.util.Scanner;

public class Day0326_15 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int bs[] = {2000, 2000, 500 ,2000};
		
		int user[] = new int[4];
		int pay = 0;
		
		for (int i = 0 ; i < user.length; i++)
		{
			user[i] = s.nextInt();
		}
		
		for (int i = 0 ; i < user.length; i++)
		{
			pay += user[i] * bs[i]; 
		}
		
		

	}

}
