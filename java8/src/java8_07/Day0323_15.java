package java8_07;

public class Day0323_15 {

	public static void main(String[] args) {
		/*1 ~ 100 �߿� 5�� ����� �� ��� */
		
		int add = 0,temp = 0;
		for(int i = 0; i <= 100;i = temp * 5)
		{
			add += i;
			temp++;
		}
		System.out.println("1 ~ 100 �߿� 5�� ����� �� : " + add);
		/*1 ~ 50 �߿� 3�� ����� ȭ�鿡 ����ϼ���. */
		temp = 1;
		for(int i = 3; i <= 50;i = temp * 3)
		{
			System.out.print(i + "\t");
			
			if( temp % 10 == 0)
				System.out.println("");
			temp++;
		}
		System.out.println("");
		/* 1 ~ 50�߿� 3�� ��� �� �հ� ������ ����ϼ���. */
		
		temp = 1; add = 0;
		
		for(int i = 3; i <= 50;i = temp * 3)
		{
			add += i;
			temp++;
		}
		System.out.println("1 ~ 50 �߿� 3�� ����� �� : " + add + ",���� : "+ (temp-1));
	}

}
