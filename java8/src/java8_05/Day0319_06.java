package java8_05;

public class Day0319_06 {

	public static void main(String[] args) {
	System.out.println("�ֻ��� ������ �����մϴ�.");
		
		int dice = (int)(Math.random() * 6) + 1;
		
		System.out.println("�ֻ����� �����ϴ�.");
		/*
		if(dice == 1) System.out.println("�ֻ��� ������ 1.");
		else if(dice ==2 ) System.out.println("�ֻ��� ������ 2.");
		else if(dice ==3 ) System.out.println("�ֻ��� ������ 3.");
		else if(dice ==4 ) System.out.println("�ֻ��� ������ 4.");
		else if(dice ==5 ) System.out.println("�ֻ��� ������ 5.");
		else System.out.println("�ֻ��� ������ 6.");
		*/
		switch(dice)
		{
			case 1 : 
				System.out.println("�ֻ��� ������ 1."); break;
			case 2 :
				System.out.println("�ֻ��� ������ 2."); break;
			case 3 : 
				System.out.println("�ֻ��� ������ 3."); break;
			case 4 : 
				System.out.println("�ֻ��� ������ 4."); break;
			case 5 : 
				System.out.println("�ֻ��� ������ 5."); break;
			default : 
				System.out.println("�ֻ��� ������ 6."); 
		}
		System.out.println("������ �����մϴ�.");


	}

}