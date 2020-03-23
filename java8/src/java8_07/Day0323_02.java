package java8_07;

import java.util.Scanner;

public class Day0323_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력해 주세요 : ");
		int a = s.nextInt();
		
		if(a % 2 == 0) System.out.println("짝수");
		else System.out.println("홀수");

		s.close();
	}

}
