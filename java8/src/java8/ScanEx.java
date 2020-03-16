package java8;
import java.*;
import java.util.Scanner;
public class ScanEx {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("키보드 입력 대기중");
			System.out.println(sc.next());
			sc.close();
	}

}
/*
 	컴퓨터가 한 줄의 끝으로 인식하는 것은 세미콜론(;)입니다.
 	사람이 한 줄의 끝으로 인식하는 것을 줄바꿈으로 사용하듯이 컴퓨터는 세미콜론을
 	사용합니다.
 */