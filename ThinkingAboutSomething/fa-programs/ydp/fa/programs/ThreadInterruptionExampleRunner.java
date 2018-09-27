package ydp.fa.programs;

public class ThreadInterruptionExampleRunner {

	public static void main(String[] args) {
		ThreadInterruptionExample t = new ThreadInterruptionExample();
		t.start();
		t.interrupt();
		System.out.println("Thread Interruption is exe	cuted");
	}

}
