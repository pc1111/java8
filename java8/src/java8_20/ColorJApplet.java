package java8_20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ColorJApplet  extends JPanel{
	public void init() {
		setBackground(Color.orange);
		//��� 1: �гλ��
		//panel p1 = new panel();
		//p1.setBackground(Color.orange);
		//this.add(p1);
	}
	public void paint(Graphics g) {
		//��� 2: paint �żҵ忡�� fillRect ���
		//g.setColor(Color.orange);
		//g.fillRect(0,0,getWidth(), getHeight());
		Color myColor = new Color(255,0,0);
		g.setColor(myColor);
		g.drawString("������ �۾��� �׸���.", 40, 100);
	}

}
