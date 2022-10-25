package stack.DSA;

public class StackLLUse {

	public static void main(String[] args) throws StackUnderFlowException {
		StackUsingLinkedList<Integer>stack = new StackUsingLinkedList<Integer>();
		stack.push(54);
		stack.push(23);
		stack.printStack();
		System.out.println("Size : " +stack.size());
		System.out.println("Top of the Stack : " +stack.Top());
		System.out.println("Deleted Element : " + stack.pop());
		System.out.println("Size : " +stack.size());
		System.out.println("Top of the Stack : " +stack.Top());
		System.out.println("Deleted Element : " + stack.pop());
//		System.out.println("Deleted Element : " + stack.pop());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
//		stack.printStack();
		System.out.println("Deleted Element : " + stack.pop());
		
		
		
		

	}

}
