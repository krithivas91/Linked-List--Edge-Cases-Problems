package LinkedList;

public class LinkedList {

		//Linked List structure
		Node head;
		Node tail;
		int size=0;
		

		public int getSize() {   //returns size
			return size;
		}
 
		public void setSize(int size) {
			this.size = size;
		}
		
		public void insertAthead(int value)  //Inserts elements at the head
		{
			size++;
			if (head==null)
			{
				Node nextPtr = new Node();
				nextPtr.setData(value);
				head = nextPtr;
				tail=nextPtr;
			}
			
			else{
				Node newNode = new Node();
				newNode.setData(value);
				newNode.setNext(head);
				head=newNode;
				
			}
			
		}
		
		public void printLinkedList()				//prints LinkedList
		{
			if(head==null)
				System.out.println("Linked list is empty.. Please insert elements before printing");
			Node temp = head;
			while (temp!=null)
			{
				System.out.printf(temp.getData()+"-->");
				
				temp=temp.getNext();
			}
			
		}

		public void insertAtPos(int pos, int v) {   //inserts element at the specified position.
			
			
			
			size++;
			if(pos!=1)
			{
			Node temp = head;	
			for(int i=1;i<pos-1;i++)
			temp=temp.getNext();
			
			Node newNode = new Node();
			newNode.setData(v);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			}
			else
			{
				Node NewNode = new Node();
				NewNode.setData(v);
				NewNode.setNext(head);
				head=NewNode;
				tail=NewNode;
			}
			
			
		}

		public void removeElement(int remvpos) {    //removes the element at the specified position
			
			if(remvpos!=1)
			{
			Node temp = head;
			for(int i=1;i<remvpos-1;i++)
				temp=temp.getNext();
			
			Node remove = temp.getNext();
			temp.setNext(temp.getNext().getNext());
			remove.setNext(null);
			}
			else
			{
				Node newHead = head.getNext(); 
				Node oldHead= head;
				oldHead.setNext(null);
				head=newHead;
				
			}
			size--;
			
		}

		public void insertAtTail(int tail2) {			//inserts element at the end of linked list
			
			size++;
			if(tail==null)
			{
				Node nxtPtr = new Node();
				nxtPtr.setData(tail2);
				head=nxtPtr;
				tail=nxtPtr;
			}
			
			else
			{
				Node newNode= new Node();
				newNode.setData(tail2);
				tail.setNext(newNode);
				tail=newNode;
			}
			
			
		}

		public  void removeHead() {				//removes the head of the linked list
			
			Node oldHead = head;
			Node newHead= head;
			newHead = newHead.getNext();
			
			head=newHead;
			oldHead.setNext(null);
			size--;
			
			
		}

		public void removeTail() {				//removes the tail element of the linkedlist
			Node temp = head;		
			
			for(int i=1;i<size-1;i++)
				temp=temp.getNext();
			
			
			temp.setNext(null);
			tail=temp;
			size--;
		}

		public void updateElement(int updatePos,int newEle) {  //updates the element at the specified postion

			Node temp = head;
			
			if(updatePos!=1)
			{
			for(int i=0;i<updatePos-1;i++)
				temp=temp.getNext();

			 temp.setData(newEle);
			}
			
			else
			{
				temp.setData(newEle);
			}
			
		}

		public void printFirst() {  		//prints first element 
			if(head==null)  
				System.out.println("Linked list is empty.. Please insert elements before printing");
			else
				System.out.println(head.getData());
			
		}

		public void printLast() {		//prints last element
				
			if(tail==null)
				System.out.println("Linked list is empty.. Please insert elements before printing");
			
			else
			System.out.println(tail.getData());
		}

		}
