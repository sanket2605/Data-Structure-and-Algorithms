package LinkedList;
import java.util.*;

public class DoublyLL 
{
	DNode root;

	void createList() 
	{
		root = null;// root is never created but assigned as per need
		// the 1st node is called root
	}

	void insertLeft(int e) 
	{
		DNode n = new DNode(e);
		if (root == null)
			root = n;
		else 
		{
			n.right = root;// 1
			root.left = n;// 2
			root = n;// 3
		}
	}

	void insertRight(int e) 
	{
		DNode n = new DNode(e);
		if (root == null)
			root = n;
		else 
		{
			DNode t = root;// 1
			while (t.right != null)// 2
				t = t.right;
			t.right = n;// 3
			n.left = t;// 4
		}
	}

	void deleteLeft() 
	{
		if (root == null)
			System.out.println("Empty List");
		else 
		{
			DNode t = root;// 1
			if (root.right == null)// single node
				root = null;
			else 
			{
				root = root.right;
				root.left = null;// 3}
				System.out.println(t.data + " deleted successfully !");
			}
		}
	}

	void deleteRight() 
	{
		if (root == null)
			System.out.println("Empty List");
		else 
		{
			DNode t = root;// 1
			while (t.right != null)// 2
				t = t.right;
			if (root == t)// only one node
				root = null;// manual reset
			else 
			{
				DNode t2 = t.left;// 3
				t2.right = null;// 4
			}
			System.out.println(t.data + " deleted successfully !");
		}
	}

	void printList() 
	{
		if (root == null)
			System.out.println("Empty List");
		else 
		{
			DNode t = root;
			while (t != null) 
			{
				System.out.print("| " + t.data + " |->");
				t = t.right;
			}
		}
	}

	void printListRev() 
	{
		if (root == null)
			System.out.println("Empty List");
		else 
		{
			DNode t = root;
			while (t.right != null)
				t = t.right;
			while (t != null) 
			{
				System.out.print("| " + t.data + " |->");
				t = t.left;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		DoublyLL d=new DoublyLL();
		d.createList();
		int ch;
		do
		{
	System.out.println("\n1.insertLEFT\n2.insertRIGHT\n3.deleteLEFT\n4.deleteRIGHT\n5.PRINT\n6.printREVERSE\n0.Exit");
			System.out.println("enter your Choice :");
			ch=sc.nextInt();
			switch (ch) 
			{
			case 1: 
				System.out.println("enter number to be inserted LEFT :");
				int no1=sc.nextInt();
				d.insertLeft(no1);
				System.out.println(no1+" inserted Successfully !");
				break;
			case 2:
				System.out.println("enter number to be inserted RIGHT :");
				int no2=sc.nextInt();
				d.insertRight(no2);
				System.out.println("inserted Successfully !");
				break;
			case 3:
				d.deleteLeft();
				break;
			case 4:
				d.deleteRight();
				break;
			case 5:
				d.printList();
				break;
			case 6:
				System.out.println("Printing in Reverse Order");
				d.printListRev();
				break;
			case 0:
				System.out.println("Exiting !");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}while(ch!=0);
	}
}
