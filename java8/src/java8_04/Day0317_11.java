package java8_04;

import java.util.Scanner;

public class Day0317_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double h = s.nextDouble();
		double w = s.nextDouble();
		
		System.out.println("사각형의 넓이 : " + (w*h));
		System.out.println("사각형의 둘레 : " + (2*(w+h)));


	}

}
