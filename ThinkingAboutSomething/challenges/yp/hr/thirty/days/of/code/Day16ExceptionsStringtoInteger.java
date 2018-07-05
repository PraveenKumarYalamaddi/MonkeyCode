package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day16ExceptionsStringtoInteger {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        in.close();
	        try{
	            int newNum = Integer.parseInt(S);
	            System.out.println(newNum);
	        }catch(Exception e){
	            System.out.println("Bad String");
	        }
	    }

}
