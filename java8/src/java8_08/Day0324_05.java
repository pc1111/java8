package java8_08;

import java.util.Scanner;

public class Day0324_05 {

	public static void main(String[] args) {
		/*몇줄을 출력할지 입력 받아서
		 * 
		 *  @
		 *  @@
		 *  @@@
		 *  @@@@
		 *  @@@
		 *  @@
		 *  @
		 *  위와 같은 형태로 출력
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇 줄을 출력할것입니까? (단 홀수만 입력해주시기바랍니다.)");
		int line = s.nextInt();
		
		if(line % 2 == 1)
		{
			for(int i = 0 ; i < line ;i ++)
			{
				if(line /2 > i)
				{
					for(int j = 0; j <= i ; j++)
					{
						System.out.print("@");
					}
				}
				else
				{
					for(int j = line ; j > i; j --)
					{
						System.out.print("@");
					}
				}
				System.out.println("");
			}
		}

	}

}
