package java8_20;

import java.awt.Color;

import javax.swing.JFrame;

public class FontJAppletEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("폰트 변환 예제");
		FontJApplet p = new FontJApplet();
		
		p.init();
		
		f.setSize(600, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}

}
