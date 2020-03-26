package java9_10;

public class Day0326_07 {
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40, 50 };
		int[][] ary1 = {{10,20},{30,40},{50,60},{70,80}};
		
		for(int i = 0; i < ary1.length; i++)
		{
			for(int j = 0 ; j < ary1[i].length; j++)
			System.out.println(ary1[i]);
		}
		
		int[][] ary2 = {{110,20,30},{40},{50,60}};
		
		for(int i = 0 ; i < 3; i ++) {
			for(int j = 0 ; j < ary2[i].length ; j++)
				System.out.println(ary2[i][j]);
		}
		
		}
}
