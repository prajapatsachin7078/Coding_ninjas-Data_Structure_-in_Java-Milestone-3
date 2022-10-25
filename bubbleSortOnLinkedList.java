package LinkedList;

import java.util.Scanner;

public class bubbleSortOnLinkedList {
	static Scanner sc = new Scanner(System.in);
	// Main Function : 
	public static void main(String []args) {
		LinkedListNode<Integer>head = createList();sc.close();
		head = bubbleSort(head);
//		head = bubbleSort_UpdateNode(head);
		printList(head);
	}
	// Bubble sort to Sort the Linked list without changing Nodes (Means => We'll swap Data not nodes)
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer>head){
		LinkedListNode<Integer>start = head,end = null;
		if(head == null || head.next == null) {
			return head;
		}
		int swap;
		do {
			start = head;
			 swap = 0;
			while(start.next != end) {
				if(start.data >start.next.data) {
					int temp = start.data;
					start.data = start.next.data;
					start.next.data = temp;
					// Update swap with 1 
					swap = 1;
				}
				start = start.next;
			}
			end = start;
		}while(swap!=0);
		
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
		// Another approach : swapping nodes instead of their data
		public static LinkedListNode<Integer> bubbleSort_UpdateNode(LinkedListNode<Integer>head){
			 if(head==null || head.next==null) {
			        return head;
			 }
			        //Write your code here
			        for(int i=1;i<lengthLL(head);i++){
			            LinkedListNode<Integer> prev = null;
			            LinkedListNode<Integer> curr = head;
			            LinkedListNode<Integer> next = curr.next;

			            while(curr.next != null){
			                if(curr.data > curr.next.data){
			                    if(prev == null){
			                        curr.next = next.next;
			                        next.next = curr;
			                        prev = next;
			                        head = prev;
			                    }else{
			                        next = curr.next;
			                        curr.next = next.next;
			                        prev.next = next;
			                        next.next = curr;
			                        prev = next;
			                    }
			                }else{
			                    prev = curr;
			                    curr = curr.next;
			                }
			            }
			        }
			        return head;
		}
		// returns length of the linked list
		 public static int lengthLL(LinkedListNode<Integer>head){
		        int count = 0;
		        while(head!=null){
		            count++;
		            head = head.next;
		        }
		        return count;
		    }


}
