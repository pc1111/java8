package java8_09;

import java.util.Scanner;

public class Day0325_02 {

	public static void main(String[] args) {
		/* 1~25까지 5칸 5줄로 출력*/
		
		for( int i = 1; i <= 25 ; i++)
		{
			System.out.print(i + "\t");
			if(i % 5 == 0 )
				System.out.println();
			
		}
		System.out.println();
		for(int i = 1 ; i <= 25 ; i+=5)
		{
			for(int j = i ; j < i+5; j++)
				System.out.print(j + "\t");
			System.out.println();
		}

		// System.out.printf는 형식(format)에 맞게 출력하는 메소드입니다
		// prontf는 c언어에서 출력으로 사용하는 메소드인데 자바에서도 사용할 수 있다.
		// printf("출력형식", 변수);
		// %d << decimal,10진수
		// %f << float,실수 
		// %lf << long float , double 실수 >> c언어용 java에 없
		// o << octa 8진수
		// x << hexa 16진수
		// b << binary 2진수
		// s << String 문자열
		// c << CHAR 문자 1개
		// - 조합할 수 있는 것 -
		// 앞쪽에 숫자를 입력하면 자리수를 뜻함
		// %2d 10진수로 2자리 출력
		// %10d 10진수로 10자리 출력
		// 숫자 앞에 0을 붙이면 빈 공간을 0으로 채웁니다.
		// 제일 앞쪽에 -를 붙이면 좌측정렬합니다.
		
		System.out.println();
		int a = 1;
		for( int i = 1; i <= 5 ; i++)
		{
			if(i % 2 == 1)
			{
				for(int j = 1; j <=5 ; j++)
					System.out.printf("%02d\t", a++);
				a += 4;
				System.out.println();
			}
			else 
			{
				for(int j = 1; j <=5 ; j++)
				System.out.printf("%02d\t", a--);
				a += 6;
				System.out.println();
			}			
		}
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < i ; j++)
			{
				System.out.print(" ");
			}
			System.out.println("@");
		}
	
	}

}
