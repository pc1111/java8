package java8_11;

public class Day0327_06 {

	public static void main(String[] args) {
		/*
		 * 로또 생성기 작성
		 * 1. 6개의 랜덤한 숫자(1~45)를 배열에 입력하세요 
		 * */
		
		int arr[] = new int[45];
		int t;
		for(int i = 0 ; i < 6; i++)
		{
			do{
				arr[(int)(Math.random() *45)] = 1;
			}while(arr[(int)(Math.random() *45)] == 1);
		}
		
		int count=6;
		System.out.println("- 당 첨 번 호 -");
		for(int i = 0 ; i < arr.length;i++)
		{
			if(arr[i] == 1)
			{
				System.out.print((i+1) + "\t");
				count--;
			}
			if(count == 0)
				break;
		}
		
	}

}
