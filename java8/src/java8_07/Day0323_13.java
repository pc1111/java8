package java8_07;

import java.util.Scanner;

public class Day0323_13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� ���� ����Ͻðڽ��ϱ�? : ");
		
		int line = s.nextInt();
		
		for(int i = line; i > 0 ; i--)
		{
			for(int j = 0; j < i ; j++)
			{
				if(j % 2 == 0)
					System.out.print("$");
				else
					System.out.print("@");
			}
			System.out.println();
		}

	}

}
