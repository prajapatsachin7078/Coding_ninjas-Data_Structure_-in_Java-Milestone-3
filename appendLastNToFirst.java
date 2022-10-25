package LinkedList;

import java.util.Scanner;

public class appendLastNToFirst {
	static Scanner sc = new Scanner(System.in);
	
		public static Node<Integer> append(Node<Integer> head) {// appending the list (last N to first)
			//Your code goes here
			System.out.print("Enter the value of N to append the list :  ");
			int n = sc.nextInt();
			sc.close();
	        if(head == null || n == 0 || n > sizeOfList(head)){ // if linked list is empty then return head
	            return head;
	        }
	        Node<Integer>tail = head; 
	        Node<Integer>newHead = null;
	        int i = 1;
	        newHead = tail.next;
	        int size = sizeOfList(head);
	        while(i<size-n){
	            tail= tail.next;
	            newHead = newHead.next;
	            i++;
	        }
	        tail.next = null;
	        // getting the end Node of the list
	        Node<Integer>endNode = endOfList(newHead);
	        endNode.next = head; // connecting both the lists
	        head = newHead; // head now pointing to appended list
	        return head;
	        
	        
		}
		
		// Main function :
	public static void main(String[] args) {
		Node<Integer>head = createList();
		printList(head);
		head = append(head);
		printList(head);

	}
	public static Node<Integer> createList(){ // creating new list
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
	private static void printList(Node<Integer> head) { // Printing elements of the list
		Node<Integer>temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next; // temp will point to the next node
		}
	}
	    private static int sizeOfList(Node<Integer> head) {
	    	Node<Integer>temp = head;
			int count = 0;
			while(temp!=null) {
				count++;
				temp = temp.next; // temp will point to the next node
			}
			return count;
		}
	    private static Node<Integer> endOfList(Node<Integer> head) { // getting last pointer
	    	Node<Integer>temp = head;
			while(temp.next!=null) {
				temp = temp.next; // temp will point to the next node
			}
			return temp;
		}
}
