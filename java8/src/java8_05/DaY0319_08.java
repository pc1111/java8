package java8_05;

import java.util.Scanner;

public class DaY0319_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("당신의 등급을 입력해주세요. ");
		
		String grade = s.next();
		
		switch(grade){
			case "S":
			case "s":
				System.out.println("당신은 VIP입니다.");
				break;
			case "A" :
			case "a" :
				System.out.println("당신은 우대 고객입니다.");
				break;
			case "B":
			case "b" :
				System.out.println("당신은 우수 고객입니다.");
				break;
			default :
				System.out.println("당신은 일반 고객입니다.");
		}
		
		

		

	}

}
