package ConditionAndLoops;

import java.util.Scanner;
/*Given three values - 
 * Start Fahrenheit Value (S), 
 * End Fahrenheit value (E) and Step Size (W), 
 * you need to convert all Fahrenheit values from Start to End at the gap of W, 
 * into their corresponding Celsius values and print the table.
 */
public class celsiusTofarheniet {
	public static void main(String[] args) {
		int S,E,W;
        Scanner sc = new Scanner(System.in);
        S=sc.nextInt();
        E=sc.nextInt();
        W=sc.nextInt();
        sc.close();
        for(int i=S;i<=E;i+=W){
            
            System.out.print(i+" ");
            int Celsius=(int)((i-32)/1.8);
            System.out.println(Celsius);
            
            
        }
	}
}
