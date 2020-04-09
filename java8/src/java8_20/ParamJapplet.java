package java8_20;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ParamJapplet extends JPanel{
	private static final long serialVersionUID = 1L;
	String title;
	
	public void init(String title) {
		this.title = title;
		if(title ==null)
			title = "전달받은 인수가 없음.";
	}
	public void paint(Graphics g) {
		g.drawString(title,  100, 100);
	}
	
}
