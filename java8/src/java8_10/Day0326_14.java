package java8_10;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day0326_14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int r[] = new int[10];
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수를 10개 입력하세요 : ");
		for(int x=0; x < r.length; x++)
		{
			r[x] = Integer.parseInt(inbr.readLine());
		}
		System.out.print("입력 데이터 값 : ");
		for(int x = 0; x < r.length; x++)
			System.out.print(r[x] + "..");
		System.out.println();
		//오름차순 정렬
//		
//		for(int i = 0; i < r.length; i++)
//		{
//			int swap;
//			for(int j = i+1; j <r.length; j++)
//			{
//				if(r[i] > r[j])
//				{
//					swap = r[i];
//					r[i] = r[j];
//					r[j] = swap;
//				}
//			}
//		}
//		
		Arrays.sort(r); // Arrays 클래스에서 제공하는 오름차순 정렬 메소드
		
		
		System.out.print("오름차순 데이터 값 : ");
		for(int x= 0 ; x < r.length; x++)
		{
			System.out.print(r[x] + "..");
		}
		System.out.println();
		
		System.out.print("합계 : ");
		int sum = 0;
		for(int x = 0 ; x <r.length ; x++)
			sum = sum + r[x];
		System.out.println(sum);
		System.out.println("평균 : " + (sum /r.length));
	}

}
