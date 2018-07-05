package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day0HelloWorld {
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input String to print");
		String inputString = s.nextLine();
		s.close();
		System.out.println("Hello,World");
		System.out.println(inputString);

	}

}
