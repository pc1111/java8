package java8_09;

import java.util.Scanner;

public class Day0325_02 {

	public static void main(String[] args) {
		/* 1~25���� 5ĭ 5�ٷ� ���*/
		
		for( int i = 1; i <= 25 ; i++)
		{
			System.out.print(i + "\t");
			if(i % 5 == 0 )
				System.out.println();
			
		}
		System.out.println();
		for(int i = 1 ; i <= 25 ; i+=5)
		{
			for(int j = i ; j < i+5; j++)
				System.out.print(j + "\t");
			System.out.println();
		}

		// System.out.printf�� ����(format)�� �°� ����ϴ� �޼ҵ��Դϴ�
		// prontf�� c���� ������� ����ϴ� �޼ҵ��ε� �ڹٿ����� ����� �� �ִ�.
		// printf("�������", ����);
		// %d << decimal,10����
		// %f << float,�Ǽ� 
		// %lf << long float , double �Ǽ� >> c���� java�� ��
		// o << octa 8����
		// x << hexa 16����
		// b << binary 2����
		// s << String ���ڿ�
		// c << CHAR ���� 1��
		// - ������ �� �ִ� �� -
		// ���ʿ� ���ڸ� �Է��ϸ� �ڸ����� ����
		// %2d 10������ 2�ڸ� ���
		// %10d 10������ 10�ڸ� ���
		// ���� �տ� 0�� ���̸� �� ������ 0���� ä��ϴ�.
		// ���� ���ʿ� -�� ���̸� ���������մϴ�.
		
		System.out.println();
		int a = 1;
		for( int i = 1; i <= 5 ; i++)
		{
			if(i % 2 == 1)
			{
				for(int j = 1; j <=5 ; j++)
					System.out.printf("%02d\t", a++);
				a += 4;
				System.out.println();
			}
			else 
			{
				for(int j = 1; j <=5 ; j++)
				System.out.printf("%02d\t", a--);
				a += 6;
				System.out.println();
			}			
		}
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < i ; j++)
			{
				System.out.print(" ");
			}
			System.out.println("@");
		}
	
	}

}
