package java8_12;

public class ComputerEx {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30};
		Computer com = new Computer();
		int res1 = com.sum(arr1);
		System.out.println(res1);
		
		int res2 = com.sum(new int[] {10, 20, 30, 40, 50});// �޼ҵ��� �Ű������� ����ҋ��� ��ü���·� ���������� �����ϴ�
		System.out.println(res2);
		
		int res3 = com.sum2(arr1);
		System.out.println(res3);
		
		int res4 = com.sum2(new int[] {10, 20, 30, 40, 50});// �޼ҵ��� �Ű������� ����ҋ��� ��ü���·� ���������� �����ϴ�
		System.out.println(res4);
		
		//int res5 = com.sum2({10, 20, 30}); ���Ұ� 
		int res5 = com.sum2(10,20,30,40,50);
		System.out.println(res5);
		
		int res6 = com.sum2(10, 20, 30);
	}

}
