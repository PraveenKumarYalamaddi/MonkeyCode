package ocjp.programs.classes;

public class Ques8_Polymorp {
	
	static {
		System.out.println("I am Static A");
	}
	
	public Ques8_Polymorp() {
		System.out.print( "Deer");
	}
	
	public Ques8_Polymorp(int age) {
		System.out.print("Deer Age");
	}
	
	private boolean hasHorns() {
		return false;
	}
	
	public static void main(String[] args) {
		Ques8_Polymorp deer = new Reindeer(5);
		System.out.print(","+deer.hasHorns());
	}

}

class Reindeer extends Ques8_Polymorp{
	
	static {
		System.out.println("I am Static B");
	}
	
	public Reindeer() {
		System.out.println("kcmkcmkz");
	}
	
	public Reindeer(int age) {
		System.out.print("ReinDeer");
	}
	
	public boolean hasHorns() {
		return true;
	}
}

/**
 * ANS:A
 * 
A.
I am Static A
I am Static B 
DeerReindeer,false

B. DeerReindeer,true
C. ReindeerDeer,false
D. ReindeerDeer,true
E. DeerAgeReindeer,false
F. DeerAgeReindeer,true
G. The code will not compile because of line 7.
H. The code will not compile because of line 12.
 * 
 * 
 */