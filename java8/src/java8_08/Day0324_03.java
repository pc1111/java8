package java8_08;

import java.util.Scanner;

public class Day0324_03 {

	public static void main(String[] args) {
		/* ������ ����ؼ� ������ ������ ����ϰ� ���� �Է� �ϵ��� �ۼ��ϼ���. */
		
		Scanner s = new Scanner(System.in);
		
		int f_dan ;
		int s_dan ;
		
		int user = 0;
		
		Long startTime = System.currentTimeMillis(); // �ð��� ������� �żҵ�
		// System.out.println(startTime);
		while(true)
		{
			f_dan = (int) (Math.random() * 8) + 2;
			s_dan = (int) (Math.random() * 9) + 1;
			
			System.out.println("������ ���߾� ������. ���� : 0 ");
			
			System.out.print(f_dan + " * " + s_dan + " = " );
			
			user = s.nextInt();
			
			if(user == 0) break;
			
			if(user == (f_dan * s_dan))
				System.out.println("�����Դϴ�.");
			else { 
				System.out.println("Ʋ�ǽ��ϴ�. ������ �����մϴ�.");
				System.exit(0);;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.print("���� ���� �ð� : ");
		System.out.println(endTime - startTime + "ms");
		// ��Ʈ�� ����Ʈ f : ����

	}

}
