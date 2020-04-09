package java8_19;

import java.util.function.IntBinaryOperator;

import java8_12.Calculator;

public class MethodReferenceEx {

	public static void main(String[] args) {
		IntBinaryOperator operator ;
		
		operator = new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {
				
				return (Caluculator.staticMethod(left,right));
			}
		};
		
		int result = operator.applyAsInt(10, 20);
		System.out.println(result);
		
		operator = (int left, int right) ->{ return Caluculator.staticMethod(left,right);};
		
		operator = (x,y) -> Caluculator.staticMethod(x,y);
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		 
		Caluculator calc = new Caluculator();
		
		operator = calc :: instanceMethod;
//		operator = Caluculator::instanceMethod; // �ν��Ͻ� �޼ҵ��� Ŭ���������� ȣ�� �Ұ���
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
	}
}
