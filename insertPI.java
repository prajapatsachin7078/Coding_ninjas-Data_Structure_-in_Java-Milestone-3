package recursion2;

import java.util.Scanner;

public class insertPI {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str = sc.next();
		System.out.print(insert(str));
	}
	private static String insert(String str) {
		if(str.length() <= 1)
			return "";
		
		if(str.substring(0, 2).equals("pi")){ 
			// if pi found then replace it with 3.14 
			// and then check for rest substring
//			str = str.substring(1,str.length()); // optional or another approach 
			return "3.14" + insert(str.substring(2)); 
		}
		return str.charAt(0) + insert(str.substring(1));
	}

}
