package java8_06;

import java.util.Scanner;

public class Day0320_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int year,index = 0;
		
		System.out.println("������ �Ǻ��� �⵵ �Է� : ");
		year = s.nextInt();
		
		//���� �⵵�� 4�� ������ ����������, 100���� ������ �������� �ش� ���
		//�⵵�� 4�� ������ ��������, 100���� ������ ����������, �ٽ� 400���� ������ �������� ��
		
		
			if( year % 4 == 0)
			{
				index = 1;
				if(year % 100 == 0)
				{
					index = 0;
					if(year % 400 == 0)
					{
						index = 1;
					}
				}
			}
			if(index == 1)
				System.out.println(year+"���� �����̴�.");
			else
				System.out.println(year+"���� ������ �ƴϴ�.");
		
	}

}
