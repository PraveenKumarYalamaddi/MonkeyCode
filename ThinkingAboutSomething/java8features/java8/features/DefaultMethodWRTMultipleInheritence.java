package java8.features;

import java8.features.util.DmInterfMulInheritence1;
import java8.features.util.DmInterfMulInheritence2;

/***
 * 
 * @author PraveenKumarYalamaddi
 *
 *Error: Duplicate default methods named m1 with the parameters () and () are inherited
 *from the types DmInterfMulInheritence2 and DmInterfMulInheritence1
 */

public class DefaultMethodWRTMultipleInheritence implements DmInterfMulInheritence1,DmInterfMulInheritence2 {

	@Override
	public void m1() {
		System.out.println("my own Implementation");
		DmInterfMulInheritence1.super.m1(); //Calling default method of first interface in overridden method for same implementation
		DmInterfMulInheritence2.super.m1(); //Calling default method of first interface in overridden method for same implementation
	}
	
	public static void main(String[] args) {
		new DefaultMethodWRTMultipleInheritence().m1();
	}
	
	
	

}
