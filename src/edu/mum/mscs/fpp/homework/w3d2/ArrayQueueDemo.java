/**
 */
package edu.mum.mscs.fpp.homework.w3d2;

/**
 * 2.	Implement Queue data structure using Array to perform the following operations. ( Should be user defined)
	a.	Insert()
	b.	Remove()
	c.	IsEmpty()
	d.	Size()
	e.	Peek()
	f.	DisplayAll() – All items in the Queue
	
 * output:
 * 
 * ------Is empty-----true
	------Insert Operation-------
	[Value 1, Value 2, Value 3, Value 4]
	------Remove Operation-------
	[Value 2, Value 3, Value 4]
	------Peek Operation-------Value 2
	------Size-------3
	------Is empty-----false

 * @author janardhanbonu
 *
 */
public class ArrayQueueDemo {

	public static void main(String[] args) {
		
		ArrayQueue aq = new ArrayQueue();
		System.out.println("------Is empty-----"+aq.isEmpty());
		aq.insert("Value 1");
		aq.insert("Value 2");
		aq.insert("Value 3");
		aq.insert("Value 4");
		System.out.println("------Insert Operation-------");
		aq.displayAll();
		
		aq.remove();
		System.out.println("------Remove Operation-------");
		aq.displayAll();
		
		aq.peek();
		System.out.println("------Peek Operation-------"+aq.peek());
		
		System.out.println("------Size-------"+aq.size());
		
		System.out.println("------Is empty-----"+aq.isEmpty());
		
	}

}


class ArrayQueue implements Queue {
	
	public Object[] queue = null;
	public int size=0, front=0, rear=0;
	public static final int CAPACITY=10;
	
	public ArrayQueue(){
		queue = new Object[CAPACITY];
		
	}
	
	@Override
	public void insert(Object obj) {
		
		if (size == CAPACITY)
			throw new IllegalStateException ("Queue is full: Overflow");
		else {
			size++;
			queue[rear] = obj;
			rear = (rear+1) % CAPACITY;
		}
		
	}

	@Override
	public Object remove() {
		if (size == 0)
			throw new IllegalStateException ("Queue is empty: Underflow");
		else {
			size--;
			Object obj = queue [ (front % CAPACITY) ];
			queue [front] = Integer.MIN_VALUE;
			front = (front+1) % CAPACITY;
			return obj;
		}
	}

	@Override
	public boolean isEmpty() {
		return (size == 0); 
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Object peek() {
		return queue[front];
	}

	@Override
	public  void displayAll() {
		System.out.println(toString());
	}
	
	public String toString(){
		String result = "[";
		for (int i = 0; i < size; i++){
			result += (queue[ (front + i) % CAPACITY ]).toString();
			if (i < size -1) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
	
}

interface Queue{
	
	public void insert(Object obj);
	public Object remove();
	public boolean isEmpty();
	public int size();
	public Object peek();
	public void displayAll();
	
}
