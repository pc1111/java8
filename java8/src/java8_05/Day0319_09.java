package java8_05;

import java.util.Scanner;

public class Day0319_09 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ȳ��ϼ���. ���� �ٹ��Դϴ�. ");
		System.out.println("A. �Ƹ޸�ī��\n L. ī�����\n M.ī���ī ");
		System.out.println("���Ḧ �ֹ��� �ּ���. : ");
		
		String grade = s.next();
		
		switch(grade){
		case "a":
		case "A":
			System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�.");
			break;
		case "c":
		case "C" :
			System.out.println("īǪġ�븦 �ֹ��ϼ̽��ϴ�.");
			break;
		case "I":
		case "i" :
			System.out.println("ī��󶼸� �ֹ��ϼ̽��ϴ�.");
			break;
		case "m":
		case "M": 
			System.out.println("ī���ī�� �ֹ��ϼ̽��ϴ�.");
		}
		s.close();

	}

}
