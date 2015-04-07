package edu.mum.mscs.fpp.homework.w3d1;
/**
 * 
 * 3.	Implement the singly linked list with the following method.
 * 
 * Output:
 * 
 * LinkedList [header=null, index=0]
Insert ->Value 1
Insert ->Value 2
Insert ->Value 3

-------Index -> 4--------
Value 3
Value 2
Value 1
Value 0
-----------list.get(2)------>
Value 1

Deleted -> Value 3
-------After deletionOperation --------

-------Index -> 3--------
Value 2
Value 1
Value 0
-----After new node insertion - last Operation -----

-------Index -> 4--------
Value 2
Value 1
Value 4
Value 0
-------After first delete Operation ------------

-------Index -> 3--------
Value 1
Value 4
Value 0
-------After Last delete Operation ------------

-------Index -> 2--------
Value 1
Value 4
-------After delete node 4 Operation ------------

-------Index -> 1--------
Value 1

 * @author janardhanbonu
 *
 */
class Node {
	Object value;
	Node next = null;

	public Node() {
		super();
		this.value = "header";
	}
	
	public Node(String value) {
		super();
		this.value = value;
	}

	public void displayNode() {
		System.out.printf("Value : %s -->", value);
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}

/**
 * Operations in the linked list are: Basic operations Insert Delete
 * 
 * @author 984417
 *
 */
class LinkedList {

	Node pointer ;
	int index;

	LinkedList() {
		index = 0;
		pointer = null;
	}

	/* Insert on the top of the list */
	public void insert(Object data) {
		Node newNode = new Node();
		newNode.setValue(data);
		if(pointer == null){
			pointer = newNode;
		}else{
			newNode.next = pointer; // assign the pointer to new node
			pointer = newNode; // move pointer to latest one
			System.out.println("Insert ->" + pointer.value);
		}
		index++;
	}

	
	public void insertAtPosition(Object data, int position){
		Node newNode = new Node();
		newNode.setValue(data);
		if(position < index){
			int i = 0;
			Node positionNode = new Node("Value ");
			while (i != position){
				positionNode = pointer.next;
				i++;
			}
			newNode.next = positionNode.next;
			positionNode.next = newNode;
			index++;
		}else {
			System.out.println("Given position is our of Array Index");
		}
	}
	
	@Override
	public String toString() {
		return "LinkedList [header=" + pointer + ", index=" + index + "]";
	}

	public void displayList() {
		System.out.printf("\n-------Index -> %d--------\n",index);
		Node temp = pointer;
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.next;
		}
	}

	/**
	 * Delete from top of the list 
	 */
	public Node delete() {
		/*
		 * Get the lastest one on the list and the header is pointed to the
		 * latest on always. The pointer action is performed at the time of
		 * insertion.
		 * 
		 * 1. Get the latest one from the list
		 */
		Node temp = pointer;
		pointer = temp.next;
		index--;
		System.out.println("Deleted -> " + temp.value);
		return temp;
	}
	
	private Node iterateLast(Node pointer) {
		Node temp = pointer;
		if(temp.next == null){
			return temp;
		}else{
			return iterateLast(temp.next); // recursion
		}
	}
	
	/**
	 * Delete operation:
	 * 
	 * Delete first Node
	 * Delete last Node
	 * Delete intermediate Node
	 * 
	 */
	public boolean deleteNode(Node dNode){
		if(pointer.value.equals(dNode.value)) {
			return deleteFirst();
		} else if(iterateLast(pointer).equals(dNode.value)){
			return deleteLast();
		} else {
			return delete(dNode);
		}
	}
	
	public boolean deleteFirst(){
		if(pointer == null){
			return false;
		}else{
			Node temp  = pointer;
			pointer = temp.next;
			temp.next = null;
			index--;
			return true;
		}
	}
	
	public boolean deleteLast(){
		if(pointer == null){
			return false;
		}else{
			Node p = pointer, q = null, next = pointer.next;
			while(p.next != null) { 
				q = p; 
				p = p.next;
			}
			q.next = null;
			index--;
			return true;
		}
	}
	
	public boolean delete(Object data){
		Node delNode = new Node();
		delNode.value = data;
		if(pointer == null){
			return false;
		}else{
			Node p = pointer;
			Node q = null;
			while(!p.next.value.equals(delNode.value)){
				p = p.next;
			}
			q = p.next;
			p.next = q.next;
			q = null;
			index--;
			return true;
		}
	}
	
	public int getSize(){
		return index;
	}
	
	public Object get(int idx){
		Node node = pointer;
		Node temp = null;
		if(idx == 0){
			return pointer.value;
		}else if(idx == index){
			return iterateLast(pointer).value;
		}else {
			for(int i=0;i<=idx;i++){
				temp=node;
				node = node.next;
			}
			return temp.value;
		}
	}
}

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		System.out.println(list.toString());

		String newNode = new String("Value 0");
		String newNode1 = new String("Value 1");
		String newNode2 = new String("Value 2");
		String newNode3 = new String("Value 3");
		String newNode4 = new String("Value 4");

		list.insert(newNode);
		list.insert(newNode1);
		list.insert(newNode2);
		list.insert(newNode3);
		list.displayList();
		
		System.out.println("-----------list.get(2)------>\n"+list.get(2).toString()+"\n");
		
		list.delete();
		System.out.println("-------After deletionOperation --------");
		list.displayList();
		
		list.insertAtPosition(newNode4, 2);
		System.out.println("-----After new node insertion - last Operation -----");
		list.displayList();
		
		list.deleteFirst();
		System.out.println("-------After first delete Operation ------------");
		list.displayList();
		
		list.deleteLast();
		System.out.println("-------After Last delete Operation ------------");
		list.displayList();
		
		list.delete(newNode4);
		System.out.println("-------After delete node 4 Operation ------------");
		list.displayList();
		
	}
	
}
