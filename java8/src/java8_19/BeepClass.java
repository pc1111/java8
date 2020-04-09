package java8_19;

import java.awt.Toolkit;

public class BeepClass {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();

		

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("현재 스레드 명 : " + Thread.currentThread().getName());
				for (int i = 0; i < 5; i++) {
					tk.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		});

//		t1 = new Thread(() -> { //람다식
//
//			for (int i = 0; i < 5; i++) {
//				System.out.println("현재 스레드 명 : " + Thread.currentThread().getName());
//				tk.beep();
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//				}
//
//			}
//		});
		t1.start(); // 스레드 실행메소드
		System.out.println("현재 스레드 명 : " + Thread.currentThread().getName());
		
		for (int i = 0; i < 5; i++) {
			System.out.println("경고");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}