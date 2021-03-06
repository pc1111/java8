package java8_02;

import java.util.*;

public class Day0207 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rd = new Random();// Random은 매개변수(입력값)가 없습니다.
		System.out.println(rd.nextInt());
		System.out.println(rd.nextBoolean());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextLong());
		System.out.println(rd.nextGaussian());
		System.out.println(rd.nextInt(10));
		
		System.out.println(Math.random());	// 0보다 크거나 같고 1보다 작은 실수를 출력
		//Math 클래스는 기본지원 클래스이므로 import할 필요가 없다.
		s.close();
	}

}
