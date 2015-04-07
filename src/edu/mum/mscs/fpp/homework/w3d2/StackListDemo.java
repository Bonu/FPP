package edu.mum.mscs.fpp.homework.w3d2;

/**
 * 1.	Implement Stack data structure using LinkedList to perform the following operations.
 *  ( Should be user defined)
	a.	Push()
	b.	Pop()
	c.	Peek()
	d.	Size()
	e.	IsEmpty()
	f.	DisplayAll() – All elements in the Stack

Output:
	Queue Empty ? -->true
	------After push------
	-->Obj 3-->Obj 2-->Obj 1
	
	
	------After pop------
	-->Obj 2-->Obj 1
	
	------After peek------
	Obj 2
	Size ->2
	Queue Empty ? -->false

 * @author janardhanbonu
 *
 */
public class StackListDemo {

	public StackListDemo() {
		
	}
	
	public static void main(String args[]){
		Stack stk = new StackList();
		System.out.println("Queue Empty ? -->"+stk.isEmpty());
		stk.push("Obj 1");
		stk.push("Obj 2");
		stk.push("Obj 3");
		System.out.println("------After push------");
		stk.displayAll();
		stk.pop();
		System.out.println("------After pop------");
		stk.displayAll();
		System.out.println("------After peek------");
		System.out.println(stk.peek());
		System.out.println("Size ->"+stk.getSize());
		System.out.println("Queue Empty ? -->"+stk.isEmpty());
	}

}

interface Stack{
	
	public Object push(Object obj); // insert element into top of the stack
	public Object pop(); // delete last from the stack and return removed obj or null if stack is empty
	public Object peek(); // return the top object from the stack
	public boolean isEmpty(); // check if stack is empty
	public void displayAll(); // display all elements in the stack
	public int getSize();
}

class Node {
	Object obj;
	Node next;
	
	public Node(Object obj) {
		super();
		this.obj = obj;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}

class StackList implements Stack{

	Object t;
	Node top;
	int size;
	
	public StackList(){
		top=null;
		size = 0;
	}
	
	@Override
	public Object push(Object t) {
		Node newNode;
		if(top == null){
			top = new Node(t);
		} else {
			newNode = new Node(t);
			newNode.next = top;
			top = newNode;
		}
		size++;
		return t;
	}
	

	@Override
	public Object pop() {
		Node temp;
		if(top == null){
			return null;
		}else{
			temp = top.next;
			top = temp;
			size--;
		}
		return null;
	}

	@Override
	public Object peek() {
		Node temp;
		if(top == null){
			return null;
		}else{
			return top.obj;
		}
	}

	@Override
	public boolean isEmpty() {
		return top==null;
	}
	
	@Override
	public void displayAll() {
		iterate(top);
	}
	
	public void iterate(Node node){
		if(node == null)
			return;
		else{
			System.out.printf("-->%s",node.obj.toString());
			iterate(node.next);
		}
		System.out.println("");
				
	}

	@Override
	public int getSize() {
		return size;
	}
	
}
