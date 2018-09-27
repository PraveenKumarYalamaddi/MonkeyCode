package ydp.fa.programs;

public class JoinExampleRunner {

	public static void main(String[] args) throws InterruptedException {
		
	JoinExample.mt = Thread.currentThread();
	JoinExample t = new JoinExample();
	t.start();
	/**
	 * These two commented lines are like dead lock situations.
	 * 1. If thread1 is waiting for thread 2 and thread 2 is waiting for thread 1
	 * 2. If a thread calls same thread join method  
	 */
	//t.join();
	//Thread.currentThread().join();
	for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
	}
	
	}

}
