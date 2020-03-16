package java8_02;

import java.util.Scanner;

public class Day0202 {

	public static void main(String[] args) {
		
		final int D = 1;
		Scanner s = new Scanner(System.in);
		
		int number1, number2;
		System.out.print("첫번째 숫자를 입력해 주세요 : ");
		number1 = s.nextInt();
		System.out.print("두번째 숫자를 입력해 주세요 : ");
		number2 = s.nextInt();
		
		System.out.println("두 수의 합은 : " + (number1 + number2));
		
		s.close();
	}

}
