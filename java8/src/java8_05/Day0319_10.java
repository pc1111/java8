package java8_05;

import java.util.Random;
import java.util.Scanner;

public class Day0319_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		
		user = s.next();
		
		int number = (int)(Math.random() *3);
		System.out.println(number);
		
		switch(user)
		{
			case "A" :
			case "a" :
				user = ga;
				break;
			case "B" :
			case "b" :
				user = ba;
				break;
			case "C" :
			case "c" :
				user = bo;
				break;
			default :
				user = "error";
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		if(user == "error") System.exit(0);
		
		switch(number) {
		case 0:
			com = "����";
			break;
		case 1:
			com = "����";
			break;
		case 2:
			com = "��";
			break;
		}
		if((user == "����" && com == "��") || (user == "����" && com == "����") || (user == "��" && com == "����")) {
			System.out.println("player ��! ��� : " + user + ", ��ǻ�� :" + com);
		}else if((com == "����" && user == "��") || (com == "����" && user == "����") || (com == "��" && user == "����")) {
			System.out.println("compuet ��! ��� : " + user + ", ��ǻ�� : "+ com);
		}else System.out.println("���º�! ��� : " + user + ", ��ǻ�� : " + com);
		
	}

}
