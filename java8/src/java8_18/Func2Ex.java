package java8_18;

public class Func2Ex {

	public static void main(String[] args) {
		Func2 fu1  = new Func2() {

			@Override
			public int method(int x, int y) {
				int result = x + y;
				return result;
			}
			
		};
		System.out.println(fu1.method(10, 20));
		Func2 fu2 = (int x, int y) ->{
			int result = x + y;
		return result;};
		System.out.println(fu1.method(10, 20));
		Func2 fu3 = (int x, int y) -> {return x + y;};
		System.out.println(fu1.method(10, 20));
		Func2 fu4 = (int x, int y) ->{return x + y;};
		System.out.println(fu1.method(10, 20));
	}

}
