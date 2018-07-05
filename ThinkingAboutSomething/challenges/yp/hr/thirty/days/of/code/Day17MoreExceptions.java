package yp.hr.thirty.days.of.code;

import java.util.Scanner;

class Calculator {

	public int power(int n, int p) {
		if (n < 0 || p < 0) {
			throw new IllegalArgumentException("n and p should be non-negative");
		} else {
			int power = 1;
			for (int i = 0; i < p; i++) {
				power *= n;
			}
			return power;
		}

	}

}

class Day17MoreExceptions {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter how many Exponentials you want");
		int t = in.nextInt();
		while (t-- > 0) {
			System.out.println("Enter the base number which your going to exponentiate ");
			int n = in.nextInt();
			System.out.println("Enter how many times your going to exponentiate the base value: ");
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println("Exponential value is: "+ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}

}
