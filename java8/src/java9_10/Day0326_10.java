package java9_10;

public class Day0326_10 {

	public static void main(String[] args) {
		
		if(args.length != 2 )
		{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			System.out.println("2���� ������ �Է��� �ּ���.");
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}
		String num1 = args[0];
		String num2 = args[1];
		int iNum1 = Integer.parseInt(num1);
		int iNum2 = Integer.parseInt(num2);
		System.out.println("num1 : " + num1 + ", num 2 : " + num2);
		System.out.println("num1 + num2 = " + (num1 + num2));

	}

}
