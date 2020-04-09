package java8_09;

import java.util.Scanner;

public class Day0325_03 {

	public static void main(String[] args) {
		/*구구단 게임 작성*/
		
		Scanner s = new Scanner(System.in);
		
		int a;
		int f,c;
		
		while(true)
		{	
			f = (int)(Math.random()*8) +2;
			c = (int)(Math.random()*9) +1;
			
			System.out.print(f + " * " + c + " = " );
			a = s.nextInt();
			
			if((f *c) == a)
				System.out.println("정답");
			else if(a == 0){
				System.out.println("종료");
				System.exit(0);
			}
			else
				System.out.println("오답");
			
		}
	}

}
