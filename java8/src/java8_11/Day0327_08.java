package java8_11;

import java.util.Scanner;

public class Day0327_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� 2���� �Է����ּ���");
		int a = s.nextInt(),b = s.nextInt();
		
		if(a > b)
		{
			System.out.println("ū �� : a, " + a + "\n���� �� : b, " + b);
		}
		else if(a < b)
		{
			System.out.println("ū �� : b, " + b + "\n���� �� : a, " + a);
		}
		else
			System.out.println("�Ȱ���.");
		

	}

}
