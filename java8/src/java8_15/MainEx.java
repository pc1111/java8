package java8_15;

public class MainEx {

	public static void main(String[] args) {
		A.C.filed2 =10; // static 맴버는 객체없이 사용 가능합니다.
		A.C.method2();
		A.C c = new A.C();
		c.field1 = 10;
		c.filed2 = 10;
		c.method1();
		c.method2();
		
		
		A a = new A();
//		A.B b = new A.B(); 먼저하면 안됨
		A.B b = a.new B(); //인스턴스 맴버 클래스의 객체화(정적 맴버 클래스와 객체화 코드가 다르다.
		b.field1 = 10;
		b.method1();
		
		a.method1(); // 로컬클래스 D를 사용하는 메서드
	}

}
