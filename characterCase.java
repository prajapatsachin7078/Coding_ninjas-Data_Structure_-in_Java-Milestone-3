package ConditionAndLoops;

import java.util.Scanner;

public class characterCase {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str = sc.next();
		char ch = str.charAt(0);
		int c = checkCase(ch);
		System.out.print(c);
	}
	private static int checkCase(char num) {
		if(Character.isLowerCase(num)) {
			return 0;
		}
		else if(Character.isUpperCase(num)) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
