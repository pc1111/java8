package java8_05;

import java.util.Scanner;

public class DaY0319_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("����� ����� �Է����ּ���. ");
		
		String grade = s.next();
		/*
		switch(grade){
			case "S":
			case "s":
				System.out.println("����� VIP�Դϴ�.");
				break;
			case "A" :
			case "a" :
				System.out.println("����� ��� ���Դϴ�.");
				break;
			case "B":
			case "b" :
				System.out.println("����� ��� ���Դϴ�.");
				break;
			default :
				System.out.println("����� �Ϲ� ���Դϴ�.");
		}*/
		
		switch(grade){
			case "a":
			case "A":
				System.out.println("����� �Ƹ޸�ī���Դϴ�.");
				break;
			case "c":
			case "C" :
				System.out.println("����� īǪġ���Դϴ�.");
				break;
			case "I":
			case "i" :
				System.out.println("����� ī����Դϴ�.");
				break;
			case "m":
			case "M": 
				System.out.println("����� ī�� ��ī�Դϴ�.");
		}

		

	}

}
