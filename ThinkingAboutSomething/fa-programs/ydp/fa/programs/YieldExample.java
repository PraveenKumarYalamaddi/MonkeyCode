package ydp.fa.programs;

public class YieldExample extends Thread {
	
	public void run() {
	
	for(int i=0;i<10;i++) {
		System.out.println("Child Method");
		//Thread.yield();
	}
	}
	
	public static void main(String[] args) {
		YieldExample t = new YieldExample();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}
}
