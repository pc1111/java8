package java8_05;

import java.util.Scanner;

public class Day0319_02 {
	
	/*�Էµ� ���� ¦������ Ȧ������ Ȯ���ϱ�*/
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	
	int inputNumber = 0;
	System.out.println("Ȧ���� ¦���� �Ǻ��ϴ� ���α׷��Դϴ�.");
	System.out.println("���ڸ� �Է��� �ּ��� :");
	
	inputNumber = s.nextInt();
	//String result = inputNumber % 2 == 0 ? "¦��" : "Ȧ��";
	
	String result ="";
	
	if(inputNumber % 2 == 0) {
		result = "¦��";
	}
	else result = "Ȧ��";
		
	
	System.out.println("�Է��Ͻ� ���ڴ� "+inputNumber+ "�̰�, �� ���ڴ�"+ result + "�Դϴ�.");
	s.close();
	}

}
