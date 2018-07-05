package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day9Recursion3 {

	public static int Factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * Factorial(n - 1);
		}

	}

	public static int Exponential(int n, int p) {
		if (p <= 0) {
			return 1;
		} else {
			return n * Exponential(n, p - 1);
		}
	}
	
	public static int Summation(int n) {
		if(n<=0) {
			return 0;
		}else {
			return n+Summation(n-1);
		}
	}

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number here, which you need Factorial for: ");
		int n = sc.nextInt();
		System.out.println("Factorial of " + n + " is: " + Factorial(n));
		System.out.println("Enter the number here, which you need Exponential for: ");
		int o = sc.nextInt();
		System.out.println("Exponential of:{Enter Here}");
		int p = sc.nextInt();
		System.out.println("Exponential of " + o + "^" + p + " is: " + Exponential(o, p));
		
		System.out.println("Enter the number which you need recursive summation here: ");
		int q = sc.nextInt();
		System.out.println("Recursive summation of " +q+" is:"+ Summation(q));
		
		sc.close();

	}

}
