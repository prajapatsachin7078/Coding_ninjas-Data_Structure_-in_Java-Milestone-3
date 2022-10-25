package queue.DSA;

public class queueUsingArray{
	private int front; // index of the front element
	private int rear; // index of the rear element
	private int data[];
	int size;
	queueUsingArray(int size){
		front = -1;
		rear = -1;
		data = new int[size];
		size = 0;
	}
	// It'll add element to the front of the Queue
	public void Enqueue(int value) {
		if(rear==data.length) {
			System.out.println("Queue is full!");
			return;
		}
		if(front == -1)front++;
		data[++rear] = value;
		size++;
	}
	public int Dequeue(){
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		int x=data[front];
		front++;
		size--;
		return x;
	}
	public int size() { // it'll return the size of the Queue
		
		return size;
	}
	public boolean isEmpty() { // checks whether the queue is empty or not 
		
		return size==0;
	}
	public int front() { // returns front element of the Queue
		return data[front];
	}
	public void printQueue() {
		int i = front;
		while(i<=rear) {
			System.out.print(data[i] + " ");
			i++;
		}
		System.out.println();
		
	}
}
