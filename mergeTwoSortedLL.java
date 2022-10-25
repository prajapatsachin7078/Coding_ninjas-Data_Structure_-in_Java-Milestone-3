package LinkedList;
import java.util.*;
public class mergeTwoSortedLL {
	static Scanner sc = new Scanner(System.in);  
	// Function to Merge two sorted Linked Lists 
	    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
	        //Your code goes here
	        if(head1 == null){
	            return head2;
	        }if(head2 == null){
	            return head1;
	        }
	        
	        LinkedListNode<Integer>tail = null,newHead = null,t1 = head1,t2 = head2;
	        // Decide which list's element will become new Head of the merged list
	        if(t1.data<=t2.data) {
	        	newHead = t1; // if t1's first element is less than t2's first element
	        	tail = t1;    // then we'll make newHead of the list to t1
	        	t1 = t1.next;	// and start inserting elements to tail
	        }else {
	        	newHead = t2; // if t2's first element is less than t1's 
	        	tail = t2;    // then we'll make newHead of the list to t2
	        	t2 = t2.next;  // and start inserting elements to tail
	        }
	        while(t1!=null && t2!=null){
	            if(t1.data<t2.data){ // when t1.data is less than t2.data
	            	tail.next = t1;  // Inserting t1's reference to the tail.next
	            	tail = tail.next; // updating tail
	                t1 = t1.next; // Update t1
	            }
	            else{ // if t2.data less than or equal to  t1.data 
	            	tail.next = t2;   // Inserting t2's reference to the tail.next
	            	tail = tail.next;  // Updating tail for further insertion
	                t2 = t2.next;   // Update t2 
	            }
	        }
	        if(t1 != null){
	            tail.next = t1;
	        }if(t2 != null){
	            tail.next = t2;
	        }
	        return newHead;
	    }
	    // Main Function
	    public static void main(String args[]) {
	    	LinkedListNode<Integer>head1 = createList(); // Creating first sorted List
	    	LinkedListNode<Integer>head2 = createList(); // Creating Second sorted List
	    	sc.close();
	    	head1 = mergeTwoSortedLinkedLists(head1,head2); // Updating Head1 with merged list
	    	printList(head1);
	    	
	    }
	    // Function to print element of the Linked Lists
	    public static void printList(LinkedListNode<Integer>temp) {
	    	if(temp == null) {
	    		System.out.print("empty");
	    	}
	    	while(temp!=null) {
				System.out.print(temp.data + " ");
				temp = temp.next; // temp will point to the next node
			}
	    }
	 // Create List
		public static LinkedListNode<Integer> createList(){
			LinkedListNode<Integer>head = null,tail = null;
			int data = sc.nextInt();
			while(data != -1) { // if value is -1 then it will stop 
				LinkedListNode<Integer>newNode = new LinkedListNode<Integer>(data);// creating new node
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

}
