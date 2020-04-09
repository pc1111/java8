package java8_19;

public class Stack<T> {
	int position;
	Object[] stck;
	public Stack() {
		position = 0;
		stck = new Object [20];
	}
	
	public void push(T time) {
		if(position == 20)
			return;
		stck[position] = time;
		position++;
	}
	
	public T pop() {
		if(position == 0)
			return null;
		position--;
		return (T)stck[position];
	}
}
