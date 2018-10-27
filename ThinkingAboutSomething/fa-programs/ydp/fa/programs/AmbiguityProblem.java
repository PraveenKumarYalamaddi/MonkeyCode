package ydp.fa.programs;

public class AmbiguityProblem {
	
	public void method(int i,double d) {
		System.out.println("int i , double d method called");
	}
	
	public void method(double d, int i) {
		System.out.println("double d, int i method called");
	}
	
	public void method(double d, double db) {
		System.out.println("double d, double db method is called");
	}

	public static void main(String[] args) {
		/***
		 * 
		 * Here we will get ambiguity problem because when we pass two int values compiler doesn't
		 * knows which method should be called
		 * 
		 */

		AmbiguityProblem ap = new AmbiguityProblem();
		//ap.method(10, 10);
	}

}
