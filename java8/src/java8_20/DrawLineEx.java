package java8_20;

import javax.swing.JFrame;

public class DrawLineEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("���α׸���");
		DrawLine p = new DrawLine();
		p.init();
		
		f.add(p);
		f.setSize(500,500);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
