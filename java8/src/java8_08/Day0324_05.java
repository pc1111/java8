package java8_08;

import java.util.Scanner;

public class Day0324_05 {

	public static void main(String[] args) {
		/*������ ������� �Է� �޾Ƽ�
		 * 
		 *  @
		 *  @@
		 *  @@@
		 *  @@@@
		 *  @@@
		 *  @@
		 *  @
		 *  ���� ���� ���·� ���
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ���� ����Ұ��Դϱ�? (�� Ȧ���� �Է����ֽñ�ٶ��ϴ�.)");
		int line = s.nextInt();
		
		if(line % 2 == 1)
		{
			for(int i = 0 ; i < line ;i ++)
			{
				if(line /2 > i)
				{
					for(int j = 0; j <= i ; j++)
					{
						System.out.print("@");
					}
				}
				else
				{
					for(int j = line ; j > i; j --)
					{
						System.out.print("@");
					}
				}
				System.out.println("");
			}
		}

	}

}
