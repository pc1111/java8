package java8_02;

import java.util.*;

public class Day0209 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.print("이름을 입력해 주세요 : ");
		String name1 ; 
		name1 = s.nextLine();
		int luck = (int)(Math.random() * 51) + 50;
		
		char de;
		
		
		System.out.println( name1 + "님의 오늘의 행운은 " + (r.nextInt(51) + 50) +"%입니다.");
		
		s.close();
	}

}
