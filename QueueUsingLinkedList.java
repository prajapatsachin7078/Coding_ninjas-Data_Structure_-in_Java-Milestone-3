package queue.DSA;
import LinkedList.LinkedListNode;
public class QueueUsingLinkedList<T> {
	private LinkedListNode<T> front;
	private LinkedListNode<T> rear;
	private int size;
	QueueUsingLinkedList(){
		front = null;
		rear = null;
		size = 0;
	}
	void enqueue(T value) {
		LinkedListNode<T> newNode = new LinkedListNode<T>(value);
		if(rear ==null || front == null) {
			front = newNode;rear = newNode;
			size++;
		}else {
			rear.next = newNode;
			rear = newNode;
			size++;
		}
		
		
	}
	T dequeue() {
		if(isEmpty()) {
			System.out.println("Empty! No more element left.");
		    return null;}
		T x = front.data;
		front = front.next;
		size--;
		return x;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
	public int size() {
		return size;
	}
	public void print() {
		LinkedListNode<T> temp = front;
		if(temp == null)System.out.println("Empty!");
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
