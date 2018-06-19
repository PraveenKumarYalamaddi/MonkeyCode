package yp.hr.tz.code.challenge;

import java.util.Scanner;

public class Day2Operators {

		
		static void solve(double meal_cost, int tip_percent, int tax_percent) {
			double tip_percent1 = (meal_cost*(tip_percent/100.0));
			double tax_percent1 = (meal_cost*(tax_percent/100.0));
	        double totalCost = 	(meal_cost+tip_percent1+tax_percent1);
	        int tc1 = (int) Math.round(totalCost);
	        System.out.println("The total meal cost is "+tc1+" dollars.");

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        double meal_cost = scanner.nextDouble();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tip_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tax_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        solve(meal_cost, tip_percent, tax_percent);

	        scanner.close();
	    }


}
