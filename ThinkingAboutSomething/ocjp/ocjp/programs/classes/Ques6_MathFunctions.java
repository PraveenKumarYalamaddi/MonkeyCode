package ocjp.programs.classes;

public class Ques6_MathFunctions {
	
	public static void addToInt(int x, int ammountToAdd) {
		x=x + ammountToAdd;
	}

	public static void main(String[] args) {

		int a = 15;
		int b = 10;
		Ques6_MathFunctions.addToInt(a, b);
		System.out.println(a);
	}

}

/***
 *
 * ANS:B
A. 10
B. 15
C. 25
D. Compiler error on line 3.
E. Compiler error on line 8.
F. None of the above.
 * 
 */
