package java8_19;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class MethodReferenceTestEx {
	public int add(int a,int b) {
		return a+b;
	}
	
	public static int mul(int a, int b) {
		return a + b;
	}
	public void oper(IntBinaryOperator operator, int a, int b) {
		System.out.println("����/�ν��Ͻ� �޼ҵ� ���� : " + operator.applyAsInt(a, b));
	}
	
	public void operS(Function<String, String> stringOperator, String a) {
		System.out.println("�Ű������� �޼ҵ� ���� : " + stringOperator.apply(a));
	}
	public static void main(String[] args) {
		MethodReferenceTestEx ex = new MethodReferenceTestEx();
		
		ex.oper((a,b)->MethodReferenceTestEx.mul(a, b), 1, 1);
		//���� �޼ҵ� ����
		ex.oper(MethodReferenceTestEx::mul , 1, 1);
		
		ex.oper((a, b)->ex.add(a, b), 1,1);
		//�ν��Ͻ� �޼ҵ� ����
		ex.oper(ex::add, 1, 1);
		
		ex.operS(s->s.toLowerCase(), "STRING");
		//�Ű����� �޼ҵ� ����
		ex.operS(String::toLowerCase, "STRING");
	}
}

