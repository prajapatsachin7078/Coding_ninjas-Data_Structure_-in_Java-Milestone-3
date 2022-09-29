package recursion2;

import java.util.Scanner;
 // Array must be sorted before implementing binary search 
public class binarySearch {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int arr[] = new int[6];
		setArr(arr);
		getArr(arr);
		int num = sc.nextInt();
		System.out.print(search(arr,0,arr.length-1,num));
	}

	private static int search(int[] arr, int l, int r, int num) {
		if(r<l)
			return -1;
		int mid = (l+r)/2;
		if(arr[mid] == num)
			return mid;
		else if(arr[mid] > num)
			return search(arr,l,mid-1,num);
		else
			return search(arr,mid+1,r,num);
			
	}

	private static void getArr(int[] arr) {
		System.out.print("Array : ");
		for(int i = 0 ;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}

	private static void setArr(int[] arr) {
		System.out.println("Enter the elements of size: " + arr.length + " : ");
		for(int i = 0 ;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	}

}
