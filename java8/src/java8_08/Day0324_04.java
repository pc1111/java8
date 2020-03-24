package java8_08;

import java.util.Scanner;

public class Day0324_04 {

	public static void main(String[] args) {
		/*몇줄을 출력할지 입력 받아서
		 * 
		 *  @
		 *  @@
		 *  @@@
		 *  @@@@
		 *  위와 같은 형태로 출력
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇 줄을 출력할것입니까? : ");
		int temp = s.nextInt();
		
		for(int i = 0 ; i < temp ; i ++)
		{
			for(int j = 0 ; j <= i ; j++)
				System.out.print("@");
			System.out.println();
		}

	}

}
