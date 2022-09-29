package recursion2;

import java.util.Scanner;

public class replaceChar {
public static String replaceCharacter(String str, char c1, char c2) {
		
        if(str.length() == 0){
            return str;
        }
        if(str.charAt(0) == c1){
            return c2 + replaceCharacter(str.substring(1),c1,c2);
        }
        
        return str.charAt(0) + replaceCharacter(str.substring(1),c1,c2);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str  = sc.next();
		char c1 = 'a';
		char c2 = 'x';
		sc.close();
		System.out.print(replaceCharacter(str,c1,c2));

	}

}
