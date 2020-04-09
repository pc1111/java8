package java8_16;

public class BoundedTypeParameterExample {

	public static void main(String[] args) { // extends는 최상위 클래스를 설정 할때사용
		Double d1;
		
		int result1 = Util.compare(10, 20); // t1과 t2가 int이므로 Integer로 유추가능
		System.out.println(result1);  //-1

		int result2 = Util.compare(4.5, 3); // t1원 double, t2는 int 
		System.out.println(result2);
		
		int result3 = Util.compare(100, 100);
		System.out.println(result3);

	}

}
