package java8_20;

public class TargetThread extends Thread {
	public void run() {
		long sum = 0;
		for(long i = 0; i < 100_000; i++) {
			sum += i;
		}
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {}
		
		for(long i=0; i < 100_000; i++) {
			sum += i;
		}
	}
	public static void main(String[] args) {
		StatePrintTread spt = new StatePrintTread(new TargetThread());
		spt.start();
	}
}
