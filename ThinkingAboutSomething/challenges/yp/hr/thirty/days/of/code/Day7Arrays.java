package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day7Arrays {

	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n]; //created an integer array with user input
	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	            System.out.println(arr[i]);
	        }
	        for(int i=arr.length-1;i>=0;i--) {
	        	System.out.println(arr[i]+" ");
	        }

	        scanner.close();
	    }
	}