package ydp.fa.programs;

public class ThreadsEvenOdd extends Thread {

	public static void main(String[] args) {
		ThreadsEvenOdd t = new ThreadsEvenOdd();
		t.numberEvenOrOdd();
	}
	
	
	public void numberEvenOrOdd() {
		
		for(int i =1;i<=100;i++) {
			if(i%2 ==0) {
				System.out.println("Even Num: "+i);
			}else {
				System.out.println("Odd Num: "+i);
			}
		}
	}

}
