package java8_10;

import java.util.Scanner;

public class Day0326_13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;
		
		int arr[] = new int[5];
		int max = 0;
		
		System.out.println("5���� ������ �Է� �޾� �ִ밪�� ���϶�");
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
			System.out.print("�Է°� : " + arr[i] + "\t");
		System.out.println();
		System.out.println("�ִ� �� :" + max);
		

	}

}
