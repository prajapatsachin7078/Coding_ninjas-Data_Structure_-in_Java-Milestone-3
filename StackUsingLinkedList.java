package stack.DSA;
import LinkedList.LinkedListNode;
public class StackUsingLinkedList<T> {
	
	private LinkedListNode<T>head;
	static int size;
	StackUsingLinkedList(){
		head = null;
		 size = 0;
	}
	
     void push(T value) { // Adding new element to the stack
    	if(head == null) {
    		head = new LinkedListNode<T>(value);
    	}else {
    		LinkedListNode<T>newNode = new LinkedListNode<T>(value);
    		newNode.next = head;
    		head = newNode;
    	}
    	size++;
	}
     void printStack() {
    	 LinkedListNode<T>temp = head;
    	 while(temp!=null) {
    		 System.out.println("|" + temp.data+"|");
    		 temp = temp.next;
    	 }
     }
	 int size() throws StackUnderFlowException { // size function 
		 if(size == 0)
			 throw new StackUnderFlowException();
		return size;
	}
	
	public T pop() throws StackUnderFlowException { // POP function to delete the element
		if(isEmpty()) {
			throw new StackUnderFlowException();
		}
		T x = head.data;
		head = head.next;
		printStack();
		size--;
		return x;
	}
	
	 boolean isEmpty() {
		return head==null?true:false; // check if Empty 
	}

	 T Top() {
		// TODO Auto-generated method stub
		return head.data;
	}
	

}
