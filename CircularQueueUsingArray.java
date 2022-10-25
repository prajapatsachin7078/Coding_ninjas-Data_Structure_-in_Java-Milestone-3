package queue.DSA;

public class CircularQueueUsingArray {
	private int front; // index of the front element
	private int rear; // index of the rear element
	private int data[];
	int size;
	CircularQueueUsingArray(int size){
		front = 0;
		rear = 0;
		data = new int[size];
		size = 0;
	}
	int dequeue() throws enqueueIsEmptyException {
		if(front == rear)throw new enqueueIsEmptyException();
		data[front] = 0;
		front = (front+1)%data.length;
		int x = data[front];
		size--;
		return x;
	}
	void enqueue(int value) throws enqueuFullException {
		if((rear+1)%data.length == front) {
			throw new enqueuFullException();
		}
		size++;
		rear = (rear+1)%data.length;
		data[rear] = value;
	}
	
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size == 0;
	}
	void printQueue() throws enqueueIsEmptyException {
		if(isEmpty())throw new enqueueIsEmptyException();
		int i = front+1;
		while(data[i] != 0) {
			System.out.print(data[i] + " ");
			i = (i+1)%data.length;
		}
		System.out.println();
	}
	public int front() {
		// TODO Auto-generated method stub
		return data[(front+1)%data.length];
	}
}
