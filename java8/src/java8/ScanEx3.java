package java8;
import java.*;
import java.util.Scanner;

public class ScanEx3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요. : ");
		String text = s.nextLine();
		System.out.println(text);
		s.close();
	}

}
