package java8_07;

import java.util.Scanner;

public class Day0323_01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� 2���� �Է����ּ��� : ");
		int fr = s.nextInt() , sc = s.nextInt(); 
		
		if(fr == sc) System.out.println("Same");
		else System.out.println("Different");
		
		s.close();
	}

}
