package java8_20;

import javax.swing.JFrame;

public class RoundRectEX {

	public static void main(String[] args) {
		JFrame f = new JFrame("�簢���׸���");
		RoundRect p = new RoundRect();
		p.init();
		
		f.add(p);
		f.setSize(500,500);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
