package java8_18;

public class Func1Ex {
	public static void main(String[] args) {
		Func1 fu1 = new Func1(){ //익명구현객체

			@Override
			public void method(int number) {
				System.out.println(number);
			}
		};
		fu1.method(10);
		
		Func1 fu2 = (int number) ->{
			System.out.println(number);
		};
		fu2.method(20);
		
		Func1 fu3 = (number) ->{System.out.println(number);}; //매개변수가 1개일경우 타입을 삭제하여 표기해도 사용가능
		fu3.method(30);
		
		Func1 fu4 = number -> System.out.println(number); //매개변수가 1개일경우 소괄호 생략가능
		
		fu4.method(40);
		
		Func1 fu5 = x -> System.out.println(x); // 매개변수명을 변경할 수 있다.
		fu5.method(50);
		
		
	}

}
