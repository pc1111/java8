package java8_21;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class JScrollPaneTset extends JFrame{
	
	JPanel jp;
	
	public JScrollPaneTset(String tilte) {
		super(tilte);
		setLayout(new BorderLayout());
		jp = new JPanel();
		jp.setLayout(new GridLayout(10,5));
		int cnt = 1;
		for(int i=0; i<10; i++) {
			for(int j=0;j<5;j++) {
				jp.add(new JButton("��ư"+cnt));
				cnt++;
			}
		}
		//����, ���� ��ũ�ѹٸ� �����ϱ� ���� ����� ����
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(jp, v,h);
		add(js, BorderLayout.CENTER);
		
		//�޴������
		JMenuBar jmb = new JMenuBar();
		setJMenuBar(jmb);
		JMenu jm1 = new JMenu("����");
		JMenu jm2 = new JMenu("����",false);
		JMenu jm3 = new JMenu("����", true);
		JMenuItem item1 = new JMenuItem("���� �����");
		JMenuItem item2 = new JMenuItem("����");
		JMenuItem item3 = new JMenuItem("���α׷� ����");
		jm1.add(item1);
		jm1.add(item2);
		jm1.add(item3);
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		item3.addActionListener(e-> { System.exit(0);});
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
			JScrollPaneTset f = new JScrollPaneTset("��ũ�� ����");
	}
	
	
}
