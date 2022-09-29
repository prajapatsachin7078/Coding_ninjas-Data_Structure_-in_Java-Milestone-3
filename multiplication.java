package Assignment;

import java.util.Scanner;

public class multiplication {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.print(multiplyNum(n1,n2));
}
	private static int multiplyNum(int n1, int n2) {
		
		if(n2 == 0)
			return 0;
		return n1 + multiplyNum(n1,n2-1);
		
	}
}
