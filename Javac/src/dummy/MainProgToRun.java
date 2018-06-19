package dummy;

public class MainProgToRun {
	
	
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		Thread t = new Thread(tt);
		System.out.println(tt.getClass());
		t.start();
	}

}
