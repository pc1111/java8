package java8_11;

public class Day0327_04 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][7];
		
		int count = 1;
		

		for(int i = 0 ; i < arr.length; i++ )
		{
			if(i % 2 == 0)
			{
				for(int j = 0 ; j < arr[i].length ; j++)
				{
					arr[i][j] = count++;
				}
			}
			else {
				for(int j = arr[i].length - 1;j >= 0 ;j--)
				{
					arr[i][j] = count++;
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length; j++)
				System.out.print(arr[i][j] +"\t");
			System.out.println();
		}
		
		
		

	}

}
