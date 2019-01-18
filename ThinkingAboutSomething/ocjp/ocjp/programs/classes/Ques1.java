package ocjp.programs.classes;

public class Ques1 {
	private static int $;

	public static void main(String[] args) {
		String a_b;
		System.out.println($);
	//	System.out.println(a_b);

	}

}

/*ANS:Compile error on line 9
 * 
 * correct because local variables require assignment before referencing
them. Option D is incorrect because class and instance variables have default values
and allow referencing. a_b defaults to a null value. Options A, B, and C are incorrect
because identifiers may begin with a letter, underscore, or dollar sign. Options F and
G are incorrect because the code does not compile. If a_b was an instance variable, the
code would compile and output 0null. For more information
 * */
