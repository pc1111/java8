package java8_17;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		try {
		int num = stack.peek();
		System.out.println(num);
		}catch(Exception e) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}
		
		stack.push(10);
		stack.push(20);
		int num = stack.peek();
		System.out.println(num);

	}

}
