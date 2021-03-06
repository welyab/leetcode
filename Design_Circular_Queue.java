// https://leetcode.com/problems/design-circular-queue/
class MyCircularQueue {

	private int values[];
	private int size;
	private int rear;
	private int front;

	/**
	 * Initialize your data structure here. Set the size of the queue to be k.
	 */
	public MyCircularQueue(int k) {
		values = new int[k];
		size = 0;
		rear = -1;
		front = 0;
	}

	/**
	 * Insert an element into the circular queue. Return true if the operation
	 * is successful.
	 */
	public boolean enQueue(int value) {
		if (isFull()) {
			return false;
		}
		rear = (rear + 1) % values.length;
		values[rear] = value;
		size++;
		return true;
	}

	/**
	 * Delete an element from the circular queue. Return true if the operation
	 * is successful.
	 */
	public boolean deQueue() {
		if (isEmpty()) {
			return false;
		}
		front = (front + 1) % values.length;
		size--;
		return true;
	}

	/** Get the front item from the queue. */
	public int Front() {
		if (isEmpty()) {
			return -1;
		}
		return values[front];
	}

	/** Get the last item from the queue. */
	public int Rear() {
		if (isEmpty()) {
			return -1;
		}
		return values[rear];
	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		return size == 0;
	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		return size == values.length;
	}
}

public class Design_Circular_Queue {
}
