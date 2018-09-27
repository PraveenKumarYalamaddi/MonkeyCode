package ydp.fa.programs;

public class ThreadWaitExample {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		//Thread.sleep(1000);
		synchronized (b) {
			System.out.println("Main thread calling wait( )-->1");
			b.wait(); //If no one is there to notify you when you use sleep It is better to use wait with some time.
			System.out.println("Maian thread is notified -->4");
			System.out.println("Total: "+ b.total +" -->5");
		}
	}
}

class ThreadB extends Thread{
	int total =0;
	public void run() {
		synchronized(this) {
			System.out.println("Child Thread starts execution -->2");
		for(int i=0;i<=100;i++) {
			total = total+i;
		}
		System.out.println("Child Thread giving notification --->3");
		this.notify();
		}
	}
}