package java8_02;

import java.util.Scanner;

public class Day0205 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int pw ;
		System.out.println("비밀번호를 \n입력해\t 주세요.");
		System.out.print("비밀번호 : ____ \b\b\b\b");
		pw = s.nextInt();
		System.out.println("입력하신 비밀번호는 \"");
		System.out.println(pw);
		System.out.println("\"입니다.");
		s.close();
		
		
	}

}
