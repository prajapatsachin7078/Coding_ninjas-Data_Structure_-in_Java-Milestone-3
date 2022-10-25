package queue.DSA;

public class queueUse {

	public static void main(String[] args) {
		queueUsingArray q  = new queueUsingArray(5);
		q.Enqueue(5);
		q.Enqueue(2);
		q.Enqueue(3);
		q.printQueue();
		System.out.println("Size " +q.size());
		System.out.println("Front " + q.front());
		System.out.println("isEmpty : " +q.isEmpty());
		System.out.println("Deleted : " + q.Dequeue());
		q.printQueue();
		System.out.println("Size " +q.size());
		System.out.println("Front " + q.front());
		System.out.println("isEmpty : " +q.isEmpty());
		System.out.println("Deleted : " + q.Dequeue());
		System.out.println("Deleted : " + q.Dequeue());
		System.out.println("Deleted : " + q.Dequeue());
		q.Enqueue(5);
		q.printQueue();
		System.out.println("Size " +q.size());
	}

}
