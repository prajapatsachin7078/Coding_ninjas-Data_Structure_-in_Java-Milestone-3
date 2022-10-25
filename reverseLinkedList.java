package LinkedList;

import java.util.Scanner;

public class reverseLinkedList {
	static Scanner sc = new Scanner(System.in);
	// Print List
	private static void printList(Node<Integer> head) {
		Node<Integer>temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next; // temp will point to the next node
		}
	}
	// Create List
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
	// Main Function of the List
	public static void main(String[] args) {
		Node<Integer>head = createList();
		printList(head);
		System.out.println("");
//		head = reverse(head);
		head = reverseRecursively(head);
		sc.close();
		printList(head);
	}
	// Reverse List : Iterating Approach
	private static Node<Integer> reverse(Node<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> curr = head, prev = null;
		while(curr!=null) {
			Node<Integer>temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	// Reverse List : Recursive Approach
	private static Node<Integer> reverseRecursively(Node<Integer> head) {
		if(head == null || head.next == null)
			return head;
		Node<Integer>newHead = reverse(head.next); // it'll return new head or last node of the list
		Node<Integer>nextHead = head.next;  // making link between first two nodes
		nextHead.next = head;
		head.next = null; // now prevHead Node will point to the null as a last node of the list
		return newHead;
	}

}
