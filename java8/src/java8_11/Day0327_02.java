package java8_11;

public class Day0327_02 {

	public static void main(String[] args) {
		
		int arry[] = new int[10];
		
		for(int i = 0 ; i < 10 ; i++)
		{
			arry[i] = i;
			System.out.println("arry[" + i + "]" + " = " + arry[i]);
		}
		
		System.out.println();
		arry = new int[arry.length];
		
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println("arry[" + i + "]" + " = " + arry[i]);
		}

	}

}
