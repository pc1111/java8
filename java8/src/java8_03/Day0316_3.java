package java8_03;

public class Day0316_3 {

	public static void main(String[] args) {
		int number1 =100;
		System.out.println(number1);
		
		{ //�߰�ȣ ��
			System.out.println(number1); 
			int number2 = 200; //������
			System.out.println(number2);
		}
		System.out.println(number1);
		//System.out.println(number2); �ܺκ��� ���ο��� ��밡��, ���κ��� �ܺο��� ���Ұ���
		
		
	}

}
