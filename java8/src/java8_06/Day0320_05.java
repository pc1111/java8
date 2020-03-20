package java8_06;

public class Day0320_05 {

	public static void main(String[] args) {
		
		System.out.println("구구단 출력");
		for(int i = 2; i <= 9 ; i++)
		{
			System.out.println(i + "단");
			for(int j = 1; j <= 9 ; j++)
				System.out.println(i + " * " + j + " = " + (i*j));
		}
		
		System.out.println("구구단 출력");
		for(int i = 1; i <= 9 ; i++)
		{
//			System.out.println(i + "단");
			for(int j = 2; j <= 9 ; j++)
				System.out.print(j + " * " + i + " = " + (i*j) + "\t");
			
			System.out.println();
		}
		

	}

}
