package java8_21;

public class BankThread extends Thread {
	private int money;

	public BankThread(int money) {
		this.money = money;
	}

	synchronized int usingmoney() {
		if (money >= 9800)
			return money -= 9800;
		else
			return money;
	}

	@Override
	public void run() {
		int sava;
		while (true) {
			try {
				int save = money;
				usingmoney();
				if( save == money) {
					System.out.println("�ܾ׺���, �����ܾ� : " + money + ", ���� �ݾ� : 9800");
					break;
					}
				else System.out.println("9800���� ����, ���� �ܾ� : " + money);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
