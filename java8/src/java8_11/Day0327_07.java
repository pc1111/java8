package java8_11;

import java.util.Scanner;

public class Day0327_07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int sum = 0, count = 0;
		for(int i = 1 ; i <= a; i++)
		{
			if(i % 5 == 0)
			{
				sum +=i;
				count++;
			}
		}
		System.out.println("1 ~ " + a + "까지 5의 배수들의 합 : " + sum + "\n1 ~ " + a + "까지 5의 배수들의 개수 : " + count);

	}

}
