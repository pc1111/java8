package programmers;

public class Exam002 {

	public static void main(String[] args) {
		Solution002  sol = new Solution002();
		String array = new String();
		array = "a b c d e f g h i j k l m n o p q r s v w x y z";
//		array = "A B C D E F G H I J K L M N O P Q R S V W X Y Z";
		
		array = sol.solution(array,1);
		System.out.println(array);
	}

}
