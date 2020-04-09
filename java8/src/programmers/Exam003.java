package programmers;

public class Exam003 {

	public static void main(String[] args) {
		Solution003 sol = new Solution003();
		
		int arr[] = {1,2,3,4,5,1,2,3,3,4,3,1,2,2,3};
		arr=sol.solution(arr);

		System.out.println(arr[0]);
	}

}
