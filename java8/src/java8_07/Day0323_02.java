package java8_07;

import java.util.Scanner;

public class Day0323_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� �ϳ��� �Է��� �ּ��� : ");
		int a = s.nextInt();
		
		if(a % 2 == 0) System.out.println("¦��");
		else System.out.println("Ȧ��");

		s.close();
	}

}
