package java8_18;

public class FuncionalEx {

	public static void main(String[] args) {
		Functional f1 = new Functional() {
			
			@Override
			public void method() {
				System.out.println("�͸�����ü�� �޼ҵ� ȣ��");
			}
		};
		f1.method();
		
		Functional f2 = () -> {
			System.out.println("���ٽ����� �޼ҵ� ȣ��");
		};
		f2.method();
		
		Functional f3 = () -> 
			System.out.println("�߰�ȣ ���� ���ٽ����� �޼ҵ� ȣ��");
		
		f3.method();


	}

}
