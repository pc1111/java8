package java8_02;

public class Day0211 {

	public static void main(String[] args) {
		char ch;
		String str;
		ch = 'A' + '1'; //'A'�� 65, '1'�� 49
		System.out.println(ch);
		int res = ch;
		System.out.println(res);
		str = "A" + "1"; // ���ڿ��� �ƹ��͵� ���ų� �� ���� ���ڸ� �־ �ֵ���ǥ�� ���θ� ���ڿ��� �ȴ�.
		System.out.println(str); // ���ڿ��� ������ �ϳ��� ���ڿ��� ��ġ�� �ȴ�.
		String str2 = "10";
		int num2 = 10,num3 = 10;
		String res2 = str2 + num2 + num3; // ���ڿ��� �ٸ� �ڷ����� ��ġ�ԵǸ� �ϳ��� ���ڿ��� �ȴ�. 
		System.out.println(res2);// << 101010
		
		int num4 = 10;
		int num5 = 20;
		System.out.println("" + num4 + num5); // << 1020 ���ڸ� ���ڷ� �����ϴ� ���1
		String str3 = String.valueOf(num3); // ���ڸ� ���ڷ� �����ϴ� ���2
		
		String str4 = "100";
		System.out.println(Integer.valueOf(str4) + 100);
		
	double d1 = Double.valueOf(str4);
	
	int num6 = Integer.parseInt(str4);
	double d2 = Double.parseDouble(str4);
	
	
	
	String str5 = "Hello";
	int num7 = Integer.valueOf(str5);//  << ���ڿ��� ���ڰ� ���ٸ� ������ �߻��Ѵ�.
	int num8 = Integer.parseInt(str5); // << ����
	
	}

}


/*
 ���� ���� shift + alt + a  �� ����Ʈ ����Ű
number8;
number8;
number8;
number8;
number8;

*/
