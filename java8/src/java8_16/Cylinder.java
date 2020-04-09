package java8_16;

public class Cylinder extends Circle {
	
	int height;
	
	public Cylinder(int r, int h) {
		super(r);
		this.height = h;
	}

	double volume() {
		double area = area(r);
		return area *r;
	}
	
	String showCylinder() {
		return showCircle() + ", Height : " + height;
	}


}
