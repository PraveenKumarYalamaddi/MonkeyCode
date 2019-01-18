package ocjp.programs.classes;

public class Ques9_GC {
	
	public Ques9_GC(String n) {
		name = n;
	}

	public static void main(String[] args) {
		Ques9_GC one =  new Ques9_GC("g1");
		Ques9_GC two = new Ques9_GC("g2");
		one = two;
		two = null;
		one = null;
		
	}
	private String name;
}

/**
 * ANS: C, D, F
 * 
A. Immediately after line 12, no Ques9_GC objects are eligible for garbage collection.
B. Immediately after line 13, no Ques9_GC objects are eligible for garbage collection.
C. Immediately after line 12, only one Ques9_GC object is eligible for garbage collection.
D. Immediately after line 13, only one Ques9_GC object is eligible for garbage collection.
E. Immediately after line 14, only one Ques9_GC object is eligible for garbage collection.
F. The code compiles.
G. The code does not compile.
 * 
 * 
C, D, F. Immediately after line 12, only Ques9_GC g1 is eligible for garbage collection
since both one and two point to Ques9_GC g2. Immediately after line 13, we still
only have Ques9_GC g1 eligible for garbage collection. Reference one points to g1
and reference two is null. Immediately after line 14, both Ques9_GC objects are eligible
for garbage collection since both one and two point to null. The code does compile.
Although it is traditional to declare instance variables early in the class, you don’t
have to
 * 
 */