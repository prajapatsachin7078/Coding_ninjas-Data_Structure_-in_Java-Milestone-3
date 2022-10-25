package Assignment;

/*
 *  A child is running up a staircase with N steps, 
 *  and can hop either 1 step, 2 steps or 3 steps at a time.
 *  Implement a method to count 
 *  how many possible ways the child can run up to the stairs. 
 *  You need to return number of possible ways W.
*/
import java.util.Scanner;

public class stairCase {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		System.out.print(stair(n));

	}

	private static int stair(int n) {
		if(n==0)
			return 1;
		if(n==1||n==2)
			return n;
		int opt1 = stair(n-1);
		int opt2 = stair(n-2);
		int opt3 = stair(n-3);
		return opt1 + opt2 + opt3;
		
	}

}
