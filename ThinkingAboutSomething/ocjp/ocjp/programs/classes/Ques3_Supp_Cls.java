package ocjp.programs.classes;

import ocjp.programs.supportInterfaces.Ques3SI;

public abstract class Ques3_Supp_Cls implements Ques3SI {
	
	public  int getTailLength() { /*It SHOULD be protected but making it public to remove error*/
		return 4;
	}

}
