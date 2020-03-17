package java8_03;

import java.util.Scanner;

public class Day0316_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean bl1 ;
		
		System.out.println("수도입니까?(수도 : 1, 수도아님: 0) - ");
		int anser = sc.nextInt();
		
		System.out.println("인구(단위: 만) - ");
		int anser2 = sc.nextInt();
		
		System.out.println("부자의 수(단위: 만) - ");
		int anser3 = sc.nextInt();
		// 한 나라의 수도이고 인구가 100만 이상이여야한다.
		// 연 소득이 1억 이상인 인구가 50만 이상이어여한다.
		
		int str = anser >= 1 ? 1 : 0;
		int str2 = anser2 >= 100 ? 1 : 0;
		int str3 = anser3 >= 50 ? 1 : 0;
		
		int add = str + str2 + str3;
		
		boolean lot = add == 3 ? true : false;
		System.out.println("메트로폴리스 여부 : " + lot);
		
		
		
	}
}
