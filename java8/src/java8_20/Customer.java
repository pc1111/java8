package java8_20;

public class Customer extends Thread{
	Account acc1;
	Customer(Account acc){
		this.acc1 = acc;
	}
	
	@Override
	public void run() {
	try {	
		for(int i = 0 ; i < 300; i ++) {
			System.out.println("������ " + getName() + " : " + i + "��°");
			acc1.deposit(1000);
			sleep(50);
			if(acc1.gettot() >= 1000000) break;
			}
		}catch(Exception e) {System.out.println(e);}
	}
}
