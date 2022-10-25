package TimeComplexity1;

import java.util.Arrays;
import java.util.Scanner;

public class duplicateElement {
	
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
		System.out.print(findDuplicate(arr));
		sc.close();
	}

	
	public static int findDuplicate(int[] arr) {
		//Your code goes here
        Arrays.sort(arr);
        int i = 0;
        int duplicate = -1;
        while(i<arr.length-1){
            if(arr[i] == arr[i+1]){
                duplicate = arr[i];
                break;
            }
            else{
                i++;
            }
        }
        return duplicate;
	}

}
