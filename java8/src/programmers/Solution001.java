package programmers;

import java.util.Arrays;

public class Solution001 {
	  public int[] solution(int[] array, int[][] commands) {
	        int[] answer = {};
	        int[] arr = {};
	        int temp;
	        answer = new int[commands.length];
	        
	        for(int i = 0 ; i < commands.length; i++)
	        {
	        	System.out.println("?");
	        	arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
	        	

	        	Arrays.parallelSort(arr);
	        	
	        	answer[i] = arr[commands[i][2]-1];
	        	
	        }
	        return answer;
	   }
}
