package java8_10;

public class Day0326_06 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		//arr1 = {100, 200, 300, 400, 500}; < 이렇게 불가능

		int[] arr2 = new int[5];
//		arr2 = {10, 20, 30, 40, 50}; // 중괄호 초기화는 선언시 1번만 사용 가능
		
		int[] arr3 = new int [] {10, 20, 30, 40, 50};
		
		String str1 = "안녕하세요";
		str1 = "hello"; // 객체는 동일한 형태의 다른 객체를 대입할 수 있다.
		
		arr3 = new int [] {100, 200, 300, 400, 500}; // 배열도 동일한 형태의 다른 객체를 대입할 수 있다.
		
		arr2 = new int[10]; 
		
		String str = "안녕하세요";
		System.out.println(str.length());
		
	}

}
