package stack.DSA;

import java.util.*;

public class stockSpan {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		arr = span(arr);
		for(int i = 0;i<n;i++) {
			System.out.printf(arr[i]+" ");
		}
	}
	public static int[] span(int[] price) {
		int[] span=new int[price.length];
        Stack<Integer> stack=new Stack<Integer>();
        span[0]=1;// first price span is 1 as there is nothing to the left of first price to compare
        stack.push(0);// pushed 0 index to the stack for next comparisons 
        for (int i=1;i<price.length;i++){
            while(!stack.isEmpty() && price[stack.peek()]<price[i]){
                stack.pop();
            }
            // If stack becomes empty, then price[i] is
            // greater than all elements on left of it, i.e.,
            // price[0], price[1], ..price[i-1]. Else price[i]
            // is greater than elements after top of stack
            if (stack.isEmpty()){
                span[i]=i+1;
            }
            else{ // when stack is not empty and the price at stack.peek() index is greater than the 
                // price is on ith index
                span[i]=i-stack.peek();
            }
            // push value of index to the stack to make comparasion further
            stack.push(i);
        }
        return span;
	}

}
