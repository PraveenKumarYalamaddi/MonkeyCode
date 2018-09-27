package ydp.fa.programs;

public class ThreadExecutor {

	public static void main(String[] args) {
		
		ThreadDefiningByUsingThreadClass tt = new ThreadDefiningByUsingThreadClass();
		tt.start();
		for(int i=0;i<10;i++) {
			System.out.println("----------Main Thread-----------thread");
		}
		
		ThreadDefiningByUsingRunnable r = new ThreadDefiningByUsingRunnable();
		Thread t = new Thread(r); /** r will be considered as Traget*/
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("********Main Thread********runnable");
		}
		
	}

}
