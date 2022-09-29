package Recurssion;

import java.util.Scanner;
public class countCharacter {
	static int c = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the value : " );
		int num = sc.nextInt();
		System.out.print("Total character : " + count(num));
		sc.close();
	}

	private static int count(int num) {
		if(num/10 == 0)
			return 1;
		c++;
		count(num/10);
		return c;
	}

}
