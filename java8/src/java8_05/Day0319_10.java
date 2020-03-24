package java8_05;

import java.util.Random;
import java.util.Scanner;

public class Day0319_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		String user = "";
		String com = "";
		
		user = s.next();
		
		int number = (int)(Math.random() *3);
		System.out.println(number);
		
		switch(user)
		{
			case "A" :
			case "a" :
				user = ga;
				break;
			case "B" :
			case "b" :
				user = ba;
				break;
			case "C" :
			case "c" :
				user = bo;
				break;
			default :
				user = "error";
				System.out.println("잘못 입력하셨습니다.");
		}
		
		if(user == "error") System.exit(0);
		
		switch(number) {
		case 0:
			com = ga;
			break;
		case 1:
			com = ba;
			break;
		case 2:
			com = bo;
			break;
		}
		if((user == "가위" && com == "보") || (user == "바위" && com == "가위") || (user == "보" && com == "바위")) {
			System.out.println("player 승! 사람 : " + user + ", 컴퓨터 :" + com);
		}else if((com == "가위" && user == "보") || (com == "바위" && user == "가위") || (com == "보" && user == "바위")) {
			System.out.println("compuet 승! 사람 : " + user + ", 컴퓨터 : "+ com);
		}else System.out.println("무승부! 사람 : " + user + ", 컴퓨터 : " + com);
		// 자바에서 문자열을 비교하기위해서는 변수.equals(값) 를 사용해야한다. 
	}

}
