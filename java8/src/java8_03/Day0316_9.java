package java8_03;

public class Day0316_9 {

	public static void main(String[] args) {
		int deagu = 2_000_000;
		int global = 1_000_000;
		
		String str = deagu >= global ? "대구광역시" : "대구시" ;
		
		System.out.println(str);
	}

}
