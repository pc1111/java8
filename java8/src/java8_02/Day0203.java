package java8_02;

public class Day0203 {

	public static void main(String[] args) {
		int number1 = 1000000000;
		int number2 = 2000000000;
		
		int result = number1 + number2;
		System.out.println(result);
		// int�� ���� �� -21�� ~ 21�� 
		
		long result2 = (long)number1 + (long)number2;
		System.out.println(result2);
		// long ������ ����ϱ����� int -> long���� �� ��ȯ 
		
		long number3 = 1000000000;
		long number4 = 2000000000;
		long result3 = number3 + number4 ;
		System.out.println(result3);
		
		/*
		 	long result4 = 1000000000 + 2000000000;
			System.out.println(result4); // �Ϲ������� ���꿡�� ���Ǵ� ������ int
		*/
		long result4 = 1000000000L + (long)2000000000; // L�� ���ڵڿ� ���� �ְų� (long)�� ���ھտ� �����־� ����ȯ
		System.out.println(result3);
		
		byte num5 = 15;
		byte num6 = 1;
		int result5 = num5 + num6; // �ڹ��� �⺻ ������ int�Դϴ�. byte , short �� ����� int�̱⿡ int ������ ����� ����
								    
		long result6 = num5 + num6;
		System.out.println(result6); // int ���� ū long�� ����, �ڵ�����ȯ, ����������ȯ, promotion
		
		int num9 =10;
		int num10 = 20;
		short result9 = (short)(num9 + num10); // ��������ȯ, ���������ȯ, castiong
											   // ū �ڷ����� �����ڷ������� ��ȯ�� ���� ��������ȯ�� ���
		int num11 = 10000;
		int num12 = 30000;
		short result10 = (short)(num11+num12);
		//40,000�� 2������ 
	}

}
