package java8_10;

public class Day0326_08 {

	public static void main(String[] args) {

		int[][] ary1 = new int[][] {{10,20}, {30,40},{50,60}};
		System.out.println(ary1.length);
		System.out.println(ary1[0].length);
		System.out.println(ary1[1].length);
		System.out.println(ary1[2].length);

		System.out.println();
		int[][] ary2 = new int[3][2];
		System.out.println(ary2.length);
		System.out.println(ary2[0].length);
		System.out.println(ary2[1].length);
		System.out.println(ary2[2].length);

		/*길이가 다른 2차원 배열*/
		int[][] ary3 = new int[3][3];
		int[] ary4 = new int[1];
		int[] ary5 = new int[4];
		
		ary3[0] = ary4;

	}

}
