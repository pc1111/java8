package java8_02;

public class Day0203 {

	public static void main(String[] args) {
		int number1 = 1000000000;
		int number2 = 2000000000;
		
		int result = number1 + number2;
		System.out.println(result);
		// int의 범위 약 -21억 ~ 21억 
		
		long result2 = (long)number1 + (long)number2;
		System.out.println(result2);
		// long 형으로 계산하기위해 int -> long으로 형 변환 
		
		long number3 = 1000000000;
		long number4 = 2000000000;
		long result3 = number3 + number4 ;
		System.out.println(result3);
		
		/*
		 	long result4 = 1000000000 + 2000000000;
			System.out.println(result4); // 일반적으로 연산에서 사용되는 정수는 int
		*/
		long result4 = 1000000000L + (long)2000000000; // L을 숫자뒤에 붙혀 주거나 (long)을 숫자앞에 붙혀주어 형변환
		System.out.println(result3);
		
		byte num5 = 15;
		byte num6 = 1;
		int result5 = num5 + num6; // 자바의 기본 연산은 int입니다. byte , short 의 결과는 int이기에 int 변수에 결과를 저장
								    
		long result6 = num5 + num6;
		System.out.println(result6); // int 보다 큰 long은 예외, 자동형변환, 묵시적형변환, promotion
		
		int num9 =10;
		int num10 = 20;
		short result9 = (short)(num9 + num10); // 강제형변환, 명시적형변환, castiong
											   // 큰 자료형을 작은자료형으로 변환할 때는 강제형변환을 사용
		int num11 = 10000;
		int num12 = 30000;
		short result10 = (short)(num11+num12);
		//40,000은 2진수로 
	}

}
