package java8_16;

public class Box2<T> {//제네릭은 타입매게변수
	private T Object;
	public void set(T Object) {
		this.Object = Object;
	}
	
	public T get() {
		return Object;
	}
	
	
	
}
