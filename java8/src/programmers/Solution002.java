package programmers;

public class Solution002 {
	public String solution(String s, int n) {
		String answer = "";
		char[] arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if (((int) arr[i]) >= 65 && ((int) arr[i] <= 90)) {
					arr[i] += n;
				}else if(((int) arr[i] >= 97) && ((int) arr[i] <= 122)){
					arr[i] += n;
				}
			if(((int) arr[i] > 90 && (int)arr[i] < 97) ||(int)arr[i] > 122) {
				arr[i] -= 26;
			}

			
			answer += arr[i];
		}
		
		return answer;
	}
}
