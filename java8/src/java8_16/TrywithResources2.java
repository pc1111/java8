/*package java8_16;

import java.io.File;
import java.util.Scanner;

public class TrywithResources2 {
	public void getData(String file) {
		
		try(Scanner s =new Scanner(new File(file)); Scanner s2 = new Scanner(System.in);){ //���� ���� �ڵ� ���� �ҽ��� �ۼ��Ҽ��ִ�. �ڵ� ��ħ		
			System.out.println(s.nextLine());
		}catch(Exception e) {
			System.err.println("���ܹ߻�");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		TrywithResources2 twr = new TrywithResources2();
		twr.getData("test.txt");
	}
}*/
