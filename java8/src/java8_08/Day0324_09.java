package java8_08;

import java.util.Scanner;

public class Day0324_09 {

	public static void main(String[] args) {
		/*1 ~ 100 까지의 숫자를 컴퓨터가 하나를 가지고 있다. 
		 * 사용자가 답을 제시하면 up & down 을 하여 컴퓨터의 숫자를 맞추는 게임*/
		
		Scanner s = new Scanner(System.in);
		
		int user;
		int user_life = 10;
		int com = (int)(Math.random() * 100) + 1;
		
		System.out.println("컴퓨터가 가진 숫자를 맞추어 보세요" + com);
		while(true && user_life != 0)
		{
			System.out.print("1 ~ 100까지의 숫자를 선택해 주세요. \n >");
			user = s.nextInt();
			
			
			if(com > user)
				System.out.println("DOWN");
			else if(user > com)
				System.out.println("UP");
			else{
				System.out.println("정답입니다. 종료합니다.");
				break;		
			}
			user_life--;
			
		}
		

	}

}
