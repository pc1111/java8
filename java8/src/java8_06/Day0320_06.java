package java8_06;

import java.util.Scanner;

public class Day0320_06 {

	public static void main(String[] args) {

		// 몇단을 출력할지 입력받아서 화면에 출력하는 프로그램을 작성
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("구구단의 단계를 선택해주세요 :  ");
		int a = s.nextInt();
		
		
		for(int i = 1; i <= 9 ; i++)
		{
			System.out.println(a + " * " + i + " = " + ( a * i ));
		}
		

	}

}
