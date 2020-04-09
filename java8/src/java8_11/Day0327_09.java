package java8_11;

import java.util.Scanner;

public class Day0327_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		int po;
		
		do {
			int a = s.nextInt(),b = s.nextInt();
			po = a * b;
			System.out.println(a + " * " + b + " = " + po);
		}while(po < 500);
		
		

	}

}
