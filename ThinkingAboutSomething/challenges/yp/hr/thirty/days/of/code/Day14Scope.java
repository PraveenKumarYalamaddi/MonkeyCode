package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day14Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Day14Difference difference = new Day14Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}

}
