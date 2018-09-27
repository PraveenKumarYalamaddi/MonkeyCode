package ydp.fa.programs;

public class OverloadRunMethodExecutor {

	public static void main(String[] args) {
		
		/**
		 * Overloading of run method is possible but When ever we are calling Thread.start(), It always look
		 * for no argument run method only
		 * 
		 * Execute both the programs(OverloadRunMethod.java, OverloadRunMethodExecutor.java) 
		 * you will came to know about this
		 * 
		 * So we need to call overloaded run method explicitly
		 */
		
		OverloadedRunMethod t = new OverloadedRunMethod();
		t.start();
		
		/** calling overloaded run method */
		t.run(10);
	}

}
