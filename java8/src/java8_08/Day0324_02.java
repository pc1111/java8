package java8_08;

import java.util.Scanner;

public class Day0324_02 {

	public static void main(String[] args) {
		/*Hello, world!! 10줄 출력*/
		
		for(int i = 0 ; i < 10 ; i ++)
		{
			System.out.println("Hello, world!! " + i);
		}
		/* 위 결과물을 숫자만 반전시켜서 출력*/
		
		for(int i = 9 ; i >= 0 ; i --)
		{
			System.out.println("Hello, world!! " + i);
		}
		
		/* @를 5개씩 7줄 출력 */
		 
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
		/*문자열을 입력받아서 for문으로 출력하기*/
		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력해 주세요.");
		System.out.println(" > ");
		String str = s.nextLine();
		
		for(int i = 0 ; i < str.length(); i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
	}

}
