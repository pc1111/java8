package java8_07;

public class Day0323_07 {

	public static void main(String[] args) {

		int count = 0 , temp = 1 ;
		for(int i = 1 ; i <= 50; i = 3 * temp  ) 
		{
			count++;
			temp++;
			
		}
		System.out.println("1에서 50까지의 수 중 3의 배수의 갯수 : " + count);

	}

}
