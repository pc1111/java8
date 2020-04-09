package java8_10;

import java.util.Scanner;

public class Day0326_13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;
		
		int arr[] = new int[5];
		int max = 0;
		
		System.out.println("5개의 정수를 입력 받아 최대값을 구하라");
		for(int i = 0 ; i <5 ; i ++)
		{
			a = s.nextInt();
			
			arr[i] = a;
 			if(max < a)
 			{
 				max = a;
 			}	
		}
		for(int i = 0; i < arr.length; i++)
			System.out.print("입력값 : " + arr[i] + "\t");
		System.out.println();
		System.out.println("최대 값 :" + max);
		

	}

}
