package java8_20;

import java.awt.Color;

import javax.swing.JFrame;

public class PolygonJAppletEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("�簢���׸���");
		PolygonJApplet p = new PolygonJApplet();
		
		f.add(p);
		f.setBackground(Color.YELLOW);
		f.setSize(500,500);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
