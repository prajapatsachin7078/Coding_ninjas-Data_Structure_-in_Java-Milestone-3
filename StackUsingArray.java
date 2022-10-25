package stack.DSA;

public class StackUsingArray {
	private int data[];
	private int topIndex; // topIndex we'll specify the top-most element of the Stack
	public StackUsingArray(){
		data = new int[5];
		topIndex = -1;
	}
	// PUSH function to add element to the Stack
	 void push(int value) {
		topIndex ++;
		if(topIndex==data.length) {
			data = doubleCapacity(); // it'll double the size of the Stack
		}
		data[topIndex] = value;
			
	}
	// Double the capacity of the Stack
	private int[] doubleCapacity() {
		int newArr[] = new int[data.length*2];
		for(int i=0;i<data.length;i++) {
			newArr[i] = data[i];
		}
		return newArr;
	}
	 void printStack() throws StackUnderFlowException {
		if(topIndex == -1) {
			throw new StackUnderFlowException();
		}
		for(int i = topIndex;i>=0;i--) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	// POP function to Delete an element from the Stack
	 int pop() throws StackUnderFlowException {
		if(isEmpty()) {
			throw new StackUnderFlowException();
		}
		int x = -1;
		x=data[topIndex];
		topIndex--;
		return x;
		
	}
	// Check whether the Stack is Empty or not
	 boolean isEmpty() {
		return topIndex == -1;
	
	}
	// Return element at the top of the stack
	 int top() throws StackUnderFlowException {
		if(isEmpty()) {
			throw new StackUnderFlowException();
		}
		return data[topIndex];
		
	}
	// Returns the size of the Stack
	 int size() throws StackUnderFlowException {

		
		if(topIndex == -1) {
			throw new StackUnderFlowException();
		}
		return topIndex+1;
	}
	

}
