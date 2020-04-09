package java8_10;

public class Day0326_12 {

	public static void main(String[] args) {
		int[] arr = new int[] {300_000_000};
		int sum = 0;
		int sum2 = 0;
		
		System.out.println("C형 for문");
		long sTime1 = System.nanoTime();
		for(int i = 0; i < arr.length; i++)
		{
			sum += i;
		}
		long eTime1 = System.nanoTime();
		System.out.println(eTime1 - sTime1);
		System.out.println(sTime1);
		System.out.println(eTime1);
		System.out.println();
		
		
		System.out.println("향상된 for문");
		long sTime2 = System.nanoTime();
		for(int number : arr) {
			sum2 += number; 	
			}
		long eTime2 = System.nanoTime();
		
		System.out.println(sTime2);
		System.out.println(eTime2);
		
		System.out.println(eTime2 - sTime2);
		System.out.println();

	}

}
