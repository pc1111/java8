package java8_10;

import java.util.Scanner;

public class Day0326_16 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] com = new int[3];
		
		
		for(int i = 0; i< 3 ; i++) {
			com[i] = (int)(Math.random() *9) +1;
			for(int j = i-1 ; j >= 0 ; j--)
			{
				if( com[i] == com[j])
				{
					i--;
					break;
				}
			}
			}
		int life = 11;
		int user[] = new int[3];
		
		do{
			int str = 0,ball = 0,out = 0;
			System.out.println("1 ~ 9 ������ ���ڸ� 3�� �Է��� �ּ���.");
			for(int i = 0 ; i < 3 ; i++)
				user[i] = s.nextInt();
			
			for(int i = 0 ; i < 3; i ++)
			{
				for(int j = 0 ; j < 3; j++)
				{
					if(i == j && user[i] == com[j])
					{
						str++;
						break;
					}
					else if(user[i] == com[j])
					{
						ball++;
						break;
					}
					if(j == 2)
						out++;
				}
				
			}
			if(str == 3)
			{
				System.out.println("���߼̽��ϴ�.");
				break;
			}
			else
				life--;
			System.out.println("��Ʈ����ũ : " + str +"\n�� : " + ball + "\n�ƿ� : " + out + "\nlife :" + life);
			
			
		}while(life > 0);
		System.out.println("������ " + com[0] + " " + com[1] + " "+com[2]  + "�Դϴ�");

	}

}
