package java8_05;

import java.util.Random;

public class Day0319_07 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int now = rd.nextInt(4) + 9;
		System.out.println("����ð��� " + now +"�� �Դϴ�.");
		System.out.println("���� �ϰ�");

		switch(now) {
			case 9:
				System.out.println("9�ÿ��� ����� �մϴ�.");
			case 10:
				System.out.println("10�ÿ��� ȸ�Ǹ� �մϴ�.");
			case 11:
				System.out.println("11�ÿ��� ������ ó���մϴ�.");
			case 12:
				System.out.println("12�ÿ��� ������ �Խ��ϴ�.");
		}
	}

}
