package yp.algo.deep.dive;

public class PerfectNumber {
	
	public boolean isPerfectNumber(int num) {
		int temp =0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				temp +=i;
			}
		}
		if(temp == num) {
			System.out.println("Perfect Number");
			return true;
		}else {
			System.out.println("Not perfect Number");
			return false;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(new PerfectNumber().isPerfectNumber(28));
	}

}
