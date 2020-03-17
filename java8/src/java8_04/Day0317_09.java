package java8_04;

import java.util.Scanner;

public class Day0317_09 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("이름, 학번, 토플점수를 입력하세요 : ");
			String name = s.next();
			int  number = s.nextInt();
			int score = s.nextInt();
			
			System.out.println("나의 이름은 " + name + "입니다.");
			System.out.println("학번은 " + number + "입니다.");
			System.out.println("그리고 토플점수는 " + score + "입니다.");
			
			s.close();
	}

}
