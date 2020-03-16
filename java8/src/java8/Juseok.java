package java8;
/** 
 	이것은 도큐먼트(문서) 주석입니다.
 	문서에 대한 기본적인 정보를 표기하는 공간입니다.
 	제작자 : xxx
 	제작일자: xxxx-xx-xx
 	설명: 주석을 설명하기 위한 예제입니다.
 	잘 사용하지 않습니다.
*/

public class Juseok {

	public static void main(String[] args) {
		int number1 = 10; // 이것은 한 줄 주석입니다.
		int number2 = 20; // 한 줄에 대한 설명이 필요할 때 사용합니다.
		int result = number1 + number2;
		
		System.out.print("number1과 number2의 합은 ");
		System.out.print(result + " ");
		System.out.println("입니다.");
		/* 이것은 한줄 이상 주석 입니다. */
	}

}
