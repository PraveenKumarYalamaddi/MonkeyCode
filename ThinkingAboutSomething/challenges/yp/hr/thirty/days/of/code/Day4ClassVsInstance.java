package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day4ClassVsInstance {
	private int age;
	
	public Day4ClassVsInstance(int initialAge) {
		if(initialAge>0) {
			age= initialAge;
		}else {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		
	}
	
	public void yearPasses() {
		age=age+1;
	}
	
	public void amIOld() {
		if(age<13) {
			System.out.println("age<13 --"+age);
			System.out.println("You are young.");
		}else if(age<18&& age>=13) {
			System.out.println("18<<age>=13 --"+age);
			System.out.println("You are a teenager.");
		}else {
			System.out.println(age);
			System.out.println("You are old.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4ClassVsInstance p = new Day4ClassVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }

	}

