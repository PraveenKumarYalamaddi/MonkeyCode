package yp.hr.thirty.days.of.code;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Day26NestedLogic {

	static Scanner sc = new Scanner(System.in);
	int Da, Ma, Ya, De, Me, Ye;
	LocalDate dateReturned ,dateExpected;
	
	public void getDataFromUser() {
		System.out.println("Please enter the Actual Date in DD MM YYYY format");
		String ad = sc.nextLine();
		if (null != ad) {
			String[] adD = ad.split(" ");
			Da = Integer.parseInt(adD[0]);
			Ma = Integer.parseInt(adD[1]);
			Ya = Integer.parseInt(adD[2]);
			dateReturned  = LocalDate.of(Ya, Ma, Da);
			System.out.println("Please enter Expected date in DD MM YYYY format");
			String ed = sc.nextLine();
			if (null != ed) {
				String[] edD = ed.split(" ");
				De = Integer.parseInt(edD[0]);
				Me = Integer.parseInt(edD[1]);
				Ye = Integer.parseInt(edD[2]);
				dateExpected = LocalDate.of(Ye, Me, De);
				calculateTheFine();
			}
		} else {
			System.out.println("Please enter actual date in proper format");
		}

	}
	
	public void calculateTheFine() {
		long fine = 0;
		if(dateReturned.isAfter(dateExpected)) {
            if ( dateExpected.getYear() == dateReturned.getYear() ) {
                if (dateExpected.getMonth() == dateReturned.getMonth()) {
                    long differenceDays = ChronoUnit.DAYS.between(dateExpected, dateReturned);
                    fine = 15 * differenceDays;
                } else {
                    long differenceMonths = ChronoUnit.MONTHS.between(dateExpected, dateReturned);
                    fine = 500 * differenceMonths;
                }
            } else {
                fine = 10000;
            }
        }
        System.out.println(fine);
	}

	public static void main(String[] args) {
		
		new Day26NestedLogic().getDataFromUser();
		
	}

}
