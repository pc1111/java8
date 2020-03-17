package java8_04;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day0317_05 {

	public static void main(String[] args) throws Exception{
		int intnum;
		double db1num;
		BufferedReader indr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수와 실수를 입력하세요! : ");
		intnum = Integer.parseInt(indr.readLine());
		db1num = Double.parseDouble(indr.readLine());
		System.out.println("입력한 정수는 " + intnum + " 입니다.");
		System.out.println("입력한 실수는 " + db1num + " 입니다.");
		
		indr.close();
		

	}

}
