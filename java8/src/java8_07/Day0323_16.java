package java8_07;

import java.util.Scanner;

public class Day0323_16 {

	public static void main(String[] args) {
		/*�������� 2�ܺ��� 9�ܱ��� ����ϼ���*/
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 2 ; i <= 9 ; i++)
		{
			System.out.println( i + "��" );
			for(int j = 1; j <= 9; j++)
				System.out.print(i + " * " +  j + " = " + ( i * j ) + " \t ");
			System.out.println("");
		}
		
		/*����� ������� �Է¹޾Ƽ� ������ּ���.*/
		int temp = s.nextInt();
		
		System.out.println(temp + "��");
		for(int i = 1; i < 9 ; i++)
			System.out.println(temp + " * " + i + " = " + (temp*i) + "\t");
		
		s.close();

	}

}
