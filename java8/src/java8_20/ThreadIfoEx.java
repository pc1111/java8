package java8_20;

import java.util.Map;
import java.util.Set;

public class ThreadIfoEx {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThred");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name : " + thread.getName() + ((thread.isDaemon()? "(单阁)" : "(林)")));
			System.out.println("\t" + "家加 弊缝 : " + thread.getThreadGroup().getName());
			System.out.println();
		} 

	}

}
