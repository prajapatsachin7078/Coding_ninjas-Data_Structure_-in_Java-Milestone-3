package LinkedList;

import java.util.Scanner;

public class skipMdeleteNinLList {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		LinkedListNode<Integer>head = createList();
		int M = sc.nextInt();
		int N = sc.nextInt();
		head = skipMdeleteN(head,M,N);
		printList(head);
	}
	// Function for skipMdelteN elements from the given linked list
	// it'll update the same Linked list by skipping each M nodes and deleting each N nodes after M nodes
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		//Your code goes here
        if(head==null||head.next==null){
            return head;
        }
        if(M==0){ // if the numbers we have to skip is 0 
            return null;  // then simply return null as all values will be delelted
        }
        LinkedListNode<Integer>prevNode = head,nextNode = head;
        int count1 = 1,count2 = 1;
        while(count2<=N && nextNode.next !=null){
            count1++;
            if(count1<=M){
            prevNode = prevNode.next;
            nextNode = nextNode.next;
            }
            if(count1>M){
                nextNode = nextNode.next;
                count2++;
            }
        }
        // if(nextNode.next!=null)
        prevNode.next = nextNode.next;
        skipMdeleteN(nextNode.next,M,N);
        return head;
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
