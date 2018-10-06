package yp.algo.deep.dive;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumberBetween0ToN {
	
	public int findDuplicateNumber(List<Integer> numbers) {
		int highest = numbers.size()-1;
		int total = getSum(numbers);
		int duplicate = total - (highest*(highest+1)/2);
		return duplicate;
	}
	
	public int getSum(List<Integer> num) {
		int sum =0;
		for(int no:num) {
			sum +=no;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		for(int i =1;i<30;i++) {
			l.add(i);
		}
		l.add(5);
		System.out.println(new DuplicateNumberBetween0ToN().findDuplicateNumber(l));
	}

}
