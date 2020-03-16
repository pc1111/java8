package java8_02;

public class Day0204 {

	public static void main(String[] args) {
		double number1 = 3.14, number2 = 1.23;
		double result1 = number1 + number2;
		
		System.out.println(result1);
		
		float result2 = (float)(number1 + number2);
		System.out.println(result2);
		
		double result3 = 3.14 + 1.23;
		System.out.println(result3);
		
		float result4 = 3.14f + 1.23f; // 실수의 기본형은 double이기 때문에 형변환이 필요하다.
		System.out.println(result4);
		
		double result5 = 3.14f + 1.23; // 서로 다른 자료형을 연산하게 되면 큰 자료형으로 자동형변환 정수 동일
		
		
		long result6 = 10 + 20L;
		
	}

}
