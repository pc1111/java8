package java8_05;

public class Day0319_04 {

	public static void main(String[] args) {
		int number = 10;
		String isOk ="";
		
		
		if(number == 1) {
			isOk = "찾았습니다.";
		} else if(number ==2) {
			isOk = "찾았습니다.";
		} else if(number ==3) {
			isOk = "찾았습니다.";
		} else if(number ==4) {
			isOk = "찾았습니다.";
		} else if(number ==5) {
			isOk = "찾았습니다.";
		} else if(number ==6) {
			isOk = "찾았습니다.";
		} else if(number ==7) {
			isOk = "찾았습니다.";
		} else if(number ==8) {
			isOk = "찾았습니다.";
		} else if(number ==9) {
			isOk = "찾았습니다.";
		} else {
			isOk = "찾았습니다.";
		}
		
		System.out.println(isOk);
		
		
		for(int i  = 1 ; i<=10;i++) {
			if(number == i) {
				isOk = "찾았습니다."; 
				System.out.println(isOk);
			}
		}
		

	}

}
