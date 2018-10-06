package ydp.fa.programs;

public class DeadlockExample extends Thread {
	DExampleOne a = new DExampleOne();
	DExampleTwo b = new DExampleTwo();
	public static void main(String[] args) {
		DeadlockExample t = new DeadlockExample();
		t.getStart();
	}
	
	public void getStart() {
		this.start();
		a.DE1(b); //Executed by main thread
	}
	public void run() {
		b.DE2(a); //Executed by child thread
	}
}

class DExampleOne{
	public synchronized void DE1(DExampleTwo d2) {
		System.out.println("Thread one started execution");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Thread one is calling thread two last method");
		d2.last();
	}
	
	public synchronized void last() {
		System.out.println("Thread one last method");
		
	}
}

class DExampleTwo{
	public synchronized void DE2(DExampleOne d1) {
		System.out.println("Thread two starts execution");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Thread two is calling thread one last method");
		d1.last();
	}
	
	public synchronized void last() {
		System.out.println("Thread two last method");
	}
}
//If we remove at least one synchronized keyword then the program wont entered into deadlock situation
