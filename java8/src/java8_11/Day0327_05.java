package java8_11;

import java.util.Arrays;

public class Day0327_05 {

	public static void main(String[] args) {
		/* 1. 1~45를 입력한 배열을 작성한다.
		 * 2. 작성한 배열을 무작위로 섞는다.
		 * 3. 0번 ~6번 까지 출력
		 * 
		 */
		int[] arry = new int[45];
		int random = (int)(Math.random()*10000) + 1;
		int c_sufl,f_sufl,swap;
		for(int i = 0 ; i < arry.length;i++)
		{
			arry[i] += i+1; 
		}
		
		System.out.println(random + "번 섞는다.");
		
		while(random > 0){
			
			f_sufl = (int)(Math.random()*45) ;
			do{
				c_sufl = (int)(Math.random()*45);
			}while(f_sufl ==c_sufl);
			
			System.out.print(f_sufl + "번, " + "------>" + c_sufl + "번 ///////  ");
			System.out.println(c_sufl + "번, " + "------>" + f_sufl + "번, ");
			
			swap = arry[f_sufl];
			arry[f_sufl] = arry[c_sufl];
			arry[c_sufl] = swap;
			
			random--;
		}
		
		int[] ary = Arrays.copyOf(arry, 6);
		Arrays.sort(ary);
		System.out.println("\n- 당 첨 번 호 -");
		for(int i = 0 ; i < 6;i++)
			System.out.print(ary[i] + "\t");
		System.out.println("\n 보너스 번호 : " + arry[6]);
		
		
	}

}
