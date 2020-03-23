package java8_07;

public class Day0323_04 {

	public static void main(String[] args) {
		
		int add = 0;
		
		for(int i = 1; i <= 10;i++)
		{
			if(i % 2 == 0) add += i;
		}
		System.out.println("1부터 10까지의 짝수 합 : " + add);

	}

}
