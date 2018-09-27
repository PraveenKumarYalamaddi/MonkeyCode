package ydp.fa.programs;

public class ThreadInterruptionExample extends Thread {
	public void run() {
		try {
		for(int i=0;i<10;i++) {
			System.out.println("I am a sleeping thread");
			Thread.sleep(2000);
		}
		}catch(InterruptedException e){
			System.out.println("Thread is Interrupted");
			
		}
	}
}
