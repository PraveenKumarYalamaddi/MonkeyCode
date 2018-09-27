package ydp.fa.programs;

public class JoinExample extends Thread {
	
	static Thread mt;
	
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
		
	}

}
