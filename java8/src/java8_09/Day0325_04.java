package java8_09;

public class Day0325_04 {

	public static void main(String[] args) {
		/* for 문을 사용하여 a~ z 까지 출력*/
		
		char abc = 'a';
		char ABC = 'A';
		
		for( int i = 0 ; i < 26 ; i++)
		{
			System.out.printf("%c \t", (int)abc + i);
			System.out.printf("%c \n", (int)ABC + i);
		}
		
		for(int i ='a'; i<='z'; i++)
		{
			System.out.print((char)i + "\t");
		}
		System.out.println();

	}

}
