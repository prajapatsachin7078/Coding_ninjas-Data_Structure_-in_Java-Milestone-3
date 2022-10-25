package queue.DSA;

public class QueueUseLL {

	public static void main(String[] args) {
		QueueUsingLinkedList<Integer>Q = new QueueUsingLinkedList<>();
		Q.enqueue(5);
		Q.enqueue(4);
		Q.enqueue(3);
		Q.enqueue(2);
		Q.enqueue(1);
		Q.print();
		System.out.println("Deleted  : " +Q.dequeue());
		Q.print();
		System.out.println("Deleted  : " +Q.dequeue());
		System.out.println("Deleted  : " +Q.dequeue());
		System.out.println("Deleted  : " +Q.dequeue());
		System.out.println("Deleted  : " +Q.dequeue());
		System.out.println("Deleted  : " +Q.dequeue());
		Q.enqueue(2);
		Q.enqueue(1);
		Q.print();
		
	
		
	}

}
