package TimeComplexity1;

import java.util.*;

public class arrayIntersection {
	
	public static void arrIntersection(int arr1[], int arr2[]) {
		Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int n = arr1.length;
        int m = arr2.length;
        
        int i=0,j=0;
        
        while(i<n && j<m){
              
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            
            
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
        }
	}
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
	// Scanner 
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int []arr1 = setArr(); // Initializing  arr1;
		int []arr2 = setArr(); // Initializing arr2;
		System.out.print("Arrays Intersectio : ");
		arrIntersection(arr1,arr2); // calling arrIntersection function to 
		//print arrays Intersection
		sc.close(); // Closing object sc to avoid memory leakage
		
	}

}
