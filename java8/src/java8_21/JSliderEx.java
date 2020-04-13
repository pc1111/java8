package java8_21;

import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class JSliderEx extends WindowAdapter
{
	@Override
	public void windowStateChanged(WindowEvent e) {
		Window w = e.getWindow();
		int width = w.getWidth();
		int height = w.getHeight();
		System.out.println("창의 크기 : " + width + ", " + height);
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("슬라이더 예제");
		
		JSlider s = new JSlider(0, 100, 50);
		
		s.setMajorTickSpacing(10);
		s.setMinorTickSpacing(1);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		
		s.addChangeListener(e ->{
			JSlider js = (JSlider) e.getSource();
			int value = js.getValue();
			System.out.println("현재값 : " + value);
		});
		
//		Window win = Window.getWindows();
		
		f.add(s);
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
