package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day1DataTypes {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		Scanner sc = new Scanner(System.in);
		
		int i2 = sc.nextInt();
		double d2 = sc.nextDouble();
		String s2 = sc.nextLine().toString();
		String ss = sc.nextLine().concat(s2);
		sc.close();
		System.out.println(i+i2);
		System.out.println(d+d2);
		System.out.println(s+ss);
		

	}

}
