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
					System.out.println("잔액부족, 현재잔액 : " + money + ", 인출 금액 : 9800");
					break;
					}
				else System.out.println("9800원을 인출, 남은 잔액 : " + money);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
