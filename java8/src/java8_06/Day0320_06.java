package java8_06;

import java.util.Scanner;

public class Day0320_06 {

	public static void main(String[] args) {

		// ����� ������� �Է¹޾Ƽ� ȭ�鿡 ����ϴ� ���α׷��� �ۼ�
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�������� �ܰ踦 �������ּ��� :  ");
		int a = s.nextInt();
		
		
		for(int i = 1; i <= 9 ; i++)
		{
			System.out.println(a + " * " + i + " = " + ( a * i ));
		}
		

	}

}
