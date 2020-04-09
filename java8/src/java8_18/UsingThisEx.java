package java8_18;

public class UsingThisEx {

	public static void main(String[] args) {
		UsingThis usingThus = new UsingThis();
		UsingThis.Inner inner = usingThus.new Inner();
	}

}
