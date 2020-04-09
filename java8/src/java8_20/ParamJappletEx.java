package java8_20;

import javax.swing.JFrame;

public class ParamJappletEx {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		ParamJapplet p = new ParamJapplet();
		p.init("Java");
		
		f.setSize(300, 300);
		//f.setTitle("애플릿 첫 예제");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
	}

}
