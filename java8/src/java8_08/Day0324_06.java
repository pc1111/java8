package java8_08;

import java.util.Scanner;

public class Day0324_06 {

	public static void main(String[] args) {
		/*������ ���� 10ȸ */
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
				System.out.println("�����Դϴ�.");
			else
			{
				System.out.println("Ʋ�Ƚ��ϴ�. �������� �����մϴ�.");
				System.exit(0);
			}
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("���� ���� �ð� : "+ (int)(endTime - strTime)/1000 +"��");
		
	}

}
