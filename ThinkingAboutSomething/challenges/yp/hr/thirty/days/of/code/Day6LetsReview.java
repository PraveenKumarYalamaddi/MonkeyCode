package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day6LetsReview {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("How many Strings are you going to split by even and odd");
		int i = sc.nextInt();
		sc.nextLine();

		while (i > 0) {
			
			System.out.println("Enter the String which you want to split by even and odd");
			String str = sc.nextLine();
			char arr[] = str.toCharArray();
			for (int x = 0; x < str.length(); x = x + 2) {
				System.out.print(arr[x]);
			}

			System.out.print(" ");

			for (int x = 1; x < str.length(); x = x + 2) {
				System.out.print(arr[x]);
			}
			System.out.println();
			i--;
		}

	}

}
