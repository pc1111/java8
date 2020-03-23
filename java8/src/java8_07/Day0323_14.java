package java8_07;

import java.util.Scanner;

public class Day0323_14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("몇 줄을 출력하시겠습니까? : ");
		
		int line = s.nextInt();
		if(line % 2 == 1) {
			for(int i = 0 ; i <= line; i++)
			{
				if(line / 2 > i)
				{
					for(int j = 0 ; j <= i;j++)
					{
						System.out.print("$");
					}
				}
				else
				{
					for(int j = i; j < line; j++)
					{
						System.out.print("$");
					}
					
				}
				System.out.println("");
			}
		}
		else 
			{
			System.out.println("짝수는 허용하지 않습니다.");
			System.exit(0);
		}
		
		s.close();
	}

}
