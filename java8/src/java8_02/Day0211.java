package java8_02;

public class Day0211 {

	public static void main(String[] args) {
		char ch;
		String str;
		ch = 'A' + '1'; //'A'은 65, '1'은 49
		System.out.println(ch);
		int res = ch;
		System.out.println(res);
		str = "A" + "1"; // 문자열은 아무것도 없거나 한 개의 문자만 있어도 쌍따옴표로 감싸면 문자열이 된다.
		System.out.println(str); // 문자열의 덧셈은 하나의 문자열로 합치게 된다.
		String str2 = "10";
		int num2 = 10,num3 = 10;
		String res2 = str2 + num2 + num3; // 문자열과 다른 자료형이 합치게되면 하나의 문자열이 된다. 
		System.out.println(res2);// << 101010
		
		int num4 = 10;
		int num5 = 20;
		System.out.println("" + num4 + num5); // << 1020 숫자를 문자로 변형하는 방법1
		String str3 = String.valueOf(num3); // 숫자를 문자로 변형하는 방법2
		
		String str4 = "100";
		System.out.println(Integer.valueOf(str4) + 100);
		
	double d1 = Double.valueOf(str4);
	
	int num6 = Integer.parseInt(str4);
	double d2 = Double.parseDouble(str4);
	
	
	
	String str5 = "Hello";
	int num7 = Integer.valueOf(str5);//  << 문자열에 숫자가 없다면 오류가 발생한다.
	int num8 = Integer.parseInt(str5); // << 동일
	
	}

}


/*
 세로 선텍 shift + alt + a  후 쉬프트 방향키
number8;
number8;
number8;
number8;
number8;

*/
