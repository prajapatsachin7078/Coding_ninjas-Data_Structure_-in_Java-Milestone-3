package stack.DSA;

import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {
		Stack<Integer>stack = new Stack<Integer>();
//		stack.push(53);
//		stack.push(32);
//		System.out.println(stack);
//		System.out.println(stack.firstElement());
//		System.out.println(stack.pop()); // delete element from the Peek
//		System.out.println(stack); // print all element of the stack
//		stack.push(23);
//		System.out.println(stack.peek());// Top of the Stack
		  while(stack.isEmpty())
	        {
	            stack.push(10);
	        }
	        System.out.print(stack.pop()+" "+stack.size());
		

	}

}
