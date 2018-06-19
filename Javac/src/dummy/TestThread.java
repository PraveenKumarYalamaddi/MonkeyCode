package dummy;

public class TestThread extends Thread {

	@Override
	public void run() {
		
		System.out.println(super.getClass());

		for (int i = 0; i < 100; i++) {
			System.out.println("First loop");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.interrupt();
			System.out.println("thread interrupted " + this.interrupted());
			break;
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Second loop");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	

}
