package ConditionAndLoops;

import java.util.Scanner;

// program to print multiplication table of n
public class multiplicationTable {
	public static void main(String[] args) {
		// Write your code here
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++){
            int Num = num*i;
            System.out.print(Num+ " ");
        }

	}
}
