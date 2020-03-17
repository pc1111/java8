package java8_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Day0317_04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int number;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		
		System.out.print("년도를 입력하세요! : ");
		number = Integer.parseInt(inbr.readLine());
		System.out.println("입력한 년도는 " + number + "년 입니다.");
		
		inbr.close();
		isr.close();

	}

}
