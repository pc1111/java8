package java8_09;

import java.util.Scanner;

public class Day0325_03 {

	public static void main(String[] args) {
		/*������ ���� �ۼ�*/
		
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
				System.out.println("����");
			else if(a == 0){
				System.out.println("����");
				System.exit(0);
			}
			else
				System.out.println("����");
			
		}
	}

}
