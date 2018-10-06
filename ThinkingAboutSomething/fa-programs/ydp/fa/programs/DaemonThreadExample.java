package ydp.fa.programs;

public class DaemonThreadExample {

	public static void main(String[] args) {
		MThread t = new MThread();
		t.setDaemon(true);
		t.start();
		System.out.println("isDaemon-->" +t.isDaemon());
		System.out.println("End of main Thread");
	}

}

class MThread extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Child Thread");
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		}
	}
}
 /***
  * If last non-daemon thread is terminated automatically all daemon threads will be terminated 
  * irrespective of their position 
  * */
