package java8_08;

import java.util.Scanner;



public class Day0324_07 {

public static int solution(int a,int b) {
		
		int sum = 0, temp;
		if( a > b) {
			temp = a;
			a = b;
			b = a;
		}
		
		
		for(int i = a;i <= b; i++)
		{
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a =s.nextInt(), b = s.nextInt();
		int sum=0;	
		if( !(a >= -10_000_000 && a <= 10_000_000)) {
			System.out.println("a값의 입력 번위를 초과하였습니다.");
			System.exit(0);
		}
		if( !(b >= -10_000_000 && b <= 10_000_000)) {
			System.out.println("b값의 입력 번위를 초과하였습니다.");
			System.exit(0);
		}
		
		sum = solution(a, b);
		System.out.println("return : " + sum);
	}
	
	

}





