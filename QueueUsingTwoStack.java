package queue.DSA;

import java.util.Stack;

public class QueueUsingTwoStack {

    //Define the data members
    Stack<Integer> stack;
    Stack<Integer> stack1;

    public QueueUsingTwoStack() {
        //Implement the Constructor
        stack = new Stack<>();
         stack1 = new Stack<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return stack.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return stack.isEmpty();
    }

    public void enqueue(int element) {
        //Implement the push(element) function
        stack.push(element);
    }

    public int dequeue() {
        //Implement the pop() function
        if(stack.isEmpty())return -1;
        int temp ;
        if(stack.size() == 1){
            return stack.pop();
        }
        else{
            while(stack.size()!=1){
                stack1.push(stack.pop());
            }
            temp = stack.pop();
            while(!stack1.isEmpty()){
                stack.push(stack1.pop());
            }
        }
        return temp;
    }

    public int front() {
        //Implement the top() function
        if(stack.isEmpty())return -1;
        int x = (int) stack.firstElement();
		return x;
    }
    void print() {
    	System.out.println(stack);
    	
    }

}