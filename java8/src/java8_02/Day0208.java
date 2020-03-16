package java8_02;

import java.util.Random;

public class Day0208 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int dice = 0; 
		
		dice = r.nextInt(6)+1;
		
		System.out.println(dice);
	}

}
