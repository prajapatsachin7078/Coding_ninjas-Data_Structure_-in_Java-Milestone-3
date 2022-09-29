package Assignment;
import java.util.Scanner;
public class GeometricSum {
	static Scanner sc = new Scanner(System.in);
	 static double sum = 0;
		public static double findGeometricSum(int k){
			// Write your code here
	        if(k==0)
	            return 1;
	            
	        double temp = Math.pow(2,k);
	        sum = sum + 1/temp + findGeometricSum(k-1);
	        return sum;
	    }
	public static void main(String[] args) {
		int k = sc.nextInt();
		System.out.print("Sum of G.P : "+findGeometricSum(k));

	}

}
