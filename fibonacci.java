package Recurssion;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the value : " );
		int num = sc.nextInt();
		System.out.print("Fibonacci num : " + fibonacciNum(num));
		sc.close();
	}

	private static int fibonacciNum(int num) {
		if(num == 0 || num == 1) {
			return num;
		}
		return fibonacciNum(num-1) + fibonacciNum(num-2);
	}

}
