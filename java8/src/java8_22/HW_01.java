package java8_22;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HW_01 extends JFrame implements ActionListener {
	static String user = "";
	static String com = "";
	static int com_select;

	JButton ga, ba, bo, end;
	static JButton stadium;

	public HW_01() {
		setTitle("���� ���� ��");
		addButton();
		setVisible(true);

	}

	void addButton() {
		Container cter = getContentPane();
		setLayout(null);
		
		setSize(470, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ga = new JButton("����");
		ga.setBounds(30, 200, 90, 30);
		ba = new JButton("����");
		ba.setBounds(130, 200, 90, 30);
		bo = new JButton("��");
		bo.setBounds(230, 200, 90, 30);
		end = new JButton("����");
		end.setBounds(330, 200, 90, 30);
		stadium = new JButton("���� ���� ���� ������ �ּ���.");
		stadium.setBounds(30, 20, 370, 170);
		stadium.setVisible(true);

		cter.add(ga);
		cter.add(ba);
		cter.add(bo);
		cter.add(end);
		cter.add(stadium);

		ga.addActionListener(this);
		ba.addActionListener(this);
		bo.addActionListener(this);
		end.addActionListener(this);
		stadium.addActionListener(this);
	}

// ����    
	public static void main(String[] args) {
		new HW_01();
	}

// ��ǻ�� ���������� ���ñ���    
	static void computer_select() {
		com_select = (int) (Math.random() * 3);
		switch (com_select) {
		case 0:
			com = "����";
			break;
		case 1:
			com = "����";
			break;
		default:
			com = "��";
			break;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		computer_select();
		if (e.getSource() == ga) {
			game(com, "����");
		}
		if (e.getSource() == ba) {
			game(com, "����");
		}
		if (e.getSource() == bo) {

			game(com, "��");
		}
		if (e.getSource() == end) {
			System.exit(0);
		}
		if (e.getSource() == stadium) {
			stadium.setText("���� ���� ���� ������ �ּ���.");
		}

	}

	static void game(String com, String user) {
		if (com.equals("����")) {
			if (user.equals("����")) {
				stadium.setText("<html>��ǻ�Ͱ� ������ �½��ϴ�.<br>������ ������ �½��ϴ�.<br>�����ϴ�.</html>");
			} else if (user.equals("����")) {
				stadium.setText("<html>��ǻ�Ͱ� ������ �½��ϴ�.<br>������ ������ �½��ϴ�.<br>�̰���ϴ�.</html>");
			} else {
				stadium.setText("<html>��ǻ�Ͱ� ������ �½��ϴ�.<br>������ ���� �½��ϴ�.<br>�����ϴ�.</html>");
			}
		}
		if (com.equals("����")) {
			if (user.equals("����")) {
				stadium.setText("<html>��ǻ�Ͱ� ������ �½��ϴ�<br>������ ������ �½��ϴ�<br>�����ϴ�.</html>");
			} else if (user.equals("��")) {
				stadium.setText("<html>��ǻ�Ͱ� ������ �½��ϴ�.<br>������ ���� �½��ϴ�.<br>�̰���ϴ�.</html>");
			} else {
				stadium.setText("<html>��ǻ�Ͱ� ������ �½��ϴ�.<br>������ ������ �½��ϴ�.<br>�����ϴ�.</html>");
			}
		}

		if (com.equals("��")) {
			if (user.equals("��")) {
				stadium.setText("<html>��ǻ�Ͱ� ���� �½��ϴ�.<br>������ ���� �½��ϴ�.<br>�����ϴ�.</html>");
			} else if (user.equals("����")) {
				stadium.setText("<html>��ǻ�Ͱ� ���� �½��ϴ�.<br>������ ������ �½��ϴ�.<br>�̰���ϴ�.</html>");
			} else {
				stadium.setText("<html>��ǻ�Ͱ� ���� �½��ϴ�.<br>������ ������ �½��ϴ�.<br>�����ϴ�.</html>");
			}
		}

	}

}