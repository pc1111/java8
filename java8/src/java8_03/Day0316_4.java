package java8_03;

import java.util.Random;

public class Day0316_4 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		int res1 = num1 + num2; 
		int res2 = num1 - num2;
		int res3 = num1 * num2;
		int res4 = num1 / num2;
		int res5 = num1 % num2;
		double res6 = num1 / num2; // ���� ������ ������ ����Ѵ�.
		double res7 = (double)num1 / num2; // nu1�� ��������ȯ �ϸ鼭 num2�� �ڵ�����ȯ , �� ū������ ��ȯ
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
		System.out.println(res7);
		
		int res8 = num1 % 2;
		System.out.println(res8);
		
		Random rd = new Random();
		int num3 = rd.nextInt();
		System.out.println(num3);
		
		int res9 = Math.abs(num3) % 45;
		System.out.println(res9);
	}

}
