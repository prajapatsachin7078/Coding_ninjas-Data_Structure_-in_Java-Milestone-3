package queue.DSA;

public class CircularQueueUse {

	public static void main(String[] args) throws enqueuFullException, enqueueIsEmptyException {
		CircularQueueUsingArray cq = new CircularQueueUsingArray(6);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);
		cq.enqueue(6);
		cq.enqueue(20);
		System.out.println("size : " +cq.size());
		cq.printQueue();
		System.out.println("Deleted : " +cq.dequeue());
		System.out.println("front : " +cq.front());
		System.out.println("size : " +cq.size());
		System.out.println("Deleted : " +cq.dequeue());
		System.out.println("front : " +cq.front());
		System.out.println("size : " +cq.size());
		System.out.println("Deleted : " +cq.dequeue());
		System.out.println("front : " +cq.front());
		System.out.println("size : " +cq.size());
		System.out.println("Deleted : " +cq.dequeue());
		System.out.println("front : " +cq.front());
		System.out.println("size : " +cq.size());
		System.out.println("Deleted : " +cq.dequeue());
		System.out.println("front : " +cq.front());
		System.out.println("size : " +cq.size());
		System.out.println("Deleted : " +cq.dequeue());
		System.out.println("front : " +cq.front());
		System.out.println("size : " +cq.size());

	}

}
