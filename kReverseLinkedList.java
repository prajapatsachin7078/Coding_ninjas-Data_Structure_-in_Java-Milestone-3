package LinkedList;

import java.util.Scanner;

public class kReverseLinkedList {
	static Scanner sc = new Scanner(System.in);
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
        if(k==0){
            return head;
        }
        LinkedListNode<Integer>prev = null,curr = head,nextNode = null;
		int count = 0;
		while(curr!= null && count<k) {
			nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
			count++;
		}
		if(nextNode != null){
			head.next = kReverse(nextNode,k);
		}
		return prev;
	}
	// Main Function : 
	public static void main(String[] args) {
		LinkedListNode<Integer>head = createList();
		sc.close();
		head = kReverse(head,2);
		
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
