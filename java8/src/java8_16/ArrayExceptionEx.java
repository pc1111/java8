package java8_16;

public class ArrayExceptionEx {

	public static void main(String[] args)throws ArithmeticException{
		exceptionTest();
	}
	
	static void exceptionTest() {
		int[] arr = new int[3];
		try {
			arr[2] = 100;
			System.out.println(arr[2]);
//			throw new ArrayIndexOutOfBoundsException();// ���������� ���� �߻���Ű���� ��ü�� �����ؼ� throw �Ѵ�.
//			throw new ArithmeticException(); throw �ߺ� �Ұ�?
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("�迭�� ������ �Ѿ�ų�, ���� ������ �Ұ����մϴ�.");
		} /*catch(ArithmeticException e) {
			System.out.println("���� ������ �Ұ����մϴ�."); // 
		}*/ catch(Exception e) { // Exception�� �ֻ����̱� ������ ���� �������� ����ؾ����� ������ �߻������ʴ´�.
			System.out.println("�߻��� ��� ���ܸ�ó���մϴ�.");
			e.printStackTrace();
		}finally { //���ܿ� ������� ������ �����ϴ� �����Դϴ�. ���������մϴ�.
			System.out.println("finally �����Դϴ�.");
		}
//		ArithmeticException ������� ����ó��  
//		Exception �ֻ��� ����ó��, � �������� �𸦋� ���
//		���ܰ� �߻��ϸ� �� �ؿ��ִ� �۾����� �������ʴ´�
	}
}
