package java8_16;

public class ArrayExceptionEx {

	public static void main(String[] args)throws ArithmeticException{
		exceptionTest();
	}
	
	static void exceptionTest() {
		int[] arr = new int[3];
		try {
			arr[2] = 100;
			System.out.println(arr[2]);
//			throw new ArrayIndexOutOfBoundsException();// 강제적으로 예외 발생시키려면 객체를 생성해서 throw 한다.
//			throw new ArithmeticException(); throw 중복 불가?
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("배열은 범위를 넘어섰거나, 숫자 연산이 불가능합니다.");
		} /*catch(ArithmeticException e) {
			System.out.println("숫자 연산이 불가능합니다."); // 
		}*/ catch(Exception e) { // Exception은 최상위이기 때문에 가장 마지막에 사용해야지만 에러를 발생하지않는다.
			System.out.println("발생된 모든 예외를처리합니다.");
			e.printStackTrace();
		}finally { //예외와 상관없이 무조건 실행하는 구간입니다. 생략가능합니다.
			System.out.println("finally 구간입니다.");
		}
//		ArithmeticException 계산적인 예외처리  
//		Exception 최상위 예외처리, 어떤 예외인지 모를떄 사용
//		예외가 발생하면 그 밑에있는 작업들은 일하지않는다
	}
}
