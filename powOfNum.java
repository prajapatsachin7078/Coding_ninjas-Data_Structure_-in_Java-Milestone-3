package ConditionAndLoops;

import java.util.Scanner;

// power of a number ?
public class powOfNum {
	public static void main(String[] args) {
        // Write your code here
        Scanner scanner=new Scanner(System.in);
        int num  = scanner.nextInt();
        int pow = scanner.nextInt();
        scanner.close();
        int mul=1;
        for(int i=1;i<=pow;i++){
            mul*=num;
        }
        System.out.println(mul);
        
    }
}
