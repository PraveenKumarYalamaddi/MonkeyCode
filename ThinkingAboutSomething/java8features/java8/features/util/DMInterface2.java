package java8.features.util;

public interface DMInterface2 {
	
	public void dMI2method();
	
	default void log(String str) {
		System.out.println("log methods in DMInterface2 "+str);
	}

}
