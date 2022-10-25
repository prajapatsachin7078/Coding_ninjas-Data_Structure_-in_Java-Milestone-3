package queue.DSA;

public class QueueUsingStackUse {

	public static void main(String[] args) {
		QueueUsingTwoStack q = new QueueUsingTwoStack();
		q.enqueue(2);
		q.enqueue(23);
		System.out.println( q.front());
		q.enqueue(34);
		q.enqueue(34);
		q.enqueue(34);
		System.out.println( q.dequeue());
		q.print();
	}

}
