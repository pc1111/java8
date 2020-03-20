package java8_06;

import java.util.Scanner;

public class Day0320_12 {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q 를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print("> ");
			inputString = s.nextLine();
			System.out.println(inputString);
		
		}while(!inputString.equals("q") && !inputString.equals("Q") );
		
		System.out.println();
		System.out.println("프로그램 종료");

	}

}
