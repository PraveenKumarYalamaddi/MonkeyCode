package yp.hr.thirty.days.of.code;

public class Day12Person {

	protected String firstName;
	protected String lastName;
	protected int idNumber;

	public Day12Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	public void printPerson() {
		System.out.println("Name: " +firstName+" "+lastName +"\nID: "+idNumber);
	}
}
