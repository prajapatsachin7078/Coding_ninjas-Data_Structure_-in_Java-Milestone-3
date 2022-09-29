package Assignment;

import java.util.Scanner;

public class countZeros {
	static Scanner sc = new Scanner(System.in);
	static int count  = 0;
	public static int countZerosRec(int input){
		// Write your code here
        if(input == 0)
            return 1;
        int isZero = input%10;
        if(isZero == 0){
            count++;
        }
        countZerosRec(input/10);
        return count;
	}
	public static void main(String[] args) {
		int num = sc.nextInt();
		System.out.print(countZerosRec(num));
	}

}
