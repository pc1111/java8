package java8_08;

import java.util.Scanner;

public class Day0324_09 {

	public static void main(String[] args) {
		/*1 ~ 100 ������ ���ڸ� ��ǻ�Ͱ� �ϳ��� ������ �ִ�. 
		 * ����ڰ� ���� �����ϸ� up & down �� �Ͽ� ��ǻ���� ���ڸ� ���ߴ� ����*/
		
		Scanner s = new Scanner(System.in);
		
		int user;
		int user_life = 10;
		int com = (int)(Math.random() * 100) + 1;
		
		System.out.println("��ǻ�Ͱ� ���� ���ڸ� ���߾� ������" + com);
		while(true && user_life != 0)
		{
			System.out.print("1 ~ 100������ ���ڸ� ������ �ּ���. \n >");
			user = s.nextInt();
			
			
			if(com > user)
				System.out.println("DOWN");
			else if(user > com)
				System.out.println("UP");
			else{
				System.out.println("�����Դϴ�. �����մϴ�.");
				break;		
			}
			user_life--;
			
		}
		

	}

}
