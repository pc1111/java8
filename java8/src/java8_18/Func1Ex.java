package java8_18;

public class Func1Ex {
	public static void main(String[] args) {
		Func1 fu1 = new Func1(){ //�͸�����ü

			@Override
			public void method(int number) {
				System.out.println(number);
			}
		};
		fu1.method(10);
		
		Func1 fu2 = (int number) ->{
			System.out.println(number);
		};
		fu2.method(20);
		
		Func1 fu3 = (number) ->{System.out.println(number);}; //�Ű������� 1���ϰ�� Ÿ���� �����Ͽ� ǥ���ص� ��밡��
		fu3.method(30);
		
		Func1 fu4 = number -> System.out.println(number); //�Ű������� 1���ϰ�� �Ұ�ȣ ��������
		
		fu4.method(40);
		
		Func1 fu5 = x -> System.out.println(x); // �Ű��������� ������ �� �ִ�.
		fu5.method(50);
		
		
	}

}
