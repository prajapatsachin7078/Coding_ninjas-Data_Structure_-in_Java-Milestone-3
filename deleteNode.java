package LinkedList;

import java.util.Scanner;

public class deleteNode {
	static Scanner sc = new Scanner(System.in);
	// print list
	private static void printList(Node<Integer> head) {
		Node<Integer>temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next; // temp will point to the next node
		}
	}
	// returns size of the list
	public static int sizeOfList(Node<Integer> head) {
		Node<Integer>temp = head;
		int count = -1;
		while(temp!=null) {
			count++;
			temp = temp.next; // temp will point to the next node
		}
		return count;
	}
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
	// Delete Node at 'x' postion function
	public static Node<Integer> deleteNodeAtPosition(Node<Integer>head) {
		// Write your code here.
		System.out.print("Enter the position to delete element (pos>=0): ");
		int pos = sc.nextInt();
		sc.close();
        if(head == null){
            return head;
        }
        Node<Integer> prevNode = null, nextNode = head;
        if(pos == 0){   // if the index is 0
            head = head.next;
            return head;
        }
        else if(pos == sizeOfList(head)){ // if the index is equal to the size of Llist
            int i = 0;
            prevNode = head;
            while(i<pos-1){
                prevNode = prevNode.next;
                i++;
            }
            prevNode.next = null;
            return head;
        }else if(pos > sizeOfList(head)){ // if the index we want to delete does'nt exist
            return head;
        }
        int j = 0;
        while(j<pos){
            prevNode = nextNode;
            nextNode= nextNode.next;
            j++;
        }
        prevNode.next = nextNode.next;
        return head;
	}
	// Main Function //
	public static void main(String[] args) {
		Node<Integer>head = createList();
		printList(head);
		System.out.println("");
		head = deleteNodeAtPosition(head);
		sc.close();
		printList(head);
	}

}
