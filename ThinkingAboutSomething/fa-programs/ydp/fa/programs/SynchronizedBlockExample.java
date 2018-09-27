package ydp.fa.programs;

public class SynchronizedBlockExample {
	
	public static void main(String[] args) {
		Display2 d = new Display2();
		Display2 d1 = new Display2();
		MyThread t1 = new MyThread(d, "Praveen");
		MyThread t2 = new MyThread(d1, "Kumar");
		t1.start();
		t2.start();
	}
}

class MyThread extends Thread{
	Display2 d;
	String name;
	public MyThread(Display2 d,String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}


class Display2{
	
	public void wish(String name) {
		System.out.println("Before Sync block");
		synchronized(Display2.class) {
		for(int i=0;i<10;i++) {
			System.out.println("Wish"+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
		System.out.println("After Sync block");
	}
}