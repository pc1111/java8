package java8_08;

import java.util.Scanner;

public class Day0324_02 {

	public static void main(String[] args) {
		/*Hello, world!! 10�� ���*/
		
		for(int i = 0 ; i < 10 ; i ++)
		{
			System.out.println("Hello, world!! " + i);
		}
		/* �� ������� ���ڸ� �������Ѽ� ���*/
		
		for(int i = 9 ; i >= 0 ; i --)
		{
			System.out.println("Hello, world!! " + i);
		}
		
		/* @�� 5���� 7�� ��� */
		 
		for(int i = 0 ; i < 7 ; i ++)
		{
			for(int j = 0 ; j < 5; j++)
				System.out.print("@");
			System.out.println();
		}
		System.out.println();
		/* */
		for(int i = 0 ; i < 7 ; i ++)
		{
			for(int j = 1 ; j <= 5; j++)
			{
				if(j % 2 == 0)
					System.out.print("#");
				else
					System.out.print("@");
			}
			System.out.println();
		}
		/*���ڿ��� �Է¹޾Ƽ� for������ ����ϱ�*/
		Scanner s = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��� �ּ���.");
		System.out.println(" > ");
		String str = s.nextLine();
		
		for(int i = 0 ; i < str.length(); i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
	}

}
