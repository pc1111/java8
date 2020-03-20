package java8_06;

import java.util.Scanner;

public class Day0320_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int year,index = 0;
		
		System.out.println("윤년을 판별할 년도 입력 : ");
		year = s.nextInt();
		
		//조건 년도를 4로 나누어 떨어지지만, 100으로 나누어 떨어지는 해는 평년
		//년도를 4로 나누어 떨어지고, 100으로 나누어 떨어지지만, 다시 400으로 나누어 떨어지는 해
		
		
			if( year % 4 == 0)
			{
				index = 1;
				if(year % 100 == 0)
				{
					index = 0;
					if(year % 400 == 0)
					{
						index = 1;
					}
				}
			}
			if(index == 1)
				System.out.println(year+"년은 윤년이다.");
			else
				System.out.println(year+"년은 윤년이 아니다.");
		
	}

}
