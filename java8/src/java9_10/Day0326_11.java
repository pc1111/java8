package java9_10;

import java.util.Arrays;

public class Day0326_11 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = num1;
		System.out.println(num2);
		// num2�� num1�� ����

		String str1 = "Hello";
		String str2 = str1;
		System.out.println(str2);
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = arr1; // java������ ������ ���
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}

		int num = Integer.MAX_VALUE +1;
		System.out.println(num);
		
		int[] arr3 = new int[5];
		//System.arraycopy(src(���), srcPos(�������), dest(���), destPos(��� �������), length(������));
		System.arraycopy(arr1, 1, arr3, 0, 2);
		for(int i = 0 ; i <arr3.length; i++)
			System.out.println(arr3[i]);
		
		int[] arr4 = Arrays.copyOf(arr1, 2);
		
		for(int i = 0 ; i < arr4.length ; i++)
			System.out.println(arr4);
		
		System.out.println(arr4.length);
	}
	

}
