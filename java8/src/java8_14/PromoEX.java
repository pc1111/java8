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
//		pp.method3(); �θ��� �����̱� ������ �ڽ��� �޼ҵ带 ����� �� �����ϴ�.

		pc = (PromoChild) pp; // �ڽĿ� �θ� ������ �� �����ϴ�. ��������ȯ�� �����ϴ�.
		pc.method1();
		pc.method2();
		pc.method3();
		// �θ��� ��ü�� �ڽ��� ��ü�� ���Ե� ���� �� �������� �ڽ� ��ü����߸� ��

		PromoParent pp2 = new PromoParent();
		if (pp2 instanceof PromoChild) { // instanceof�� ����ȯ�� �������� boolean������ ��ȯ�մϴ�.
			pc = (PromoChild) pp2;
			pc.method3();
		} else {
			System.out.println("��������ȯ�� ����� �� �����ϴ�.");
		}
		if (pp instanceof PromoChild) { // instanceof�� ����ȯ�� �������� boolean������ ��ȯ�մϴ�.
			pc = (PromoChild) pp;
			pc.method3();
		} else {
			System.out.println("��������ȯ�� ����� �� �����ϴ�.");
		}

	}

}
