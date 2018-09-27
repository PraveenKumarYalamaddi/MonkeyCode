package ydp.fa.programs;

public class YieldExampleRunner {

	public static void main(String[] args) {
		YieldExample t = new YieldExample();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}

}
