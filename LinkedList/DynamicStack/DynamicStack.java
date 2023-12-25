package LinkedList;
import java.util.*;

public class DynamicStack 
{
	Node tos;

	void createStack() 
	{
		tos = null; // tos is never crated but assigned as per need
	}

	void push(int e) 
	{
		Node n = new Node(e);
		if (tos == null) 
		{
			tos = n;
		} 
		else 
		{
			n.next = tos;
			tos = n;
		}
		System.out.println("INSERTED");
	}

	void pop() 
	{
		if (tos == null) 
		{
			System.out.println("Empty");
		} 
		else 
		{
			Node t = tos;
			tos = tos.next;
			System.out.println(t.data + " DELETED");
		}
	}

	void peek()
	{
		if(tos==null)
		{
			System.out.println("EMPTY stack");
		}
		else
		{
			System.out.println( "@TOS "+tos.data);
		}
	}
	
	void printStack() 
	{
		Node t = tos;
		while (t != null) 
		{
			System.out.print("| " + t.data + " |->");
			t = t.next;
		}	
	}

	/*public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		DynamicStack obj=new DynamicStack();
		obj.createStack();
		int ch;
		do 
		{
			System.out.println("1.push\n2.pop\n3.peek\n4.print\n0.exit\n");
			ch = sc.nextInt();
			switch (ch) 
			{
			case 1:
					System.out.println("Enter the number :");
					int no = sc.nextInt();
					obj.push(no);
					System.out.println("Pushed :" + no); 
				    break;

			case 2:
					obj.pop();
				    break;

			case 3:
				    obj.peek();
				    break;
			case 4:				
					obj.printStack();
		            break;
		            
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		} while (ch!=0);
	}*/
}
