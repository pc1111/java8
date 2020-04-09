package java8_11;

import java.util.Scanner;

public class Day0327_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력해주세요");
		int a = s.nextInt(),b = s.nextInt();
		
		if(a > b)
		{
			System.out.println("큰 값 : a, " + a + "\n작은 값 : b, " + b);
		}
		else if(a < b)
		{
			System.out.println("큰 값 : b, " + b + "\n작은 값 : a, " + a);
		}
		else
			System.out.println("똑같다.");
		

	}

}
