package java8_07;

public class Day0323_10 {

	public static void main(String[] args) {
		
		int i;
		double sum = 0;
		for(i = 1; i <= 50; i++)
		{	
			sum += i;
		}
		
		System.out.println("1~50�� ���� ��� : " + (double)(sum/(i-1)));
	}

}
