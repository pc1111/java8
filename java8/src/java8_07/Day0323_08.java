package java8_07;

public class Day0323_08 {

	public static void main(String[] args) {
		/*1~10���� ���*/
		for(int i = 1; i <= 10 ; i++)
			System.out.print(i + " ");
		System.out.println();
		/*10 ~ 1���� ���*/
		for(int i = 10; i > 0; i--)
			System.out.print(i + " ");
			System.out.println();
		/* ���� ��� ����(#)���� ���*/
		for(int i = 1; i <= 10 ; i++)
		{
			for(int j = 0 ; j < i ; j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 10; i > 0 ; i--)
		{
			for(int j = 0 ; j < i ; j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		

	}

}
