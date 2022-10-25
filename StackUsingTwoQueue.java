package queue.DSA;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {   //Define the data members
    Queue<Integer>q1;
    Queue<Integer>q2;
    int size; 
    


    public StackUsingTwoQueue() {
        //Implement the Constructor
          q1 = new LinkedList<Integer>();
          q2 = new LinkedList<Integer>();
          size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return q1.size();
    }
    public void print() {
    	System.out.println(q1);
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return q1.isEmpty();
    }

    public void push(int element) {
        //Implement the push(element) function
        
            q1.add(element);
    }
	public int pop() {
        //Implement the pop() function
        if(q1.isEmpty())return -1;
        int x;
        if(q1.size() == 1) {
        	return q1.poll();
        }else {
        	while(q1.size() > 1) {
        		q2.add(q1.poll());
        	}
        	x = q1.poll();
        	q1.addAll(q2);
        	q2.clear();
        }
        return x;
    }

    public int top() {
        //Implement the top() function
    	if(q1.isEmpty())return -1;
        if(q1.size() == 1) {
        	return q1.poll();
        }
        int x;
        	while(q1.size() > 1) {
        		q2.add(q1.poll());
        	}
        	x = q1.peek();
        	q2.add(q1.poll());
        	q1.addAll(q2);
        	q2.clear();
        return x;
        
    }
}
