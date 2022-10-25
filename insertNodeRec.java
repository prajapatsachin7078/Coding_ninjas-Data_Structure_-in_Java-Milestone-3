package LinkedList;
import java.util.Scanner;
public class insertNodeRec {
	static Scanner sc = new Scanner(System.in);
	// Insert Node at x position using recursion : =>
	public static Node<Integer> InsertRec(Node<Integer>head,int value, int pos){
		if(head == null && pos>0) {
			return head;
		}
		if(pos == 0) { // when pos becomes = 0 then it'll create a node and link to the list
			Node<Integer>newNode =new Node<Integer>(value);
			newNode.next = head;
			return newNode;
		}
		head.next = InsertRec(head.next,value,pos-1);
		return head;
	}
	// Main Function =>
	public static void main(String args[]) {
		Node<Integer>head = createList();
		head = InsertRec(head,5,6);
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
