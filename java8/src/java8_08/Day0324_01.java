package java8_08;

public class Day0324_01 {

	public static void main(String[] args) {
		/*1 ~ 100 ���*/
		int add = 0;
		
		for(int i = 1 ; i <= 100; i++)
		{
			System.out.print(i +"\t");
			if(i % 10 == 0)
				System.out.println();
		}
		System.out.println();
		/* 1 ~ 100�߿� 3�� 5�� ������� �������ΰ���?*/
		for(int i = 1 ; i <= 100; i++)
		{
			
			if(i % 3 == 0 && i % 5 == 0)
				add += i;
		}
		System.out.println("1 ~ 100�߿� 3�� 5�� ������� ���� : " + add );
		
		/* 1 ~ 100�߿� ¦���� ���ϰ� Ȧ���� �A ���� ���ΰ���?*/
		System.out.println();
		add=0;
		for(int i = 1 ; i <= 100; i++)
		{
			
			if(i % 2 == 0)
				add += i;
			else add -=i;
		}
		System.out.println("1 ~ 100�߿� 3�� 5�� ������� ���� : " + add );
		
	}

}
