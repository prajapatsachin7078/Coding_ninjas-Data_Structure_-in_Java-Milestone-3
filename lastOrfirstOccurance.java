package Recurssion;

public class lastOrfirstOccurance {
	public static int lastOccur(int arr[],int si,int x){
        if(si == 0){
            return -1;
        }
        if(arr[si] == x)
            return si;
        return lastOccur(arr,si-1,x);
    }
	public static int firstOccur(int arr[],int si,int x){
        if(si == arr.length-1){
            return -1;
        }
        if(arr[si] == x)
            return si;
        return firstOccur(arr,si+1,x);
    }
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,5};
		System.out.println("First Occur of : "+ firstOccur(arr,0,2));
		System.out.print("Last Occur : " +lastOccur(arr,arr.length-1,2));
		
	}

}
