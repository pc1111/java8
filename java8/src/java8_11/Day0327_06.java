package java8_11;

public class Day0327_06 {

	public static void main(String[] args) {
		/*
		 * �ζ� ������ �ۼ�
		 * 1. 6���� ������ ����(1~45)�� �迭�� �Է��ϼ��� 
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
		System.out.println("- �� ÷ �� ȣ -");
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
