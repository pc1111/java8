package java8_07;

import java.util.Scanner;

public class Day0323_17 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int life = 3, score = 0;
		String ga = "가위", ba = "바위", bo = "보";
		
		String user = "";
		int com;
		String computer = null,player;
		while(life != 0 && !user.equals("q") && !user.equals("Q")) {
			
			System.out.println("가위 : a, 바위 : b, 보 : c,종료 : q");
			 user = s.nextLine();
			
			System.out.println(user);
			com = (int)(Math.random() * 3);
			
			switch(com) 
			{
				case 0 :
					computer = ga;
					break;
				case 1 :
					computer = ba;
					break;
				case 2 : 
					computer = bo;
					break;
			}
			
			switch(user) {
				case "a":
				case "A":
					player = ga;
					break;
				case "s":
				case "S":
					player = ba;
					break;
				case "d":
				case "D":
					player = bo;
					break;
				case "q":
				case "Q":
					player = "error";
					System.out.println("게임을 강제종료합니다.");
					break;
				default :
					player = "error";
					System.out.println("잘못 입력하셨습니다.");
			}
			
			if( player.equals("error"))
			{
				if(user.equals("q") && user.equals("Q"))
					break;
				continue;
			}
			
			if((player.equals(ga) && computer.equals(bo)) || (player.equals(ba) && computer.equals(ga))  || (player.equals(bo) && computer.equals(ba)))
			{
				score += 100;
				System.out.println("player가 이겼습니다. \nplayer : " + player + "\tcompuer : "+ computer + "\n" + "life : " + life + " score : " + score);
			}else if(player.equals(computer))
			{
				score += 10;
				System.out.println("비겼습니다. \nplayer : " + player + "\tcompuer : "+ computer + "\n" + "life : " + life + " score : " + score);
			}else
			{
				life--;
				System.out.println("player가 졌습니다. \nplayer : " + player + "\tcompuer : "+ computer + "\n" + "life : " + life + " score : " + score);
			}
		}
		if(!user.equals("q")&&!user.equals("Q"))
		System.out.println("\n게임이 끝났습니다.\n총점 : " + score);
		
		s.close();
	}

}
