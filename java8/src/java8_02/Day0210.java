package java8_02;

public class Day0210 {

	public static void main(String[] args) {
		double apple = 1.0;
		double unit = 0.1;
		System.out.println("��� �� ���� 10�������� ������ 7������ �Ծ����ϴ�.");
		System.out.print("���� ������ �� �����ϱ��? ");
		
		double result = apple - unit * 7;
		System.out.println(result);
		
		// �Ǽ��� ��Ȯ�� ������ ���� �ʴ´�. �ε��Ҽ������� ����ϱ� ����
		// ���� �� ���� ���� ���� �Ŀ� �Ǽ��� ǥ�� 
		
		double result2 = 1000000000000000000000000000000000000000000000000000000000000000000000000000000000.0 + 1.0;
		System.out.println(result2);
		
		int apple2 =1;
		double unit2 = 1;
		
		double result3 = (apple2 * 10 - unit2 *7) / 10;
		System.out.println(result3);
	}

}
