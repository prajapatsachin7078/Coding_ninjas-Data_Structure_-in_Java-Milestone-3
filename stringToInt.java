package Assignment;

import java.util.Scanner;

public class stringToInt {
	static Scanner sc = new Scanner(System.in);
	static int num = 0;
	public static int convertStringToInt(String str){
		// Write your code here
        if(str.length() == 0)
            return 0;
        // char to int conversion using Integer.parseInt(String.valueOf(character))
        int number  = Integer.parseInt(String.valueOf(str.charAt(0)));
        // creating Integer using string elements
        num = num*10 + number;
        convertStringToInt(str.substring(1));
        return num;

	}

	public static void main(String[] args) {
	   String str = sc.next();
	   try {
           System.out.print(convertStringToInt(str));
       }
       catch (NumberFormatException e) {
 
           // This is thrown when the String
           // contains characters other than digits
           System.out.println("Invalid String");
       }
	   

	}

}
