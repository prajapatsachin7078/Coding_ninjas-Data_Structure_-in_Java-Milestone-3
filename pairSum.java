package TimeComplexity1;
import java.util.*;
public class pairSum {
	public static int pairsum(int arr[],int sum) {
	HashMap<Integer, Integer> hm = new HashMap<>();
	 int n = arr.length;
    // Store counts of all elements in map hm
    for (int i = 0; i < n; i++) {

        // initializing value to 0, if key not found
        if (!hm.containsKey(arr[i]))
            hm.put(arr[i], 0);

        hm.put(arr[i], hm.get(arr[i]) + 1);
    }
//    System.out.println(hm.get(arr[2]));
    int twice_count = 0;

    // iterate through each element and increment the
    // count (Notice that every pair is counted twice)
    for (int i = 0; i < n; i++) {
        if (hm.get(sum - arr[i]) != null)
            twice_count += hm.get(sum - arr[i]);

        // if (arr[i], arr[i]) pair satisfies the
        // condition, then we need to ensure that the
        // count is decreased by one such that the
        // (arr[i], arr[i]) pair is not considered
        if (sum - arr[i] == arr[i])
            twice_count--;
    }

    // return the half of twice_count
    return twice_count / 2;
}
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
		System.out.print("Enter the sum : ");
		int sum = sc.nextInt();
		System.out.print(pairsum(arr,sum));
		sc.close();
	}

}
