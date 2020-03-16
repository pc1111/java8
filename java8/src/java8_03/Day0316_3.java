package java8_03;

public class Day0316_3 {

	public static void main(String[] args) {
		int number1 =100;
		System.out.println(number1);
		
		{ //중괄호 블럭
			System.out.println(number1); 
			int number2 = 200; //블럭변수
			System.out.println(number2);
		}
		System.out.println(number1);
		//System.out.println(number2); 외부변수 내부에는 사용가능, 내부변수 외부에서 사용불가능
		
		
	}

}
