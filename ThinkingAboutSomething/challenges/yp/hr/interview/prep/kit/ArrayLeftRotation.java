package yp.hr.interview.prep.kit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayLeftRotation {

	static int[] rotLeft(int[] a, int d) {
		for(int i=0;i<d;i++) {
			int temp = a[0];
			for(int j=1;j<a.length;j++) {
				a[j-1]= a[j];
			}
			a[a.length-1]=temp;
		}
		return a;


    }
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\prave\\Desktop\\OutFile.txt"));
        
        System.out.println("Enter how many letter you want to rotate and how many times you need to rotate in space separated form");
        
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];
        
        System.out.println("Enetr the items of an array");
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
