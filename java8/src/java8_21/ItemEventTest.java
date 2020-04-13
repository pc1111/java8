package java8_21;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class ItemEventTest extends JFrame {
	JLabel txt1, txt2;
	JRadioButton r1, r2, r3, r4, r5, r6;

	public ItemEventTest() {
		super("ItemEvent ó��");
		setLayout(new FlowLayout());
		// �������� ������Ʈ
		Box hBox = Box.createHorizontalBox();
		ButtonGroup rgroup = new ButtonGroup();
		rgroup.add(r1 = new JRadioButton("�츮��������"));
		hBox.add(r1);
		hBox.add(Box.createHorizontalStrut(30));
		rgroup.add(r2 = new JRadioButton("�Ｚ����"));
		hBox.add(r2);
		hBox.add(Box.createHorizontalStrut(30));
		rgroup.add(r3 = new JRadioButton("�������"));
		hBox.add(r3);
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(Box.createGlue());
		JPanel lpanel = new JPanel(new BorderLayout());
		lpanel.setBorder(new TitledBorder(new EtchedBorder(), "����ȸ�� ����"));

		lpanel.add(hBox);

		Box hhBox = Box.createVerticalBox();
		ButtonGroup cgroup = new ButtonGroup();
		cgroup.add(r4 = new JRadioButton("��������"));
		hhBox.add(r4);
		hhBox.add(Box.createHorizontalStrut(30));
		cgroup.add(r5 = new JRadioButton("��������"));
		hhBox.add(r5);
		hhBox.add(Box.createHorizontalStrut(30));
		cgroup.add(r6 = new JRadioButton("�������"));
		hhBox.add(r6);
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(Box.createGlue());
		JPanel llpanel = new JPanel(new BorderLayout());
		lpanel.setBorder(new TitledBorder(new EtchedBorder(), "���� ����"));

		llpanel.add(hhBox);

		Box cBox = Box.createVerticalBox();
		cBox.add(lpanel);
		cBox.add(llpanel);
		txt1 = new JLabel("����ȸ�� ��µ�");
		txt1.setFont(new Font("����", Font.PLAIN, 16));
		cBox.add(txt1);
		txt2 = new JLabel("���� ��µ�");
		txt2.setFont(new Font("����", Font.PLAIN, 16));
		cBox.add(txt2);
		add(cBox);

		RBHandler rh = new RBHandler();
		r1.addItemListener(rh);
		r2.addItemListener(rh);
		r3.addItemListener(rh);
		r4.addItemListener(rh);
		r5.addItemListener(rh);
		r6.addItemListener(rh);

	}

	private class RBHandler implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == r1)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : �츮��������");
			if (e.getSource() == r2)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : �Ｚ����");
			if (e.getSource() == r3)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : �������");
			if (e.getSource() == r4)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : ��������");
			if (e.getSource() == r5)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : ��������");
			if (e.getSource() == r6)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("���� : �������");

		}
	}
	public static void main(String[] args) {
		ItemEventTest iet = new ItemEventTest();
		iet.setDefaultCloseOperation(EXIT_ON_CLOSE);
		iet.setSize(400, 200);
		iet.setVisible(true);
	}
}
