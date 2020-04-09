package java8_15;

/*바깥 클래스*/
public class A {

	A() {
		System.out.println("A 객체가 생성됨");
	}

	/* 인스턴스 맴버 클래스 */

	class B {
		B() {
			System.out.println("B 객체가 생성됨");
		}
//		static int field2; 인스턴스 맴버 클래스는 스태틱타입을 가질수없다.
		int field1;

		void method1() {

		}
	}

	// 정적 맴버 클래스
	static class C {
		C() {
			System.out.println("C 객체가 생성됨");
		}

		int field1;
		static int filed2;

		void method1() {

		}

		static void method2() {

		}
	}

	void method() {
		// 로컬 클래스
		class D {
			D() {
				System.out.println("D 객체가 생성됨");
			}

			int field1;
//			static int field2; 로컬클래스는 스태틱타입을 가질수없다.
			void method1() {
			}
		}
	}

	// 인스턴스 필드
	B outerfield1 = new B();
	C outerfield2 = new C();

	void method1() {
		B var1 = new B();
		C var2 = new C();
	}

	// 정적 필드 초기화
	// static B outerfield3 = new B(); A객체 없음
	static C outerfield4 = new C(); // w정적은 가능
	// 정적 메소드

	static void method2() {
		// B war1 = new B();
		C var2 = new C();// 정적은 가능
	}

}
