package Assignment;

import java.util.Scanner;

public class stairCase {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		System.out.print(stair(n));

	}

	private static int stair(int n) {
		if(n==0)
			return 1;
		if(n==1||n==2)
			return n;
		int opt1 = stair(n-1);
		int opt2 = stair(n-2);
		int opt3 = stair(n-3);
		return opt1 + opt2 + opt3;
		
	}

}
