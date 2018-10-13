package java8.features.util;

import java.util.ArrayList;
import java.util.List;

public class ListProvider {
	
	public List<Integer> getlist(){
		
		List<Integer> intList = new ArrayList<Integer>();
		for(int i=0;i<=1000;i++) {
			intList.add(i);
		}
		return intList;
	}

}
