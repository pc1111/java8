package java8_04;

import java.util.Scanner;

public class Day0317_13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("�Է�a : ");
		a = s.nextInt();
		System.out.print("�Է�b : ");
		b = s.nextInt();
		
		String ab = a > b ? "a" : "b";
		int ba = a > b ? a : b;
		System.out.println("�Է� : a(" + a+"),b(" + b +")");
		System.out.println("��� : " + ab +"(" + ba + ")");
		

	}

}
