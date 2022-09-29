package ConditionAndLoops;

import java.util.Scanner;
/*Write a program to print all the factors
 *  of a number other than 1 and the number itself.
 */
public class factors {
	 public static void main(String[] args) {
	        // Write your code here
	        Scanner scanner=new Scanner(System.in);
	        int num = scanner.nextInt();
	        scanner.close();
	        for(int i=2;i<num;i++){
	            if(num%i==0){
	                System.out.print(i+" ");
	            }
	        }

	    }
}
