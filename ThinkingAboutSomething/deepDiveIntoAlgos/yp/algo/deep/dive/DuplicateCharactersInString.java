package yp.algo.deep.dive;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

	public void getDuplicateChars(String str) {
		Map<Character,Integer> dupMap = new HashMap<Character,Integer>();
		char[] strArr = str.toCharArray();
		for(Character ch:strArr) {
			if(dupMap.containsKey(ch)) {
				dupMap.put(ch, dupMap.get(ch)+1);
			}else {
				dupMap.put(ch, 1);
			}
		}
		
		Set<Character> keys = dupMap.keySet();
		for(Character ch:keys) {
			if(dupMap.get(ch)>1) {
				System.out.println(ch +"--->"+dupMap.get(ch));
			}
		}
	}
	
	public static void main(String[] args) {
		DuplicateCharactersInString dp = new DuplicateCharactersInString();
		dp.getDuplicateChars("PraveenKumarYalamaddi");
	}

}
