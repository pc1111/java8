package java8_02;

import java.util.*;

public class Day0209 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name1 ; 
		name1 = s.nextLine();
		int luck = (int)(Math.random() * 51) + 50;
		
		char de;
		
		
		System.out.println( name1 + "���� ������ ����� " + (r.nextInt(51) + 50) +"%�Դϴ�.");
		
		s.close();
	}

}
