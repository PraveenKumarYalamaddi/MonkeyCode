package ocjp.programs.classes;

public class Ques5_TryCatch {

	public void executor() {
		System.out.println("A");
		try {
			System.out.println("B");
			throw new IllegalArgumentException();
		}catch (RuntimeException e) {
			System.out.println("C");
		}finally {
			System.out.println("D");
		}
		System.out.println("E");
	}
	
	public static void main(String[] args) {
		new Ques5_TryCatch().executor();
	}

}

/****
 * 
 * 
A. abe
B. abce
C. abde
D. abcde
E. The code does not compile.
F. An uncaught exception is thrown.
 * 
 * 
 * D. The code starts running and prints a and b on lines 13 and 15. Line 16 throws an
exception, which is caught on line 17. After line 18 prints c, the finally block is run
and d is printed. Then the try statement ends and e is printed on line 22. For more
information
 * 
**/