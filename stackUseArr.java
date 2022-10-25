package stack.DSA;

class stackUseArr{
	public static void main(String []args) throws StackOverFlowException, StackUnderFlowException {
		StackUsingArray stack = new StackUsingArray();
		stack.push(23);
		stack.push(33);
		stack.push(29);
		stack.printStack();
//		System.out.println("Size : " +stack.size());
//		System.out.println("Top of the Stack : " +stack.top());
//		System.out.println("Is Empty :  " + stack.isEmpty());
//		System.out.println("Deleted Element : " + stack.pop());
//		stack.printStack();
//		System.out.println("Is Empty : " +stack.isEmpty());
//		System.out.println("Top of the Stack : " +stack.top());
//		stack.printStack();
//		System.out.println("Deleted Element : " + stack.pop());
//		System.out.println("Deleted Element : " + stack.pop());
//		System.out.println("Deleted Element : " + stack.pop());
		stack.push(23);
		stack.push(50);
		stack.push(53);
		stack.printStack();
		System.out.println("Size : " +stack.size());
		System.out.println("Top of the Stack : " +stack.top());
		System.out.println("Deleted Element : " + stack.pop());
		System.out.println("Size : " +stack.size());
		System.out.println("Top of the Stack : " +stack.top());
		
		
		
	}
	
}