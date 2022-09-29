package recursion2;
import java.util.Scanner;

public class mergeSort {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int arr[] = setArr();
		getArr(arr);
		Sorting(arr);
		getArr(arr);
	}

	private static void getArr(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	private static void Sorting(int[] arr) {
		if(arr.length <=1 )
			return;
		int arr1[] = new int[arr.length/2];
		int arr2[] = new int[arr.length - arr1.length];
		for(int i = 0;i<arr1.length;i++) {
			arr1[i] = arr[i];
		}
		for(int i = arr.length/2;i<arr.length;i++) {
			arr2[i-arr.length/2] = arr[i];
		}
		Sorting(arr1);
		Sorting(arr2);
		merge(arr1,arr2,arr);
	}

	// Merging both the sub Arrays after sorting
	private static void merge(int[] arr1, int[] arr2, int[] arr) {
		int i = 0,j= 0,k = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				k++;
				i++;
			}
			else {
				arr[k] = arr2[j];
				k++;
				j++;
			}
			
		}
		// initializing remaining elements of left subArray
		while(i<arr1.length) {
			 arr[k] = arr1[i];
			k++;i++;
		}
		// initializing remaining elements of right subArray
		while(j<arr2.length) {
			arr[k] = arr2[j];
			k++;j++;
		}
		
	}

	
	private static int[] setArr() {
		// TODO Auto-generated method stub
		int arr[] = new int[8];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

}
