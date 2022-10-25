package LinkedList;

import java.util.Scanner;
public class evenAfterOdd {
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
    static Scanner sc =new  Scanner(System.in);
public static void main(String[] args){
    LinkedListNode<Integer>head = createList();
		// sc.close();
		head = replaceEvenAfterOdd(head);
		
		printList(head);
}
    public static LinkedListNode<Integer> replaceEvenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null){
            return head;
        }
        LinkedListNode<Integer>Ohead = null,Ehead = null,temp = head;
         LinkedListNode<Integer>Otail= null,Etail = null;
        while(temp != null){
            if(temp.data%2 != 0){
            	if(Otail == null) {
            		Otail = temp;
            		Ohead = temp;
            	}else {
                Otail.next = temp;
                Otail = Otail.next;}
            }
            else{
            	if(Etail == null) {
            		Etail = temp;
            		Ehead = temp;
            	}else {
                Etail.next = temp;
                Etail = Etail.next;}
            }
            temp = temp.next;
        }
        if(Etail!=null) {
            Etail.next = null;}
        if(Otail!=null){
           Otail.next = Ehead;
           return Ohead;
        }
        return Ehead;
	}
}

