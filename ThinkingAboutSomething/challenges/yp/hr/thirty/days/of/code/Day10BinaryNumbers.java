package yp.hr.thirty.days.of.code;

import java.util.Scanner;

public class Day10BinaryNumbers {

	public static StringBuilder number = new StringBuilder();

	public static void decimalToBinary(int n) {
		int[] binaryNum = new int[1000];
		int i = 0;
		int consec=0;
		int consecCount =0;
		while (n > 0) {
			binaryNum[i] = n % 2;
			System.out.println("binaryNum[i]-->" + binaryNum[i]);
			n = n / 2;
			System.out.println("n--->" + n);
			if(binaryNum[i]==1) {
				consec++;
				if(consec>consecCount) {
					consecCount = consec;
				}
			}else {
				consec =0;
			}
			System.out.println(consecCount);
			i++;
			
		}

		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binaryNum[j]);
			number.append(binaryNum[j]);
		}
		binaryToDecimal(number.toString());

	}

	public static void binaryToDecimal(String s) {
		int decimal = 0;
		int p = 0;
		int n = Integer.parseInt(s);
		while (true) {
			if (n == 0) {
				break;
			} else {
				int temp = n % 10;
				decimal += temp * Math.pow(2, p);
				n = n / 10;
				p++;
			}
		}
		System.out.println("\nDecimal Number is: " + decimal);
	}

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		decimalToBinary(n);

	}

}
