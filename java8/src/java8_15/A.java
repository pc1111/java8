package java8_15;

/*�ٱ� Ŭ����*/
public class A {

	A() {
		System.out.println("A ��ü�� ������");
	}

	/* �ν��Ͻ� �ɹ� Ŭ���� */

	class B {
		B() {
			System.out.println("B ��ü�� ������");
		}
//		static int field2; �ν��Ͻ� �ɹ� Ŭ������ ����ƽŸ���� ����������.
		int field1;

		void method1() {

		}
	}

	// ���� �ɹ� Ŭ����
	static class C {
		C() {
			System.out.println("C ��ü�� ������");
		}

		int field1;
		static int filed2;

		void method1() {

		}

		static void method2() {

		}
	}

	void method() {
		// ���� Ŭ����
		class D {
			D() {
				System.out.println("D ��ü�� ������");
			}

			int field1;
//			static int field2; ����Ŭ������ ����ƽŸ���� ����������.
			void method1() {
			}
		}
	}

	// �ν��Ͻ� �ʵ�
	B outerfield1 = new B();
	C outerfield2 = new C();

	void method1() {
		B var1 = new B();
		C var2 = new C();
	}

	// ���� �ʵ� �ʱ�ȭ
	// static B outerfield3 = new B(); A��ü ����
	static C outerfield4 = new C(); // w������ ����
	// ���� �޼ҵ�

	static void method2() {
		// B war1 = new B();
		C var2 = new C();// ������ ����
	}

}
