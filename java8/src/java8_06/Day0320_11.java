package java8_06;

import java.util.Scanner;

public class Day0320_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int intvalue;
		int resvalue =0;
		System.out.println("���ڸ� �Է��ϼ���! : ");
		intvalue = s.nextInt();
		
		while(intvalue > 0)
		{
			resvalue = resvalue * 10;
			resvalue = resvalue +(intvalue % 10);
			intvalue = intvalue / 10; 
		}
		System.out.println("�ٲ� ���� : " + resvalue);

	}

}
