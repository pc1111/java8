package java8_07;

public class Day0323_11 {

	public static void main(String[] args) {

		for(int i = 1 ; i <= 100 ; i++)
		{
			System.out.print(i + "\t");
			if(i % 10 == 0)
			{
				System.out.println();
			}
		}

		for(int i = 1 ; i <= 100 ; i++)
		{
			if(i % 15 == 0) System.out.print(i + "PING PONG\t");
			else if(i % 5 == 0) System.out.print(i + "PONG\t");
			else if( i % 3 == 0)System.out.print(i + "PING\t");
			else System.out.print(i + "\t");
			
			if(i % 10 == 0)
				System.out.println();
			
		}


	}

}
