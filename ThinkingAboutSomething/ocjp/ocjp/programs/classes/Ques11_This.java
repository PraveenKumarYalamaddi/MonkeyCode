package ocjp.programs.classes;import com.sun.prism.paint.Color;

public class Ques11_This {
	
	private String color;
	
	public Ques11_This() {
		this("white");
	}
	
	public Ques11_This(String color) {
		color = color;
	}
	
	public static void main(String[] args) {
		Ques11_This o = new Ques11_This();
		System.out.println("Color:"+o.color);
	}

}

/**
*
*ANS:B
*
A. Color:
B. Color:null
C. Color:White
D. Compiler error on line 4.
E. Compiler error on line 10.
F. Compiler error on line 11.
*
*
The constructor on lines 11–13 assigns the method parameter to itself,
which leaves the color instance variable on line 2 set to its default value of null. For
more information,
*
*
*/
