package java8_02;

public class Day0206 {

	public static void main(String[] args) {
		char ch1 = 'a'; // ���� 1���� �Է��ϴ� char���� ���� ����ǥ�� ���ξ���.
		//char ch2 = 'ab'; // char���� 2�� �̻��� ���ڸ� �Է��Ҽ� ����.
		char ch3 = '\n'; // escape���ڴ� ��ǻ�Ͱ� 1���� ���ڷ� �ν�.
		char ch4 = 'b'; //char���� ���ڵ��� ������ �ѹ��� �����ϴ�.
		System.out.println(ch1);
		System.out.println(ch4);
		int result1 = ch1; //char���� 2����Ʈ int���� 4����Ʈ�̹Ƿ� ch1�� int������ �ڵ� ����ȯ
		System.out.println(result1); //�ҹ��� 'a'�� 97
		int result2 = ch4;
		System.out.println(result2); //�ҹ��� 'b'�� 98
		int result3 = 'z';
		System.out.println(result3); // ���� '1'�� 49
		int result4 = '1';
		System.out.println(result4);
		int result5 = '9';
		System.out.println(result5);
	}

}
