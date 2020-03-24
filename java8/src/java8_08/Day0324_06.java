package java8_08;

import java.util.Scanner;

public class Day0324_06 {

	public static void main(String[] args) {
		/*구구단 게임 10회 */
		Scanner s = new Scanner(System.in);
		
		int a,b,c;
		
		long strTime = System.currentTimeMillis();
		for(int i = 1 ; i <= 10 ; i++)
		{
			a = (int)(Math.random()*8)+2;
			b = (int)(Math.random()*9)+1;
			
			System.out.print(a + " * " + b + " = ");
			
			c = s.nextInt();
			
			if(c == (a*b))
				System.out.println("정답입니다.");
			else
			{
				System.out.println("틀렸습니다. 구구단을 종료합니다.");
				System.exit(0);
			}
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("게임 진행 시간 : "+ (int)(endTime - strTime)/1000 +"초");
		
	}

}
