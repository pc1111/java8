package java8_19;

public class ThredClassEx {

	public static void main(String[] args) {
		Thread t1 = new ThreadClass("스레드1");
		Thread t2 = new ThreadClass("스레드2");
		
		t1.start();
		t2.start();
		

	}

}
