package stack.DSA;
import java.util.*;
public class Practice {

    public static void main(String str[]) {
    	Queue<Integer>q = new LinkedList<Integer>();
    	q.add(1);
    	q.add(2);
    	q.add(3);
    	q.add(4);
    	q.add(5);
    	q.add(6);
    	System.out.println(q);
    	reverseQueue(q,4);
    	System.out.println(q);
    	
    }
    public static void reverseQueue(Queue<Integer> input,int k) {
		//Your code goes here
    	int count = 0;
    	int size = input.size();
        Stack<Integer> st = new Stack<Integer>();
        while(count<=k){
            count++;
            st.push(input.poll());
        }
        while(!st.isEmpty()) {
        	input.add(st.pop());
        }
        while(!st.isEmpty()) {
        	input.add(st.pop());
        }
        
	}

}
