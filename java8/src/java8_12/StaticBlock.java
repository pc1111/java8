package java8_12;

public class StaticBlock {
	
	static String company = "�Ｚ";
	static String kind = "LCD";
	static String prodyct = company + " -" + kind;
	
	static String pro2;
	
	static {
		pro2 = company + " -" + kind;
	}
}
