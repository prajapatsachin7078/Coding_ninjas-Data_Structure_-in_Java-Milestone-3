package LinkedList;

import java.util.Scanner;
public class eliminateDuplicateLL {
	static Scanner sc = new Scanner(System.in);
	// function to eliminate the duplicates from the list
	public static Node<Integer> removeDuplicates(Node<Integer> head) {

		   if(head==null|| head.next == null) return head;
		   Node<Integer>currHead=head, nextNode = currHead.next;
		        while(nextNode != null){
		            if(currHead.data.equals(nextNode.data)){
		                // checked whether the next element is null
		                if(nextNode.next == null){
		                    currHead.next = null;
		                    nextNode = nextNode.next;
		                }
		                else{
		                    nextNode = nextNode.next;
		                }
		                
		            }else{ // if current element is not equal to next element
		                currHead.next = nextNode;
		                currHead = nextNode;
		                nextNode = nextNode.next;
		            }
		        }
		        return head;
		        
		        // Another approach : 
		        
		        // LinkedListNode<Integer>currHead=head;
		        // while(currHead.next!=null){
		        //   if(currHead.data.equals(currHead.next.data)){
		        //       currHead.next=currHead.next.next;
		        //   } else{
		        //       currHead=currHead.next;
		        //   } 
		        // }
                //return head;
	}

	public static void main(String[] args) {// Main function 
		Node<Integer>head = createList();
		printList(head);
		System.out.println("");
		head = removeDuplicates(head);
		System.out.print("After eleminating the duplicates : ");
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


}
