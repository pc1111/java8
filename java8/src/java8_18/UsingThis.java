package java8_18;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			MyFunctionallnterface fi = () ->{
				System.out.println("outterField :" + outterField);
				System.out.println("outterField :" + UsingThis.this.outterField);
				System.out.println("innerField :" + innerField);
				System.out.println("innerField :" +this.innerField + "\n");
			};
			fi.method();
			
			MyFunctionallnterface fi2 = new MyFunctionallnterface() {
				
				@Override
				public void method() {
					System.out.println("outterField :" + outterField);
					System.out.println("outterField :" + UsingThis.this.outterField);
					System.out.println("innerField :" + innerField);
//					System.out.println("innerField :" +this.innerField + "\n");
				}
			};
		}
	}
}
