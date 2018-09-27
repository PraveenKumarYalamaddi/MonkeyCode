package ydp.fa.programs;

class Display {
	public synchronized void wish(String name) {
		
		for(int i=0;i<10;i++) {
			try {
			System.out.println("Good Morning:");
			Thread.sleep(1000);
			}catch(InterruptedException e) {
			}
			System.out.print(name);
		}
	}
}

class MainProg extends Thread{
	Display d;
	String name;
	public MainProg(Display d,String name) {
		this.name = name;
		this.d = d;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class SynchrinizationExample {

	public static void main(String[] args) {
		Display d = new Display();
		MainProg t1 = new MainProg(d, "Prav");
		MainProg t2 = new MainProg(d, "een");
		t1.start();
		t2.start();
	}
	/**
	 * If we are not declaring wish method as synchronized then both threads will be executed simultaneously
	 * We will get irregular output.
	 */

}
