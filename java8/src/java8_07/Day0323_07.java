package java8_07;

public class Day0323_07 {

	public static void main(String[] args) {

		int count = 0 , temp = 1 ;
		for(int i = 1 ; i <= 50; i = 3 * temp  ) 
		{
			count++;
			temp++;
			
		}
		System.out.println("1���� 50������ �� �� 3�� ����� ���� : " + count);

	}

}
