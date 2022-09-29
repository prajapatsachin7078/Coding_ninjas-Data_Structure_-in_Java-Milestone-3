package Recurssion;

import java.util.Scanner;

public class printNaturalNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the value : " );
		int num = sc.nextInt();
		print(num);
		sc.close();

	}

	private static void print(int num) {
		if(num>0) {
			print(num-1);
			System.out.print(num+" ");
		}
		
	}

}
