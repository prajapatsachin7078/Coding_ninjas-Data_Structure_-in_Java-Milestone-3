package LinkedList;

import java.util.Scanner;

public class linkedListUse {
	static Scanner sc = new Scanner(System.in);
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
	
	public static void main(String[] args) {///            Main function
		
		Node<Integer>head = createList();  // creating list
		printList(head); // Print the List
		System.out.println();
		head = InsertAtIthPosition(head);
		sc.close();
		printList(head);
	}
	private static Node<Integer> InsertAtIthPosition(Node<Integer> head) {
		System.out.print("Enter the position (indexing(0<=i>n) : " );
		int pos = sc.nextInt();
		Node<Integer>prevNode = head,nextNode = head.next;
		int data = sc.nextInt();
		Node<Integer>newNode = new Node<Integer>(data);// creating new node
		int i = 0;
		
		if(pos == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		else if(pos == sizeOfList(head)){
			Node<Integer>temp = head;
			while(temp.next!=null) {
				temp = temp.next; // temp will point to the next node
			}
			temp.next = newNode;
			return head;
		}
		
		while(i<pos-1) {
			prevNode = prevNode.next;
			nextNode = nextNode.next;
			i++;
		}
		newNode.next = nextNode;
		prevNode.next = newNode;
		return head;
	}
	private static int sizeOfList(Node<Integer> head) {
		Node<Integer>temp = head;
		int count = -1;
		while(temp!=null) {
			count++;
			temp = temp.next; // temp will point to the next node
		}
		return count;
	}
	private static void printList(Node<Integer> head) {
		Node<Integer>temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next; // temp will point to the next node
		}
	}
//	private static void increment(Node<Integer> head){ // Increment function
//	    Node<Integer> temp = head;
//	    while(temp != null){
//	        temp.data++;
//	        temp = temp.next;
//	    }
//	}
}
