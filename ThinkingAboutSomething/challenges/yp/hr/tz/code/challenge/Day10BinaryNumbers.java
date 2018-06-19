package yp.hr.tz.code.challenge;

import java.util.Scanner;

public class Day10BinaryNumbers {
	
	public void binaryToDecimal(int n) {
		
		
	}
	
	public static void decimalToBinary(int n) {
		int[] binaryNum = new int[1000];
		int i = 0;
		while(n>0){
			binaryNum[i] = n%2;
			System.out.println("binaryNum[i]-->"+binaryNum[i]);
			n = n/2;
			System.out.println("n--->"+n);
			i++;
		}
		
		for(int j=i-1;j>=0;j--) {
			System.out.println(binaryNum[j]);
		}
		
	}
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		decimalToBinary(n); 

	}

}
