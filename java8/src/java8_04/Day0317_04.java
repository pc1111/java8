package java8_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Day0317_04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int number;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		
		System.out.print("�⵵�� �Է��ϼ���! : ");
		number = Integer.parseInt(inbr.readLine());
		System.out.println("�Է��� �⵵�� " + number + "�� �Դϴ�.");
		
		inbr.close();
		isr.close();

	}

}
