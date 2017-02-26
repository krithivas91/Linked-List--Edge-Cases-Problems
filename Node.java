package LinkedList;

public class Node {
		
	// Node structure 
	private int data;
	private Node next;
	
	public Node() {
		data = 0;
		next=null;
	}
	
	public Node(int a , Node n)
	{
		data=a;
		next=n;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
