package yp.algo.deep.dive;

public class ReverseNumber {

	int reverse =0;
	public int reverseNumber(int num) {
		while(num!=0) {
			reverse = (reverse*10)+(num%10);
			num = num/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		
		System.out.println(new ReverseNumber().reverseNumber(123456));
	}

}
