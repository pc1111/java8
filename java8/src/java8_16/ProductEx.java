package java8_16;

import java8_15.TV;

public class ProductEx {

	public static void main(String[] args) {
		Product<TV, String> p1 = new Product<>();
		p1.setKind(new TV());
		p1.setModel("»ï¼º ÆÄºê");
		System.out.println(p1.getModel());
		
		Product<Car, Integer> p2 = new Product<Car, Integer>();
		p2.setKind(new Car());p2.setModel(new Integer(30));
	}

}
