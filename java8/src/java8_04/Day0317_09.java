package java8_04;

import java.util.Scanner;

public class Day0317_09 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("�̸�, �й�, ���������� �Է��ϼ��� : ");
			String name = s.next();
			int  number = s.nextInt();
			int score = s.nextInt();
			
			System.out.println("���� �̸��� " + name + "�Դϴ�.");
			System.out.println("�й��� " + number + "�Դϴ�.");
			System.out.println("�׸��� ���������� " + score + "�Դϴ�.");
			
			s.close();
	}

}
