package java8_08;

import java.util.Scanner;

public class Day0324_08 {

	public static void main(String[] args) {
		// �� ���� ���� �ִ� ����� * �ּ� ����� 
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt() ,b = s.nextInt();
		
		int min = 1,max = 1;
		
		for(int i = 1 ; i <= Integer.MAX_VALUE ; i++)
		{
			if(i % a == 0 && i % b ==0 )
			{
				max *= i;
				break;
			}
		} 
		min = a * b / max;
		System.out.println("�ּ� ����� : " + min + ", �ִ� ����� : " + max);
		s.close();

	}

}
