package Assignment;

import java.util.Scanner;

public class pairStar {
	public static String addStars(String str) {
		// Write your code here
        if(str.length() == 1)
            return str;
        if(str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*"
            +addStars(str.substring(1));
    
        else
            return str.charAt(0) 
            +addStars(str.substring(1));
        
	}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str = sc.next();
		System.out.print(addStars(str));
		
	}

}
