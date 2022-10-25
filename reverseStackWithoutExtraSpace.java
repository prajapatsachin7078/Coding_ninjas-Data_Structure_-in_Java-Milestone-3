package stack.DSA;

import java.util.Stack;
public class reverseStackWithoutExtraSpace {
	public static void main(String str[]) {
		Stack<Integer>stack1 = new Stack<Integer>();
		initialize(stack1);
		System.out.println(stack1);
		reverseInput(stack1);
		System.out.println(stack1);
	}
	private static void initialize(Stack<Integer> stack1) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i = 1;i<=n;i++) {
			stack1.push(i);
		}
		
	}
	private static void put_at_the_Last(Stack<Integer>input,int k) {
		if(input.isEmpty()) {
			input.push(k);
			return;
		}
		int temp = input.pop();
		put_at_the_Last(input, k);
		input.push(temp);
	}
	private static void reverseInput(Stack<Integer> input) {
		if(input.isEmpty()) {
			return;
		}
		int temp = input.pop();
		reverseInput(input);
		put_at_the_Last(input, temp);
		
	}

}
