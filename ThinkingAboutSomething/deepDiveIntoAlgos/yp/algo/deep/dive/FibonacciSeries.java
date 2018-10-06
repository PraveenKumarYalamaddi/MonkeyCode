package yp.algo.deep.dive;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int febCounnt = 15;
		int[] feb = new int[febCounnt];
		feb[0] =0;
		feb[1] =1;
		for(int i=2;i<febCounnt;i++) {
			feb[i] = feb[i-1]+feb[i-2];
		}
		
		for(int i=0;i<febCounnt;i++) {
			System.out.print(feb[i]+" ");
		}
	}

}
