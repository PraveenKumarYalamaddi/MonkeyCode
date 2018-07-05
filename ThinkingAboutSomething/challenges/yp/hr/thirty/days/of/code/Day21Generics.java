package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day21Generics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enetr how many elements you want to print");
		int n = sc.nextInt();
		Integer[] Arr = new Integer[n];
		for(int i=0;i<n;i++) {
			System.out.println("Please enter "+(i+1)+" Integer");
			Arr[i] = sc.nextInt();
		}
		String [] Str = new String[n];
		for(int i = 0; i<n; i++) {
			System.out.println("Please Enter "+(i+1)+" String");
			Str[i] = sc.next();
		}
		sc.close();
		Printer<Integer> arrPrint = new Printer<Integer>();
		arrPrint.printArr(Arr);
		Printer<String> strPrint = new Printer<String>();
		strPrint.printArr(Str);
		
	}

}

class Printer<P>{
	
	public void printArr(P[] arr) {
		
		for(P element: arr) {
			System.out.print(element +" ");
		}
		
	}
}
