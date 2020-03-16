package java8;
import java.*;
import java.util.Scanner;

public class ScanEx2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요. : ");
		String text = s.next();
		System.out.println(text);
		System.out.println(s.hasNext());
		System.out.println(s.next());
		System.out.println(s.hasNext());
		s.close();
	}

}
