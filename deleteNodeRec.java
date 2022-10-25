package LinkedList;

import java.util.Scanner;

public class deleteNodeRec {
	static Scanner sc = new Scanner(System.in);
	// Insert Node at x position using recursion : =>
	public static Node<Integer> deleteRec(Node<Integer>head,int pos){
		if(head == null && pos>=0) {
			return head;
		}
		if(pos == 0) { // when pos becomes = 0 then it'll delete the node
			return head.next;
		}
		head.next = deleteRec(head.next,pos-1);
		return head;
	}
	// Main Function =>
	public static void main(String args[]) {
		Node<Integer>head = createList();
		head = deleteRec(head,8); // Index starts from 0
		printList(head);
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
