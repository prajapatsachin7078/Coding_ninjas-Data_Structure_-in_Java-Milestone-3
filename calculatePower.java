package Recurssion;

import java.util.Scanner;

public class calculatePower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int value = sc.nextInt();
		System.out.println("Enter the pow : ");
		int pow = sc.nextInt();
		sc.close();
		System.out.print(power(value,pow));
		
	}

	private static int power(int value, int pow) {
		if(pow == 0)
			return 1;
		return value*power(value,pow-1);
	}

}
