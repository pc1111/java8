package java8_16;

import java.io.File;
import java.util.Scanner;

public class TrywithResources {
	public void getData(String file) {
		Scanner s = null;
		try{
			s = new Scanner(new File(file));
			System.out.println(s.nextLine());
		}catch(Exception e) {
			System.err.println("예외발생");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		} finally { //입출력 스트림을 강제로 닫기 위해서 finally 구간을 이용 (1.6버전 이전)
			if( s != null) {
				s.close();
			}
		}
	}
	
	public static void main(String[] args) {
		TrywithResources twr = new TrywithResources();
		twr.getData("test.txt");
	}
}