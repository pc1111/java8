package java8_02;

public class Day0206 {

	public static void main(String[] args) {
		char ch1 = 'a'; // 문자 1개를 입력하는 char형은 작은 따옴표로 감싸야함.
		//char ch2 = 'ab'; // char형은 2개 이상의 문자를 입력할수 없다.
		char ch3 = '\n'; // escape문자는 컴퓨터가 1개의 문자로 인식.
		char ch4 = 'b'; //char형의 문자들은 고유의 넘버를 가집니다.
		System.out.println(ch1);
		System.out.println(ch4);
		int result1 = ch1; //char형은 2바이트 int형은 4바이트이므로 ch1은 int형으로 자동 형변환
		System.out.println(result1); //소문자 'a'는 97
		int result2 = ch4;
		System.out.println(result2); //소문자 'b'는 98
		int result3 = 'z';
		System.out.println(result3); // 문자 '1'은 49
		int result4 = '1';
		System.out.println(result4);
		int result5 = '9';
		System.out.println(result5);
	}

}
