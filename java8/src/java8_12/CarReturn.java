package java8_12;

public class CarReturn {
	
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas( ) {
		if(gas ==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas�ܷ� : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�. (gas�ܷ� : " + gas + ")");
				System.out.println("�� �� �� ��");
				return;
//				System.out.println("�� �� �� ��"); ��¾ȵ�
			}
		}
	}
	

}
