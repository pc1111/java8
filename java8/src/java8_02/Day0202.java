package java8_02;

import java.util.Scanner;

public class Day0202 {

	public static void main(String[] args) {
		
		final int D = 1;
		Scanner s = new Scanner(System.in);
		
		int number1, number2;
		System.out.print("ù��° ���ڸ� �Է��� �ּ��� : ");
		number1 = s.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��� �ּ��� : ");
		number2 = s.nextInt();
		
		System.out.println("�� ���� ���� : " + (number1 + number2));
		
		s.close();
	}

}
