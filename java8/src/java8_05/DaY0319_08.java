package java8_05;

import java.util.Scanner;

public class DaY0319_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("당신의 등급을 입력해주세요. ");
		
		String grade = s.next();
		/*
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
		}*/
		
		switch(grade){
			case "a":
			case "A":
				System.out.println("당신은 아메리카노입니다.");
				break;
			case "c":
			case "C" :
				System.out.println("당신은 카푸치노입니다.");
				break;
			case "I":
			case "i" :
				System.out.println("당신은 카페라떼입니다.");
				break;
			case "m":
			case "M": 
				System.out.println("당신은 카페 모카입니다.");
		}

		

	}

}
