package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day12Inheritance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Name Of the student");
		String firstName = scan.next();
		System.out.println("Enter Last Name of the Student");
		String lastName = scan.next();
		System.out.println("Enter ID nunmber of the Student");
		int id = scan.nextInt();
		System.out.println("You need average for how many subjects ?");
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			System.out.println("Enter " +(i+1)+ " Subject Marks");
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Day12Student s = new Day12Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}

}
