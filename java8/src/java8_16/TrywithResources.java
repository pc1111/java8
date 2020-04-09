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
			System.err.println("���ܹ߻�");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		} finally { //����� ��Ʈ���� ������ �ݱ� ���ؼ� finally ������ �̿� (1.6���� ����)
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