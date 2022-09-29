package Recurssion;
// Check Whether the given array is sorted or not using recursion
public class isSortedArr {
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,5};
		System.out.println(isSorted(arr));
		System.out.print(isSortedBetter(arr,0));
		
	}
	

	private static boolean isSortedBetter(int[] arr, int si) {
		if(si == arr.length-1)
			return true;
		if(arr[si] > arr[si+1])
			return false;
		return isSortedBetter(arr,si+1);
	}


	private static boolean isSorted(int[] arr) {
		if(arr.length == 1) {
			return true;
		}
		if(arr[0] > arr[1]) {
			return false;
		}
		int smallArr[] = new int[arr.length-1];
		for(int i = 1;i<arr.length;i++) {
			smallArr[i-1] = arr[i];
		}
		boolean isSmallArrSorted = isSorted(smallArr);
		return isSmallArrSorted;
	}


}
