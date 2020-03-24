package java8_08;

public class Day0324_01 {

	public static void main(String[] args) {
		/*1 ~ 100 출력*/
		int add = 0;
		
		for(int i = 1 ; i <= 100; i++)
		{
			System.out.print(i +"\t");
			if(i % 10 == 0)
				System.out.println();
		}
		System.out.println();
		/* 1 ~ 100중에 3과 5의 공배수의 합은얼마인가요?*/
		for(int i = 1 ; i <= 100; i++)
		{
			
			if(i % 3 == 0 && i % 5 == 0)
				add += i;
		}
		System.out.println("1 ~ 100중에 3과 5의 공배수의 합은 : " + add );
		
		/* 1 ~ 100중에 짝수는 더하고 홀수는 뺸 값은 얼마인가요?*/
		System.out.println();
		add=0;
		for(int i = 1 ; i <= 100; i++)
		{
			
			if(i % 2 == 0)
				add += i;
			else add -=i;
		}
		System.out.println("1 ~ 100중에 3과 5의 공배수의 합은 : " + add );
		
	}

}
