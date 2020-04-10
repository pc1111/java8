package java8_21;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chapter09_01 extends JPanel{
	Color[] color = {Color.red, Color.orange};
	
	public void paint(Graphics g) {
		int startAngle = 0;
		int pieSize =100;

		for(int i=0; i<2; i++) {
			int x = 40+(120*i);
			int y = 40+(100*i);
			g.setColor(color[i]);
			g.fillArc(x, y, pieSize, pieSize, startAngle, 360);
			g.setColor(Color.yellow);
			g.fillArc(x+25, y+25, pieSize/2, pieSize/2, startAngle, 360);
			
			g.setColor(Color.green);
			y+=100;
			g.fillRect(x+40, y, 20, 40);
			g.fillArc(x+5, y, 40, 40, 120,180);
			g.fillArc(x+55, y, 40, 40, 240,180);
			
			
		}
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("실급문제 1번");
		Chapter09_01 p = new Chapter09_01();
	
		f.add(p);
		f.setSize(500,500);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		
	}
}
