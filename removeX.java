package recursion2;

import java.util.Scanner;

public class removeX {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str = sc.next();
		System.out.print(remove(str));
		sc.close();
	}
	private static String remove(String str) {
		if(str.length() == 0)
			return str;
		if(str.charAt(0) == 'x')
			return 'a' + remove(str.substring(1));
		
		return str.charAt(0) + remove(str.substring(1));
	}

}
