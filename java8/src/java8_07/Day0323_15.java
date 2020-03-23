package java8_07;

public class Day0323_15 {

	public static void main(String[] args) {
		/*1 ~ 100 중에 5의 배수의 합 출력 */
		
		int add = 0,temp = 0;
		for(int i = 0; i <= 100;i = temp * 5)
		{
			add += i;
			temp++;
		}
		System.out.println("1 ~ 100 중에 5의 배수의 합 : " + add);
		/*1 ~ 50 중에 3의 배수는 화면에 출력하세요. */
		temp = 1;
		for(int i = 3; i <= 50;i = temp * 3)
		{
			System.out.print(i + "\t");
			
			if( temp % 10 == 0)
				System.out.println("");
			temp++;
		}
		System.out.println("");
		/* 1 ~ 50중에 3의 배수 총 합과 개수를 출력하세요. */
		
		temp = 1; add = 0;
		
		for(int i = 3; i <= 50;i = temp * 3)
		{
			add += i;
			temp++;
		}
		System.out.println("1 ~ 50 중에 3의 배수의 합 : " + add + ",개수 : "+ (temp-1));
	}

}
