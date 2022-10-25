package TimeComplexity1;

import java.util.Arrays;
import java.util.Scanner;

public class uniqueElement {
	static Scanner sc = new Scanner(System.in);
	private static int[] setArr() {
		System.out.println("Enter the len of the arr : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the elements : " );
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int []arr = setArr();
		System.out.print(findUnique(arr));
		sc.close();
	}

	public static int findUnique(int[] arr) {
		//Your code goes here
         Arrays.sort(arr);
        int i = 0;
        int unique = 0;
        if(arr.length == 1)
            return arr[0];
        while(i<arr.length){
            unique ^= arr[i];
            i++;
        }
        return unique;
	}
}
