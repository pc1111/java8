package java8_11;

public class Day0327_01 {

	public static void main(String[] args) {
		
		int arry[] = new int[100];
		
		int count = 1;
		int sum = 0;
		for(int i  = 0 ; i < 100 ; i ++)
		{
			arry[i] = count++;
		}	
		for(int i = 1 ; i <= 100 ; i ++)
		{
			sum += i-1;
			System.out.println(sum + " + " + i + " = " + (sum + i));
		}
		

	}

}
