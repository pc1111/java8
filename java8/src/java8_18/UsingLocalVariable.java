package java8_18;

public class UsingLocalVariable {
	void method(int arg) { //arg�� fianl Ư���� ����
		int localVar = 40; // localVar�� final Ư���� ����
		
		//arg = 31; // fainl Ư�� ������ ���� �Ұ�
		//localVar = 41; 
		
		//���ٽ�
		MyFunctionallnterface fi = () ->{
			//���ú��� ���
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar + "\n");
		};
		fi.method();
	}
}
