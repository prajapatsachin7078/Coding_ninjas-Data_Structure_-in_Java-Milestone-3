package ConditionAndLoops;

import java.util.Scanner;

/*Write a program to input an integer N and
 *  print the sum of all its even digits and
 *  sum of all its odd digits separately.
 * Digits mean numbers, not the places!
 * That is, if the given integer is "13245",
 * even digits are 2 & 4 and odd digits are 1, 3 & 5.
*/
public class sumOfEvenAndOdd {
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int Sum_of_Even=0;
        int Sum_of_Odd=0;
        while(num!=0){
      int n=num%10;
      if(n%2==0){
       Sum_of_Even+=n;
      }
      else{
        Sum_of_Odd+=n;
      }
      num=num/10;
    }
    System.out.println(Sum_of_Even +" "+Sum_of_Odd);

	}
}
