package programmers;

public class Solution003 {
	public int[] solution(int[] answers) {
        int[] answer = {};
        answer = answers;
        int student1[] = {1 ,2 ,3 ,4 ,5};
        int student2[] = {2, 1, 2 ,3 ,2 ,4 ,2 ,5};
        int student3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int st1 = 0;
        int st2 = 0;
        int st3 = 0;
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i = 0 ; i < answer.length;i++)
        {
        	if(st1 >= student1.length)
        		st1 = 0;
        	if(st2 >= student2.length)
        		st2 = 0;
        	if(st3 >= student3.length)
        		st3 = 0;
        	
        	if(student1[st1] == answer[i])
        		count1++;
        	if(student2[st2] == answer[i])
        		count2++;
        	if(student3[st3] == answer[i]) 
        		count3++;
        	
        	st1++;
        	st2++;
        	st3++;
        }
        
        System.out.println(count1 + " " + count2 + " " + count3);
        
         if(count1 > count2&& count1 > count3) {
        	answer = new int[] {1};
        	System.out.println("1크다");
        }else if(count2 > count1 && count2 > count3) {
        	answer = new int[] {2};
        	System.out.println("2크다");
        }else if(count3 > count1 && count3 > count2){
        	answer = new int[] {3};
        	System.out.println("3크다.");
        }else if(count1 == count2 && count2 == count3) {
        	answer = new int[] {1 , 2, 3};
        	System.out.println("다같다");
        }else if(count1 == count2 && count2 != count3) {
        	answer = new int[] {1 , 2};
        	System.out.println("1이랑 2같다");
        }else if(count1 == count3 && count2 != count3) {
        	answer = new int[] {1 , 3};
        	System.out.println("1이랑 3같다");
        }else if(count3 == count2 && count1 != count3) {
        	answer = new int[] {2 , 3};
        	System.out.println("2랑 3같다");
        }
        
         for(int i=0 ; i < answer.length;i++)
         System.out.println(answer[i]);
         
        return answer;
    }
}
