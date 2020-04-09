/*package java8_16;

import java.io.File;
import java.util.Scanner;

public class TrywithResources2 {
	public void getData(String file) {
		
		try(Scanner s =new Scanner(new File(file)); Scanner s2 = new Scanner(System.in);){ //여러 개의 자동 닫힘 소스를 작성할수있다. 자동 닫침		
			System.out.println(s.nextLine());
		}catch(Exception e) {
			System.err.println("예외발생");
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
