package java8_20;

public class ThreadClassE1 extends Thread{
	int delay;
	ThreadClassE1(String name, int delay){
		super(name);
		this.delay = delay;
	}
	
	@Override
	public void run() {
		
			try {
				while(true){
					System.out.println(getName() + " ");
				Thread.sleep(delay);
				}
			}catch (InterruptedException e) {	System.out.println("error"); return;}
	}
	
	public static void main(String[] args) {
		ThreadClassE1 t1 = new ThreadClassE1("������1", 500);
		ThreadClassE1 t2 = new ThreadClassE1("������2", 700);
		t1.start();
		t2.start();
	}

}
