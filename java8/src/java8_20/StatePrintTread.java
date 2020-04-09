package java8_20;

public class StatePrintTread extends Thread{
	private Thread targetThread;
	
	public StatePrintTread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
					System.out.println("Ÿ�� ������ ����: "+ state);
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}

}
