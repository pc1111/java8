package java8_04;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day0317_05 {

	public static void main(String[] args) throws Exception{
		int intnum;
		double db1num;
		BufferedReader indr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Ǽ��� �Է��ϼ���! : ");
		intnum = Integer.parseInt(indr.readLine());
		db1num = Double.parseDouble(indr.readLine());
		System.out.println("�Է��� ������ " + intnum + " �Դϴ�.");
		System.out.println("�Է��� �Ǽ��� " + db1num + " �Դϴ�.");
		
		indr.close();
		

	}

}
