package java8_09;

import java.util.Scanner;

public class Day0325_01 {

	public static void main(String[] args) {
		/*
		 * @
		 * @@
		 * @@@
		 * @@@@
		 * @@@@*/
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		
		for(int i = 0;i<m;i++)
		{
			for(int j  = 0 ; j <= i ; j++)
					System.out.print("@");
			System.out.println();
		}
		
		System.out.println();
		/*상하 반전*/
		for(int i = m;i > 0;i--)
		{
			for(int j  = i ; j > 0 ; j--)
					System.out.print("@");
			System.out.println();
		}

		/*좌우 반전*/
		System.out.println();
		for(int i = 0;i<m;i++)
		{
			for(int j  = m-1 ; j > i ; j--)
					System.out.print(" ");
			for(int j = 0 ; j <= i; j++ )
					System.out.print("@");
			System.out.println();
		}
		/*정삼각형*/
		
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = m-1 ; j > i ; j--)
			{
				System.out.print(" ");
			}
			for(int j = 0 ; j <= i ;j++)
			{	
				System.out.print("@");
			}
			for(int j = 1 ; j <= i;j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
