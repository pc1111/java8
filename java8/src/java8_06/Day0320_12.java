package java8_06;

import java.util.Scanner;

public class Day0320_12 {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q �� �Է��ϼ���.");
		
		Scanner s = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print("> ");
			inputString = s.nextLine();
			System.out.println(inputString);
		
		}while(!inputString.equals("q") && !inputString.equals("Q") );
		
		System.out.println();
		System.out.println("���α׷� ����");

	}

}
