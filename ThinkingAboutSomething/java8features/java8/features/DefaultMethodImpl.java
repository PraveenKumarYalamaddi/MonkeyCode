package java8.features;

import java8.features.util.DMInterface1;
import java8.features.util.DMInterface2;

public class DefaultMethodImpl implements DMInterface1,DMInterface2 {
	
	@Override
	public void dMI1Method() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void dMI2method() {
		
	}
	
	@Override
	public void log(String str) {
		System.out.println("DefaultMethodImpl-->" +str);
		DMInterface1.staticMethod("Praveen");
	}
	
	public static void main(String[] args) {
		DefaultMethodImpl dm = new DefaultMethodImpl();
		dm.log("Hello");
	}

}
