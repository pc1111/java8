package java8;
import java.*;
import java.util.Scanner;

public class ScanEx4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요. : ");
		int text = s.nextInt();
		double dble = s.nextDouble();
		System.out.println(text);
		System.out.println(dble);
		s.close();
	}

}
