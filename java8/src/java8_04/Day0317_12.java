package java8_04;

import java.util.Scanner;

public class Day0317_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("�Է�N : " );
		int N = s.nextInt(); 
		System.out.print("�Է�M : " );
		int M = s.nextInt();
		int swap = 0;
		System.out.println("��ȯ�� : N = " + N +",M ="+ M);
		
		swap = N;
		N = M;
		M = swap;
		
		System.out.println("��ȯ�� : N = " + N +",M =" + M);
		
		s.close();
	}

}
