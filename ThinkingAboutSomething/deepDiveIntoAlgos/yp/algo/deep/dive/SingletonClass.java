package yp.algo.deep.dive;

public class SingletonClass {

	private static SingletonClass myObj;
	
	static {
		myObj = new SingletonClass();
	}
	
	private SingletonClass() {
		
	}
	
	private static SingletonClass getInstance() {
		return myObj;
	}
	
	private void testMe() {
		System.out.println("It's Working");
	}
	public static void main(String[] args) {
		
		SingletonClass sc = getInstance();
		sc.testMe();
	}

}
