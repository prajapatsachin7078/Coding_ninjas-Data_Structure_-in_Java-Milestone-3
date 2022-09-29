package Assignment;

import java.util.Scanner;

public class checkPalindrome {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str = sc.next();
		System.out.print(check(str));
	}
	private static boolean check(String str) {
		if(str.length() == 1 || str.length() == 0)
			return true;
		if(str.charAt(0) != str.charAt(str.length()-1))
			return false;
		// CREATING A SUBTSTRING EXCEPT FIRST AND LAST CHARACTER
		str = str.substring(1,str.length()-1);
		// RECURSIVE CALL TO CHECK SUBSTRING
		return check(str);
	}

}
