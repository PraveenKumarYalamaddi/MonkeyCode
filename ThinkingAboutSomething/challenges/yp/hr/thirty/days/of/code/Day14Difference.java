package yp.hr.thirty.days.of.code;

public class Day14Difference {
	
	private int[] elements;
  	public int maximumDifference;
  	
  	public Day14Difference(int[] a) {
  		this.elements = a;
	}
  	
  	public void computeDifference() {
  		for(int i:elements) {
  			for(int j=0;j<elements.length;j++) {
  				int diff = elements[j]-i;
  	  			if(diff>maximumDifference) {
  	  				maximumDifference = diff;
  	  			}
  			}
  			
  		}
  		
  	}

}
