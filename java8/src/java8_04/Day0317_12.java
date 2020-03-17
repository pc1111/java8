package java8_04;

import java.util.Scanner;

public class Day0317_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("입력N : " );
		int N = s.nextInt(); 
		System.out.print("입력M : " );
		int M = s.nextInt();
		int swap = 0;
		System.out.println("교환전 : N = " + N +",M ="+ M);
		
		swap = N;
		N = M;
		M = swap;
		
		System.out.println("교환후 : N = " + N +",M =" + M);
		
		s.close();
	}

}
