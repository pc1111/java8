package java8_21;

import java.awt.event.*;


import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

public class JPopupMenuTest extends JFrame{

	String[] title = {"���", "����", "�μ�"};
	JRadioButtonMenuItem rbm[];
	
	public JPopupMenuTest() {
		super("�˾��޴����� �׸� ����");
		final JPopupMenu pmenu = new JPopupMenu();
		ButtonGroup tgroup = new ButtonGroup();
		rbm = new JRadioButtonMenuItem[3];
		
		for(int i=0; i<rbm.length; i++) {
			rbm[i] = new JRadioButtonMenuItem(title[i]);
			pmenu.add(rbm[i]);
			tgroup.add(rbm[i]);
		}
		//���콺 �̺�Ʈ ������ ���
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {checkForTroggerEvent(e);}
			public void mouseReleased(MouseEvent e) {checkForTroggerEvent(e);}
			
			private void checkForTroggerEvent(MouseEvent e) {
				//���콺 ������ ��ư�� �����ų� ������ �� �߻�
				if(e.isPopupTrigger())
					pmenu.show(e.getComponent(),e.getX(),e.getY());
			}
		});
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		JPopupMenuTest pt = new JPopupMenuTest();
		pt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
