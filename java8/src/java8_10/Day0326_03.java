package java9_10;

public class Day0326_03 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30};
		int sum = 0;
		
		for(int i = 0; i < 3; i++)
			sum += arr[i];
		
		System.out.println(sum);
		
		int[] arr2 = {10, 20, 30, 40, 50};
		int sum2 = 0;
		double avg2 = 0.0;
		for(int i = 0 ; i < 5; i ++)
			sum2 += arr2[i];
		
		avg2 = sum2 / 5.0;
		
		System.out.println("�迭�� �հ� : " + sum2);
		System.out.println("�迭�� ��� : " + avg2);
		System.out.println("�迭�� ���� : " + arr2.length); // length�� �迭�� ũ�⸦ ���
		
		int[] arr3 = {10, 20, 30, 40, 50};
		for(int i=0; i<5; i++) {
			System.out.println(arr3[i]);
		}

	}

}
