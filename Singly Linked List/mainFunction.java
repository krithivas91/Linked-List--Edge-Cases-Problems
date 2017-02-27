package LinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainFunction {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList linkedlist= new LinkedList();
		try
		{
		while(true)
		{
			
			System.out.println("   ");
			System.out.println(" ");
		System.out.println("~~~~~~~~~~~~~~Enter option~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1.Insert at head");
		System.out.println("2.Insert at tail");		
		System.out.println("3.Insert at position");
		System.out.println("4. Remove head element");
		System.out.println("5. Remove last element");		
		System.out.println("6.Remove at Position");
		System.out.println("7.Update at position");
		System.out.println("8.Print First Element");
		System.out.println("9.Print last Element");
		System.out.println("10.Print LinkedList");
		System.out.println("11.Print size");
		System.out.println("12.Exit	");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int option =sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("~~~Insert at head~~~");
			System.out.println("Please enter the number to be inserted into the linked list:");
			int val=sc.nextInt();
			linkedlist.insertAthead(val);
			System.out.println("~~list after insertion~~");
			linkedlist.printLinkedList();
			break;
			
		case 2:
			System.out.println("~~~Insert at tail~~~");
			System.out.println("Please enter the number to be inserted into the linked list:");
			int tail=sc.nextInt();
			linkedlist.insertAtTail(tail);
			System.out.println("~~list after insertion~~");
			linkedlist.printLinkedList();
			break;
		
		case 3:
			try
			{
			System.out.println("~~~Insert at position~~~");
			System.out.println("Enter the position you want to insert:");
			int pos=sc.nextInt();
			System.out.println("Enter the value you want to insert");
			int v=sc.nextInt();
			linkedlist.insertAtPos(pos,v);
			System.out.println("~~list after insertion~~");
			linkedlist.printLinkedList();
			break;
			}
			catch(NullPointerException n)
			{
				System.out.println("Invalid Position");
				break;
			}
		
		case 4:
			System.out.println("Removing Head Element...");
			linkedlist.removeHead();
			System.out.println("done.");
			System.out.println("List after Removal:");
			linkedlist.printLinkedList();
			break;
			
		case 5:
			System.out.println("Removing Last Element...");
			linkedlist.removeTail();
			System.out.println("done.");
			System.out.println("List after Removal:");
			linkedlist.printLinkedList();
			break;
			
		case 6:
			System.out.println("Enter the element position you want removed");
			int remvpos= sc.nextInt();
			linkedlist.removeElement(remvpos);
			System.out.println("Element removed at postion: "+remvpos);
			System.out.println("List after Removal:");
			linkedlist.printLinkedList();
			break;
		case 7:
			System.out.println("Enter the element position you want update");
			int updatePos= sc.nextInt();
			System.out.println("Please enter New Element:");
			int newEle=sc.nextInt();
			linkedlist.updateElement(updatePos,newEle);
			System.out.println("Element updated at postion "+updatePos);
			System.out.println("List after Update:");
			linkedlist.printLinkedList();
			break;
		
		case 8:
			System.out.println("~~First Element of the Linked List~~");
			linkedlist.printFirst();
			break;
		case 9:
			System.out.println("~~Last element of the Linked List");
			linkedlist.printLast();
			break;
		case 10:
			System.out.println("~~linked list~~");
			linkedlist.printLinkedList();
			break;
			
		case 11:
			System.out.println("~~Size of the Linked List~~");
			System.out.println(linkedlist.getSize());
			break;
		case 12:
			System.out.println("      ");
			System.out.println("~~~~~~~~~~~~BYE~~~~~~~~~~~~~~~");
			System.exit(0);
			break;
			
		
		}
			
		}
		}
		catch (NullPointerException n) {

			System.out.println("Position provided is invalid. Size of the linked list is "+linkedlist.getSize());
		}
		
		catch (InputMismatchException e) {
				System.out.println("Words are not acceptable please enter numbers");
		}
		
		}
	}


