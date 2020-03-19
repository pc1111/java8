package java8_05;

public class Day0319_05 {

	public static void main(String[] args) {
		System.out.println("주사위 게임을 시작합니다.");
		
		int dice = (int)(Math.random() * 6) + 1;
		
		System.out.println("주사위를 던집니다.");
		
		if(dice == 1) System.out.println("주사위 눈금은 1.");
		else if(dice ==2 ) System.out.println("주사위 눈금은 2.");
		else if(dice ==3 ) System.out.println("주사위 눈금은 3.");
		else if(dice ==4 ) System.out.println("주사위 눈금은 4.");
		else if(dice ==5 ) System.out.println("주사위 눈금은 5.");
		else System.out.println("주사위 눈금은 6.");
		

	}

}
