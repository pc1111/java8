package java8_05;

import java.util.Scanner;

public class Day0319_01 {
	
	/*입력된 값이 짝수인지 홀수인지 확인하기*/
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	
	int inputNumber = 0;
	System.out.println("홀수와 짝수를 판별하는 프로그램입니다.");
	System.out.println("숫자를 입력해 주세요 :");
	
	inputNumber = s.nextInt();
	//String result = inputNumber % 2 == 0 ? "짝수" : "홀수";
	
	String result ="";
	
	if(inputNumber % 2 == 0) {
		result = "짝수";
	}
	else result = "홀수";
		
	
	System.out.println("입력하신 숫자는 "+inputNumber+ "이고, 이 숫자는"+ result + "입니다.");
	s.close();
	}

}
