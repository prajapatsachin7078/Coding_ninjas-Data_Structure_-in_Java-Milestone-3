package recursion2;

import java.util.Scanner;
/*
 * 
 */
public class removeDubplicateChar {  	// Recursively remove all adjacent duplicates. 
	 static char last_removed;
     static String removeUtil(String str)
 {

     // If length of string is 1 or 0
     if (str.length() == 0 || str.length() == 1)
         return str;

     // Remove leftmost same characters and recur for
     // remaining string
     if (str.charAt(0) == str.charAt(1)) {
         last_removed = str.charAt(0);
         while (str.length() > 1
                && str.charAt(0) == str.charAt(1))
             str = str.substring(1, str.length());
             str = str.substring(1, str.length());
         return removeUtil(str);
     }

     // At this point, the first character is definitely
     // different from its adjacent. Ignore first
     // character and recursively remove characters from
     // remaining string
     String rem_str
         = removeUtil(str.substring(1, str.length()));

     // Check if the first character of the rem_string
     // matches with the first character of the original
     // string
     if (rem_str.length() != 0
         && rem_str.charAt(0) == str.charAt(0)) {
         last_removed = str.charAt(0);

         // Remove first character
         return rem_str.substring(1, rem_str.length());
     }

     // If remaining string becomes empty and last
     // removed character is same as first character of
     // original string. This is needed for a string like
     // "acbbcddc"
     if (rem_str.length() == 0
         && last_removed == str.charAt(0))
         return rem_str;

     // If the two first characters of str and rem_str
     // don't match, append first character of str before
     // the first character of rem_str
     return (str.charAt(0) + rem_str);
 }
     
     /* Approach : removeConsecutiveDuplicates
      * If the string is not empty compare the adjacent characters of the string.
      * If they are the same then shift the characters one by one to the left.
      * Call recursion on string S otherwise, call recursion from S+1 string.
     */
    public static String removeConsecutiveDuplicates(String input)
     {
         if (input.length() <= 1) 
             return input;
         if (input.charAt(0) == input.charAt(1))
             return removeConsecutiveDuplicates(input.substring(1));
         else
             return input.charAt(0)
                 + removeConsecutiveDuplicates(input.substring(1));
     }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		last_removed = '\0';
		String str = sc.next();
		sc.close();
		System.out.println(removeUtil(str));
		System.out.println(removeConsecutiveDuplicates(str));
		
		

	}

}
