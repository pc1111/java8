package java8_17;

public class CounterEx {

	public static void main(String[] args) {
		Counter counter = null;
		for(int i = 0 ; i <= 50; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc();
		}

	}

}
