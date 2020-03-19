package java8_05;

import java.util.Scanner;

public class Day0319_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("당신의 영어 점수를 입력해 주세요(0~100) : ");
		int score = s.nextInt();
		
		String pass = "";
		
		String ps = "";
		if(60 > score) pass = "합격";	
		else pass = "불합격";
			
		System.out.println("시험에 " + pass +"하셨습니다.");

		if(score >= 90) {
			ps ="A학점";
		} else if(score >= 80) {
			ps ="B학점";
		} else if(score >= 70) {
			ps ="C학점";
		} else if(score >= 60) {
			ps ="D학점";
		} else ps ="F학점";
	
		
		s.close();
	}

}
/* 90점 이상 A학점
	90점 미만 80점 이상은 B학점
	80먼 미만 70점 이상은 C학점
	70점 미만 60점 이상은 D학점
	60점 미안은 F학점
*/