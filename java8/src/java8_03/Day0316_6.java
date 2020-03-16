package java8_03;

public class Day0316_6 {

	public static void main(String[] args) {
		boolean var1 = true, var2 = false, var3 = true, var4 = false;
		
		System.out.println(var1 && var2);
		System.out.println(var2 && var3);
		System.out.println(var1 && var3);
		System.out.println(var2 && var4);
		System.out.println();
		
		System.out.println(var1 || var2);
		System.out.println(var2 || var3);
		System.out.println(var1 || var3);
		System.out.println(var2 || var4);
		System.out.println();
		
		System.out.println(!var1);
		System.out.println(!var2);
		
		boolean light = false;
		System.out.println("스탠드의 전구가 켜졌나요?" + light);
		light = !light;
		System.out.println("스탠드의 전구가 켜졌나요?" + light);
		light = !light;
		System.out.println("스탠드의 전구가 켜졌나요?" + light);
		light = !light;
		System.out.println("스탠드의 전구가 켜졌나요?" + light);
	}

}
