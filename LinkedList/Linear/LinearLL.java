package LinkedList;

import java.util.*;

public class LinearLL {
	Node root;

	void createList() {
		root = null; // root is never crated but assigned as per need
	}

	void insertLeft(int e) {
		Node n = new Node(e);
		if (root == null) {
			root = n;
		} else {
			n.next = root;
			root = n;
		}
		System.out.println("INSERTED");
	}

	void insertRight(int e) {
		Node n = new Node(e);
		if (root == null) {
			root = n;
		} else {
			Node t = root;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
		System.out.println("INSERTED");
	}

	void deleteLeft() {
		if (root == null) {
			System.out.println("Empty");
		} else {
			Node t = root;
			root = root.next;
			System.out.println(t.data + " DELETED");
		}
	}

	void deleteRight() {
		if (root == null) {
			System.out.println("Empty");
		} else {
			Node t = root;
			Node t2 = t;
			while (t.next != null) {
				t2 = t;
				t = t.next;
			}
			if (root == t) // if only one node
				root = null; // manual reset
			else
				t2.next = null;
			System.out.println(t.data + " DELETED");
		}
	}

	void printList() {
		if (root == null) {
			System.out.println("List is Empty");
		} else {
			Node t = root;
			while (t != null) {
				System.out.print(" | " + t.data + " | ->");
				t = t.next;
			}
		}
	}

	void search(int key) {
		if (root == null) {
			System.out.println("List is Empty");
		} else {
			Node t = root;
			while (t != null && key != t.data)
				t = t.next;
			if (t == null)
				System.out.println(key + " not found in List");
			else
				System.out.println(key + " found in List");
		}
	}
	
	void deleteKey(int key) 
	{
		if (root == null)   //if empty
			System.out.println("List is Empty");
		else               //not empty
		{
			Node t = root;
			Node t2= root;
			while (t!=null && key!= t.data)
			{
				t2=t;
				t = t.next;
			}
			if (t == null)   //not found
				System.out.println(key + " not found in List");
			else
			{
				System.out.println(key + " found in List");
				if(t==root)//case1:left most
		            root=root.next;
		           else if(t.next==null)//case 2:right most
		             t2.next=null;
		           else//case 3:in between
		             t2.next=t.next;
		           System.out.println(t.data+" deleted");
			}
		}
	}
	
	void insertAT(int index,int e) 
	{
		if(index==0)
        {
            Node n=new Node(e);
            if(root==null)
                root=n;
            else
            {
                n.next=root;
                root=n;
            }
        }
        else
        {
            Node t=root;
            Node t2=root;
            while(t!=null && index>0)
            {
                t2=t;
                t=t.next;
                index--;
            }
            if(t==null)
                System.out.println("index out of range");
            else
            {
                Node n=new Node(e);
                t2.next=n;//1
                n.next=t;//2
                System.out.println("inserted:");
            }                
        }
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LinearLL list = new LinearLL();

		int ch;
		do {
			System.out.println(
					"1.CeateList\n2.Insert_Left\n3.Insert_Right\n4.Delete_Left\n5.Delete_Right\n6.Print\n7.Search\n8.InsertATindex\n9.DeleteKEY\n10.exit");
			System.out.println("Enter choice : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				list.createList();
				System.out.println("List created.");
				break;
			case 2:
				System.out.print("Enter element to insert left: ");
				int e = sc.nextInt();
				list.insertLeft(e);
				break;
			case 3:
				System.out.print("Enter element to insert right: ");
				int k = sc.nextInt();
				list.insertRight(k);
				break;
			case 4:
				list.deleteLeft();
				break;
			case 5:
				list.deleteRight();
				break;
			case 6:
				list.printList();
				break;
			case 7:
				System.out.print("Enter element to search: ");
				int searchKey = sc.nextInt();
				list.search(searchKey);
				break;
			case 8:
				System.out.print("Enter Index: ");
				int index = sc.nextInt();
				System.out.print("Enter Value: ");
				int value = sc.nextInt();
				list.insertAT(index,value);
				break;
			case 9:
				System.out.print("Enter Key to be deleted: ");
				int key = sc.nextInt();
				list.deleteKey(key);
				break;
			case 10:
				System.out.println("Exiting program. Bye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		} while (ch != 0);
	}
}
