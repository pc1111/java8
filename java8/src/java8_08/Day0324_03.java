package java8_08;

import java.util.Scanner;

public class Day0324_03 {

	public static void main(String[] args) {
		/* 난수를 사용해서 구구단 문제를 출력하고 답을 입력 하도록 작성하세요. */
		
		Scanner s = new Scanner(System.in);
		
		int f_dan ;
		int s_dan ;
		
		int user = 0;
		
		Long startTime = System.currentTimeMillis(); // 시간을 재기위한 매소드
		// System.out.println(startTime);
		while(true)
		{
			f_dan = (int) (Math.random() * 8) + 2;
			s_dan = (int) (Math.random() * 9) + 1;
			
			System.out.println("정답을 맞추어 보세요. 종료 : 0 ");
			
			System.out.print(f_dan + " * " + s_dan + " = " );
			
			user = s.nextInt();
			
			if(user == 0) break;
			
			if(user == (f_dan * s_dan))
				System.out.println("정답입니다.");
			else { 
				System.out.println("틀렷습니다. 게임을 종료합니다.");
				System.exit(0);;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.print("게임 진행 시간 : ");
		System.out.println(endTime - startTime + "ms");
		// 컨트롤 쉬프트 f : 정렬

	}

}
