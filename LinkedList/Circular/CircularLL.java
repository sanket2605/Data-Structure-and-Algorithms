package LinkedList;
import java.util.*;

public class CircularLL 
{
	Node root,last;

	void createList() 
	{
		root =last= null; // root is never crated but assigned as per need
	}

	void insertLeft(int e) 
	{
		Node n = new Node(e);
		if (root == null) 
		{
			root=last = n;
			last.next=root;
		} 
		else 
		{
			n.next = root;
			root = n;
			last.next=root;
		}
		System.out.println("INSERTED");
	}
	
	void insertRight(int e) 
	{
		Node n = new Node(e);
		if (root == null) 
		{
			root=last=n;
			last.next=root;
		} 
		else 
		{
			last.next=n;
			last=n;
			last.next=root;
		}
		System.out.println("INSERTED");
	}
	
	void deleteLeft() 
	{
		if (root == null) 
		{
			System.out.println("Empty");
		} 
		else 
		{
			Node t = root;
			if(root==last)
			{
				root=last=null;
			}
			else
			{
				root = root.next;
				last.next=root;
			}
			System.out.println(t.data + " DELETED");
		}
	}

	void deleteRight() 
	{
		if (root == null) 
		{
			System.out.println("Empty");
		} 
		else 
		{
			Node t = root;
			Node t2 = t;
			while (t != last) 
			{
				t2 = t;
				t = t.next;
			}
			if (root == last)     // if only one node
				root=last=null;  // manual reset
			else
			{
				last=t2;;
				last.next=root;
			}
				System.out.println(t.data + " DELETED");
		}
	}
	
	void printList() 
	{
		if (root == null) 
		{
			System.out.println("List is Empty");
		} 
		else 
		{
			Node t = root;
			do
			{
				System.out.print("| " + t.data + " |->");
				t = t.next;
			}while (t != root);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		CircularLL list = new CircularLL();

		int ch;
		do {
			System.out.println(
					"1.Insert_Left\n2.Insert_Right\n3.Delete_Left\n4.Delete_Right\n5.Print\n0.exit");
			System.out.println("Enter choice : ");
			ch = sc.nextInt();
			switch (ch) 
			{
			case 1:
				System.out.print("Enter element to insert left: ");
				int e = sc.nextInt();
				list.insertLeft(e);
				break;
			case 2:
				System.out.print("Enter element to insert right: ");
				int k = sc.nextInt();
				list.insertRight(k);
			case 3:
				list.deleteLeft();
				break;
			case 4:
				list.deleteRight();
				break;
			case 5:
				list.printList();
				break;			
			case 0:
				System.out.println("Exiting program. Bye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		} while (ch != 0);
	}
}

