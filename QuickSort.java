package recursion2;

import java.util.Scanner;

public class QuickSort {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = setArr();
		getArr(arr);
		quickSort(arr,0,arr.length-1);
		getArr(arr);
	}
	private static void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int pivot = partition(arr,l,h);
			quickSort(arr,l,pivot-1);
			quickSort(arr,pivot+1,h);
			
		}
	}

	private static int partition(int[] arr, int l, int h) {
		int pivot = arr[l];
		int count = 0;
		
		// counting how many elements are less or equal to pivot
		for(int i = l+1;i<=h;i++)
			if(arr[i]<=pivot)
				count++;
		
		// inserting pivot to its right index
		int pivotIndex = l+count;
		int temp = arr[l+count];
		arr[l+count] = pivot;
		arr[l] = temp;
		
		// arranging all the elements in such a way so that all the 
		// elements less than pivot should be at the left of pivot 
		// and elements greater than or equal to pivot should be at the right of the pivot
		int i = l, j = h;
		while(i<pivotIndex&&j>pivotIndex) {
			
			// check whether value at index i is less than pivot or not
			// if it is go ahead otherwise stop
			
			while(arr[i]<pivot&&i<pivotIndex)i++;
			
			// check whether value at index j is greater than pivot or not
			// if it is go ahead otherwise stop
			
			while(arr[j]>=pivot&&j>pivotIndex)j--;
			// swapping values if they are not in order
			
			if(i<pivotIndex&&j>pivotIndex) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
			}
				
		}
		// another way to arrange elements 
//		while(i<j){
//            if(arr[i]<pivot){
//                i++;
//            }else if(arr[j]>=pivot){
//                j--;
//            }else{
//                 temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//                i++;
//                j--;
//            }
//        }
		return pivotIndex;
	}
	private static int[] setArr() {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	private static void getArr(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

}
