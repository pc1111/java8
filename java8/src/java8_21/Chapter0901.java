package java8_21;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chapter0901 extends JPanel {
	int[] input = {30, 15, 45, 10};
	String[] title = {"Äá", "¹Ð","½Ò","¿Á¼ö¼ö"};
	Color[] color = {Color.red, Color.orange, Color.blue, Color.gray};
	
	public void init() {
		setBackground(Color.lightGray);
	}

	public void paint(Graphics g) {
		int startAngle = 0;
		int pieSize =200;
		int subtot = 0;
		for(int i = 0; i<input.length;i++)
			subtot +=input[i];
		
		for(int i=0; i<input.length; i++) {
			
			int arcAngle = (input[i] * 100 / subtot) * 360 / 100;
			g.setColor(color[i]);
			
			g.fillArc(40, 40, pieSize, pieSize, startAngle, arcAngle);
			
			startAngle += arcAngle ;
			g.fillRect(300, 50+i*32, 30, 30);
			g.setColor(Color.BLACK);
			g.drawString(title[i], 355,70+i*32);
		}
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("½Ç±Þ¹®Á¦ 1¹ø");
		Chapter0901 p = new Chapter0901();
	
		f.add(p);
		f.setSize(500,500);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
}
