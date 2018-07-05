package yp.hr.thirty.days.of.code;

import java.util.Arrays;
import java.util.Scanner;

public class Day11Arrays2D {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
        	System.out.println("Please Enter 6 digits for " +(i+1)+ " row with space separated");
            String[] arrRowItems = scanner.nextLine().split(" ");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int sum[] = new int[16];
        int h=0;
        for(int i=0;i<4;i++) {
        	for(int j=0;j<4;j++) {
        		sum[h]= arr[i][j]+arr[i][j+1] + arr[i][j+2]+ arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]+ arr[i+2][j+2];
        		h++;
        	}
        }
        Arrays.sort(sum);
        System.out.println("The hourglass with the maximum sum is: " +sum[15]);
        scanner.close();
    }

}
