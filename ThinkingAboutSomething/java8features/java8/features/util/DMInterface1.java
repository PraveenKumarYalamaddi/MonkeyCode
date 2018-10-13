package java8.features.util;

public interface DMInterface1 {
	
	public void dMI1Method();
	
	default void log(String str) {
		System.out.println("log methods in DMInterface1 "+str);
	}
	
	static void staticMethod(String str) {
		System.out.println("Static method in DMInterface1 "+str);
	}

}
