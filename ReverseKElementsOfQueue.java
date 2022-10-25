package queue.DSA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementsOfQueue {

	public static void main(String[] args) {
		Queue<Integer>input = new LinkedList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		System.out.println(input);
		input = reverseKElements(input,4);
		System.out.println(input);
		

	}
	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
        int count = 1;
        int size = input.size();
        Stack<Integer> st = new Stack<Integer>();
        while(count<=k){
            count++;
            st.push(input.poll());
        }
        while(!st.isEmpty()) {
        	input.add(st.pop());
        }
        int i = k+1;
        while(i<=size){
            input.add(input.poll());
            i++;
        }
        return input;
	}

}
