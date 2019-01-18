package ocjp.programs.classes;

import java.util.ArrayList;
import java.util.List;

import ocjp.programs.supportInterfaces.Ques3SI_CanSwim;

public class Ques13 implements Ques3SI_CanSwim {
	
}

class Tadpole extends Ques13 {
	
}
class FindAllTadPole {

	public static void main(String[] args) {
		List<Tadpole> tadpoles = new ArrayList<Tadpole>();
			for(Ques13 Ques13 : tadpoles) {
			//	____________ tadpole = Ques13; which one is suitable to compile this code
} } }

/***
 * 
 * The for-each loop automatically casts each Tadpole object to an Ques13
reference, which does not require an explicit cast because Tadpole is a subclass of
Ques13. From there, any parent class or interface that Ques13 inherits from is
permitted without an explicit cast. This includes Ques3SI_CanSwim, the interface Ques13
implements, and Object, which all classes extend from, so options A and E are correct.
Option C is also correct since the reference is being cast to the same type, so no explicit
cast is required. Option B is incorrect, since Long is not a parent of Ques13. Option
D is incorrect as well, although an explicit cast to Tadpole on the right-hand side of the
expression would be required to allow the code to compile
 * 
 */
