package java8_08;

import java.util.Scanner;

public class Day0324_04 {

	public static void main(String[] args) {
		/*������ ������� �Է� �޾Ƽ�
		 * 
		 *  @
		 *  @@
		 *  @@@
		 *  @@@@
		 *  ���� ���� ���·� ���
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ���� ����Ұ��Դϱ�? : ");
		int temp = s.nextInt();
		
		for(int i = 0 ; i < temp ; i ++)
		{
			for(int j = 0 ; j <= i ; j++)
				System.out.print("@");
			System.out.println();
		}

	}

}
