package java8_05;

import java.util.Scanner;

public class Day0319_09 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("안녕하세요. 영남 다방입니다. ");
		System.out.println("A. 아메리카노\n L. 카페라테\n M.카페모카 ");
		System.out.println("음료를 주문해 주세요. : ");
		
		String grade = s.next();
		
		switch(grade){
		case "a":
		case "A":
			System.out.println("아메리카노를 주문하셨습니다.");
			break;
		case "c":
		case "C" :
			System.out.println("카푸치노를 주문하셨습니다.");
			break;
		case "I":
		case "i" :
			System.out.println("카페라떼를 주문하셨습니다.");
			break;
		case "m":
		case "M": 
			System.out.println("카페모카를 주문하셨습니다.");
		}
		s.close();

	}

}
