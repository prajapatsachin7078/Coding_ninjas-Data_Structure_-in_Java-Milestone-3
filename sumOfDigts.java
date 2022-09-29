package Assignment;

import java.util.Scanner;

public class sumOfDigts {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num = sc.nextInt();
		System.out.print(Sum(num));

	}

	private static int Sum(int num) {
		
		if(num == 0)
			return 0;
		int lDigit = num%10; // getting last digit
		return lDigit + Sum(num/10); // recursive call and adding returned value to the digit
	}

}
