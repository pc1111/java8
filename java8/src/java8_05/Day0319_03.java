package java8_05;

import java.util.Scanner;

public class Day0319_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("����� ���� ������ �Է��� �ּ���(0~100) : ");
		int score = s.nextInt();
		
		String pass = "";
		
		String ps = "";
		if(60 > score) pass = "�հ�";	
		else pass = "���հ�";
			
		System.out.println("���迡 " + pass +"�ϼ̽��ϴ�.");

		if(score >= 90) {
			ps ="A����";
		} else if(score >= 80) {
			ps ="B����";
		} else if(score >= 70) {
			ps ="C����";
		} else if(score >= 60) {
			ps ="D����";
		} else ps ="F����";
	
		
		s.close();
	}

}
/* 90�� �̻� A����
	90�� �̸� 80�� �̻��� B����
	80�� �̸� 70�� �̻��� C����
	70�� �̸� 60�� �̻��� D����
	60�� �̾��� F����
*/