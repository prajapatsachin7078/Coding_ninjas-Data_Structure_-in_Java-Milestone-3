package LinkedList;

import java.util.Scanner;

public class isPalindromeLinkedList {
	static Scanner sc = new Scanner(System.in);
	// Main Function : =>
	public static void main(String []args) {
		Node<Integer>head = createList();
		sc.close();
		printList(head);
		System.out.println("");
		System.out.print("List is Palindrome : " + isPalindrome(head));
	}
	
	 // Checking whether list is palindrome or not
		public static boolean isPalindrome(Node<Integer> head) {
			if(head == null||head.next == null)
	            return true;
			Node<Integer>mid = findMid(head);
			Node<Integer>last = reverse(mid);
			Node<Integer>curr = head;
	        while(last!=null){
	            if(!last.data.equals(curr.data)){
	                return false;
	            }
	            last = last.next;
	            curr = curr.next;
	        }
	        return true;
	    }
	// Reversing right half of the list
	public static Node<Integer> reverse(Node<Integer>head){
        if(head == null||head.next == null)
            return head;
        Node<Integer>newHead = reverse(head.next);
        Node<Integer>nextHead = head.next;
        nextHead.next = head;
        head.next = null;
        return newHead;
    }
	// Finding middle of the list
    public static Node<Integer> findMid(Node<Integer>head){
    	Node<Integer>fast = head,slow = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // Creating the list
    public static Node<Integer> createList(){
		Node<Integer>head = null,tail = null;
		int data = sc.nextInt();
		while(data != -1) { // if value is -1 then it will stop 
			Node<Integer>newNode = new Node<Integer>(data);// creating new node
			if(head == null) {
				// if head is null then list is empty
			    // initializing it with newNode
				head = newNode;
				tail = head;
				
			}else {
				tail.next = newNode;
				tail = tail.next;
			}
			data = sc.nextInt();
		}
		return head;
	}
 // Print List
 	private static void printList(Node<Integer> head) {
 		Node<Integer>temp = head;
 		while(temp!=null) {
 			System.out.print(temp.data + " ");
 			temp = temp.next; // temp will point to the next node
 		}
 	}
   
}
