package java8_06;

import java.util.Random;
import java.util.Scanner;

public class Day0320_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		int score = 0;
		int life = 3;
		
		while (life > 0 || user != "q") {
			
			System.out.println("���� = a , ���� = b, �� = c, ���� = q");
			user = s.next();

			int number = (int) (Math.random() * 3);
			System.out.println(number);

			switch (user) {
			case "A":
			case "a":
				user = ga;
				break;
			case "B":
			case "b":
				user = ba;
				break;
			case "C":
			case "c":
				user = bo;
				break;
			case "Q":
			case "q":
				break;
			default:
				user = "error";
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

			if (user == "error")
				System.exit(0);

			switch (number) {
			case 0:
				com = ga;
				break;
			case 1:
				com = ba;
				break;
			case 2:
				com = bo;
				break;
			}
			
			if(user.equals("q")) break;
			
			
			if ((user == "����" && com == "��") || (user == "����" && com == "����") || (user == "��" && com == "����")) {
				System.out.println("player ��! ��� : " + user + ", ��ǻ�� :" + com);
				score += 100;
			} else if ((com == "����" && user == "��") || (com == "����" && user == "����") || (com == "��" && user == "����")) {
				System.out.println("compuet ��! ��� : " + user + ", ��ǻ�� : " + com);
				life--;
			} else {
				System.out.println("���º�! ��� : " + user + ", ��ǻ�� : " + com);
				score += 10;
			}
			
			System.out.println("���� ���� : " + score + ", ���� ������ : " + life);
			// �ڹٿ��� ���ڿ��� ���ϱ����ؼ��� ����.equals(��) �� ����ؾ��Ѵ�.
		}
		System.out.println("������ �������ϴ�. \n�� ���� : " + score);
	}

}
