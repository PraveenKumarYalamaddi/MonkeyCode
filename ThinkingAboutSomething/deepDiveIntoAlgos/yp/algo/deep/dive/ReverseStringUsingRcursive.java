package yp.algo.deep.dive;

public class ReverseStringUsingRcursive {
	
	String reverse = "";
	
	public String reverseString(String str) {
		if(str.length() ==1) {
			return str;
		}else {
			reverse = str.charAt(str.length()-1)+reverseString(str.substring(0, str.length()-1));
			return reverse;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(new ReverseStringUsingRcursive().reverseString("Praveen"));
	}

}
