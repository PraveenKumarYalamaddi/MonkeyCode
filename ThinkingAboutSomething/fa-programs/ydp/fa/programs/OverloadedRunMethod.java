package ydp.fa.programs;

public class OverloadedRunMethod extends Thread {
	
	@Override
	public void run() {
		System.out.println("No-Arg-run-method");
	}
	
	public void run(int i) {
		System.out.println( "int-arg-run-method");
	}
	

}
