package java8_02;

import java.util.*;

public class Day0207 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rd = new Random();// Random�� �Ű�����(�Է°�)�� �����ϴ�.
		System.out.println(rd.nextInt());
		System.out.println(rd.nextBoolean());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextLong());
		System.out.println(rd.nextGaussian());
		System.out.println(rd.nextInt(10));
		
		System.out.println(Math.random());	// 0���� ũ�ų� ���� 1���� ���� �Ǽ��� ���
		//Math Ŭ������ �⺻���� Ŭ�����̹Ƿ� import�� �ʿ䰡 ����.
		s.close();
	}

}
