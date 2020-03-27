package java8_11;

import java.util.Arrays;

public class Day0327_05 {

	public static void main(String[] args) {
		/* 1. 1~45�� �Է��� �迭�� �ۼ��Ѵ�.
		 * 2. �ۼ��� �迭�� �������� ���´�.
		 * 3. 0�� ~6�� ���� ���
		 * 
		 */
		int[] arry = new int[45];
		int random = (int)(Math.random()*10000) + 1;
		int c_sufl,f_sufl,swap;
		for(int i = 0 ; i < arry.length;i++)
		{
			arry[i] += i+1; 
		}
		
		System.out.println(random + "�� ���´�.");
		
		while(random > 0){
			
			f_sufl = (int)(Math.random()*45) ;
			do{
				c_sufl = (int)(Math.random()*45);
			}while(f_sufl ==c_sufl);
			
			System.out.print(f_sufl + "��, " + "------>" + c_sufl + "�� ///////  ");
			System.out.println(c_sufl + "��, " + "------>" + f_sufl + "��, ");
			
			swap = arry[f_sufl];
			arry[f_sufl] = arry[c_sufl];
			arry[c_sufl] = swap;
			
			random--;
		}
		
		int[] ary = Arrays.copyOf(arry, 6);
		Arrays.sort(ary);
		System.out.println("\n- �� ÷ �� ȣ -");
		for(int i = 0 ; i < 6;i++)
			System.out.print(ary[i] + "\t");
		System.out.println("\n ���ʽ� ��ȣ : " + arry[6]);
		
		
	}

}
