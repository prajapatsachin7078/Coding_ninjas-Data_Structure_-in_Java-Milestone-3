package LinkedList;

import java.util.Scanner;

public class mergeSortLinkedList {
	static Scanner sc = new Scanner(System.in);
	
	// Merge Sort Function : 
	 public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
	        if(head==null)
	            return head;
	        if(head.next==null)
	            return head;
	        LinkedListNode<Integer> midNode=findmid(head);
	        LinkedListNode<Integer> h2=midNode.next;
	        midNode.next=null;
	        LinkedListNode<Integer> part1=mergeSort(head);
	        LinkedListNode<Integer> part2=mergeSort(h2);
	        LinkedListNode<Integer> mergedList=mergeTwoList(part1,part2);
	        return mergedList;
	        
	        }
	 
	 // Find Middle of the list : 
	    private static LinkedListNode<Integer> findmid(LinkedListNode<Integer> head) 
	    {
	        if(head==null)
	            return head;
	        LinkedListNode<Integer> slow=head,fast=head;
	        while(fast.next!=null && fast.next.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow;
	    }
	    
	    // Merging both sorted sub-Linked Lists
	    public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
	        if(head1==null)
	            return head2;
	        if(head2==null)
	            return head1;
	        LinkedListNode<Integer> t1=head1,t2=head2,tail=null,head=null;
	        if(t1.data<=t2.data)
	        {
	            head=t1;
	            tail=t1;
	            t1=t1.next;
	        }
	        else
	        {
	            head=t2;
	            tail=t2;
	            t2=t2.next;
	        }
	        while(t1!=null &&t2!=null)
	        {
	            if(t1.data<=t2.data)
	            {
	                tail.next=t1;
	                tail=t1;
	                t1=t1.next;
	            }
	            else
	            {
	                tail.next=t2;
	                tail=tail.next;
	                t2=t2.next;
	            }
	        }
	        if(t1==null)
	            tail.next=t2;
	        if(t2==null)
	            tail.next=t1;
	        return head;

	    }
	   
	    // Main Function : =>

	public static void main(String[] args) {
		LinkedListNode<Integer>head = createList();
		head = mergeSort(head);
		printList(head);
		

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
