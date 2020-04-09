package java8_16;

public class Circle {
	
	static final double PI = 3.14;
	int r;
	
	public Circle(int r) {
		this.r =r;
	}
	
	double area(int r) {
		this.r =r;
		return PI *r *r;
	}
	
	String showCircle() {
		return "Radius : " + r;
	}
}
