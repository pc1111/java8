package java8_07;

import java.util.Scanner;

public class Day0323_16 {

	public static void main(String[] args) {
		/*구구단을 2단부터 9단까지 출력하세요*/
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 2 ; i <= 9 ; i++)
		{
			System.out.println( i + "단" );
			for(int j = 1; j <= 9; j++)
				System.out.print(i + " * " +  j + " = " + ( i * j ) + " \t ");
			System.out.println("");
		}
		
		/*몇단을 출력할지 입력받아서 출력해주세요.*/
		int temp = s.nextInt();
		
		System.out.println(temp + "단");
		for(int i = 1; i < 9 ; i++)
			System.out.println(temp + " * " + i + " = " + (temp*i) + "\t");
		
		s.close();

	}

}
