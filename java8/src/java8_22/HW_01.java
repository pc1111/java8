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
		setTitle("가위 바위 보");
		addButton();
		setVisible(true);

	}

	void addButton() {
		Container cter = getContentPane();
		setLayout(null);
		
		setSize(470, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ga = new JButton("가위");
		ga.setBounds(30, 200, 90, 30);
		ba = new JButton("바위");
		ba.setBounds(130, 200, 90, 30);
		bo = new JButton("보");
		bo.setBounds(230, 200, 90, 30);
		end = new JButton("종료");
		end.setBounds(330, 200, 90, 30);
		stadium = new JButton("가위 바위 보를 선택해 주세요.");
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

// 메인    
	public static void main(String[] args) {
		new HW_01();
	}

// 컴퓨터 가위바위보 선택구간    
	static void computer_select() {
		com_select = (int) (Math.random() * 3);
		switch (com_select) {
		case 0:
			com = "가위";
			break;
		case 1:
			com = "바위";
			break;
		default:
			com = "보";
			break;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		computer_select();
		if (e.getSource() == ga) {
			game(com, "가위");
		}
		if (e.getSource() == ba) {
			game(com, "바위");
		}
		if (e.getSource() == bo) {

			game(com, "보");
		}
		if (e.getSource() == end) {
			System.exit(0);
		}
		if (e.getSource() == stadium) {
			stadium.setText("가위 바위 보를 선택해 주세요.");
		}

	}

	static void game(String com, String user) {
		if (com.equals("가위")) {
			if (user.equals("가위")) {
				stadium.setText("<html>컴퓨터가 가위를 냈습니다.<br>유저가 가위를 냈습니다.<br>비겼습니다.</html>");
			} else if (user.equals("바위")) {
				stadium.setText("<html>컴퓨터가 가위를 냈습니다.<br>유저가 바위를 냈습니다.<br>이겼습니다.</html>");
			} else {
				stadium.setText("<html>컴퓨터가 가위를 냈습니다.<br>유저가 보를 냈습니다.<br>졌습니다.</html>");
			}
		}
		if (com.equals("바위")) {
			if (user.equals("바위")) {
				stadium.setText("<html>컴퓨터가 바위를 냈습니다<br>유저가 바위를 냈습니다<br>비겼습니다.</html>");
			} else if (user.equals("보")) {
				stadium.setText("<html>컴퓨터가 바위를 냈습니다.<br>유저가 보를 냈습니다.<br>이겼습니다.</html>");
			} else {
				stadium.setText("<html>컴퓨터가 바위를 냈습니다.<br>유저가 가위를 냈습니다.<br>졌습니다.</html>");
			}
		}

		if (com.equals("보")) {
			if (user.equals("보")) {
				stadium.setText("<html>컴퓨터가 보를 냈습니다.<br>유저가 보를 냈습니다.<br>비겼습니다.</html>");
			} else if (user.equals("가위")) {
				stadium.setText("<html>컴퓨터가 보를 냈습니다.<br>유저가 가위를 냈습니다.<br>이겼습니다.</html>");
			} else {
				stadium.setText("<html>컴퓨터가 보를 냈습니다.<br>유저가 바위를 냈습니다.<br>졌습니다.</html>");
			}
		}

	}

}