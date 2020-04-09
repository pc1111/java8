package java8_10;

public class Day0326_05 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {0 , 0 , 0 , 0 , 0};
		int[] arr3 = new int[5]; // 배열의 크기가 5인 값이 없는 배열
		
		for(int i =0 ; i<arr3.length;i++)
			System.out.println(arr3[i]);
		
		boolean[] arr4 = new boolean[5];
		for(int i = 0 ; i<arr4.length; i++)
			System.out.println(arr4[i]);
		
		String[] arr5 = new String[5];
		for(int i=0;i<arr5.length;i++)
			System.out.println(arr5[i]);
		

	}

}
