package java8_18;

public class FuncionalEx {

	public static void main(String[] args) {
		Functional f1 = new Functional() {
			
			@Override
			public void method() {
				System.out.println("익명구현객체로 메소드 호출");
			}
		};
		f1.method();
		
		Functional f2 = () -> {
			System.out.println("람다식으로 메소드 호출");
		};
		f2.method();
		
		Functional f3 = () -> 
			System.out.println("중괄호 삭제 람다식으로 메소드 호출");
		
		f3.method();


	}

}
