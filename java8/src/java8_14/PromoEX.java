package java8_14;

public class PromoEX {

	public static void main(String[] args) {
		PromoChild pc = new PromoChild();
		pc.method1();
		pc.method2();
		pc.method3();

		PromoParent pp = pc;
		pp.method1();
		pp.method2();
//		pp.method3(); 부모의 형태이기 떄문에 자식의 메소드를 사용할 수 없습니다.

		pc = (PromoChild) pp; // 자식에 부모를 대입할 수 없습니다. 강제형변환은 가능하다.
		pc.method1();
		pc.method2();
		pc.method3();
		// 부모의 객체가 자식의 객체에 대입될 때는 그 원래부터 자식 객체였어야만 함

		PromoParent pp2 = new PromoParent();
		if (pp2 instanceof PromoChild) { // instanceof는 형변환이 가능한지 boolean값으로 반환합니다.
			pc = (PromoChild) pp2;
			pc.method3();
		} else {
			System.out.println("강제형변환을 사용할 수 없습니다.");
		}
		if (pp instanceof PromoChild) { // instanceof는 형변환이 가능한지 boolean값으로 반환합니다.
			pc = (PromoChild) pp;
			pc.method3();
		} else {
			System.out.println("강제형변환을 사용할 수 없습니다.");
		}

	}

}
