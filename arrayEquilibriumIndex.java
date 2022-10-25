package TimeComplexity1;

import java.util.Scanner;

public class arrayEquilibriumIndex {
	static Scanner sc = new Scanner(System.in);
	public static int arrayEquilIndex(int[] arr){  
		//Your code goes here
        int sum2 = 0;
        for(int i = 1;i<arr.length;i++){
            sum2+=arr[i];
        }
        // System.out.print(sum1);
        int sum1= 0;
        for(int i = 0,pivot = 0;i<arr.length-1
            &&pivot<arr.length-1;i++){
            
            if(sum2 == sum1)
                return i;
            sum2-=arr[i+1];
            sum1+=arr[i];
        }
        return -1;
	}
	private static void getArr(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	private static int[] setArr() {
		// TODO Auto-generated method stub
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
		System.out.print(arrayEquilIndex(arr));
		sc.close();

	}

}
