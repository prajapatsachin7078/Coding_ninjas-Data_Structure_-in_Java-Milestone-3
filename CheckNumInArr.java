package Recurssion;
// Check whether the given num is available in the given array or not
public class CheckNumInArr {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int l = 0;
		int r = arr.length-1;
		int x = 92;
		System.out.println(recSearch(arr,l,r,x));
		System.out.print(recBinarySearch(arr,l,r,x));
	}

	private static boolean recBinarySearch(int[] arr, int l, int r, int x) {
		if(r<l)
			return false;
		int mid = (r+l)/2;
		if(arr[mid] == x)
			return true;
		else if(arr[mid]>x)
			return recBinarySearch(arr,l,mid-1,x);
		else
			return recBinarySearch(arr,mid+1,r,x);
	}

	private static boolean recSearch(int[] arr, int l, int r, int x) {
		if(r<l)
			return false;
		else if(arr[l] == x)
			return true;
		else if(arr[r] == x)
			return true;
		else
			return recSearch(arr,l+1,r-1,x);
	}

}
