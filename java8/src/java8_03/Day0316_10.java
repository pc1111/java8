package java8_03;

import java.util.Scanner;

public class Day0316_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean bl1 ;
		
		System.out.println("�����Դϱ�?(���� : 1, �����ƴ�: 0) - ");
		int anser = sc.nextInt();
		
		System.out.println("�α�(����: ��) - ");
		int anser2 = sc.nextInt();
		
		System.out.println("������ ��(����: ��) - ");
		int anser3 = sc.nextInt();
		// �� ������ �����̰� �α��� 100�� �̻��̿����Ѵ�.
		// �� �ҵ��� 1�� �̻��� �α��� 50�� �̻��̾�Ѵ�.
		
		int str = anser >= 1 ? 1 : 0;
		int str2 = anser2 >= 100 ? 1 : 0;
		int str3 = anser3 >= 50 ? 1 : 0;
		
		int add = str + str2 + str3;
		
		boolean lot = add == 3 ? true : false;
		System.out.println("��Ʈ�������� ���� : " + lot);
		
		
		
	}
}
