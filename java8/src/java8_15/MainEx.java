package java8_15;

public class MainEx {

	public static void main(String[] args) {
		A.C.filed2 =10; // static �ɹ��� ��ü���� ��� �����մϴ�.
		A.C.method2();
		A.C c = new A.C();
		c.field1 = 10;
		c.filed2 = 10;
		c.method1();
		c.method2();
		
		
		A a = new A();
//		A.B b = new A.B(); �����ϸ� �ȵ�
		A.B b = a.new B(); //�ν��Ͻ� �ɹ� Ŭ������ ��üȭ(���� �ɹ� Ŭ������ ��üȭ �ڵ尡 �ٸ���.
		b.field1 = 10;
		b.method1();
		
		a.method1(); // ����Ŭ���� D�� ����ϴ� �޼���
	}

}
