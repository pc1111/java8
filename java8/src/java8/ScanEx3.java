package java8;
import java.*;
import java.util.Scanner;

public class ScanEx3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��� �ּ���. : ");
		String text = s.nextLine();
		System.out.println(text);
		s.close();
	}

}
