package java8_10;

public class Day0326_01 {

	public static void main(String[] args) {
		int s0 = 10;
		int s1 = 20;
		int s2 = 30;
		int s3 = 40;
		int s4 = 50;
		
		int[] students = {10, 20, 30, 40, 50}; // 중괄호로 배열을 초기화하면
											   // 배열의 크기를 입력되는 값으로 자동 저장
		
		int res1 = s0 +s1+ s2+ s3+ s4;
		System.out.println(res1);
		
		int res2 = 0;
		for(int i = 0 ; i < 5; i++)
			res2 += students[i];
		
		
	}

}
