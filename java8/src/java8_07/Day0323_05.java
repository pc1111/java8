package java8_07;

public class Day0323_05 {

	public static void main(String[] args) {
		
		int sum = 0, add = 1;
		
		for(int i = 3; i <= 50; i = add*3 )
		{
			sum += i;
			add++;
		}
		System.out.println("1���� 50������ �� �߿� 3�� ����� �� :" + sum);
		
		

	}

}
