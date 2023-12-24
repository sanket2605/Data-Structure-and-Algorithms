package LinkedList;
import java.util.*;

public class DynamicQueue 
{
	Node front,rear;

	void createQueue() 
	{
		front= null;
		rear = null;
	}

	void enqueue(int e) 
	{
		Node n = new Node(e);
		if (rear == null) 
			rear = front = n; 
		else 
		{
			Node t = rear;
			while (t.next != null) 
			{
				t = t.next;
			}
			t.next = n;
		}
		System.out.println(n.data+" ENQUEUED");
	}

	void dequeue() 
	{
		if (front == null) 
			System.out.println("Empty");
		else 
		{
			Node t = front;
			if(front==rear)
			{
				front=rear=null;
			}
			else
			{
			front = front.next;
			System.out.println(t.data + " DEQUEUED");
			}
		}
	}

	void printQueue() 
	{
		if (front== null) 
		{
			System.out.println("List is Empty");
		} 
		else 
		{
			Node t = front;
			while (t != null) 
			{
				System.out.print(" | " + t.data + " | ->");
				t = t.next;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		DynamicQueue q=new DynamicQueue();
		System.out.println("enter size of queue :");
		int size=sc.nextInt();
		q.createQueue();
		int ch;
		
		do 
		{
			System.out.println("1.enqueue\n2.dequeue\n3.print\n0.exit\n");
			ch = sc.nextInt();
			switch (ch) 
			{
			case 1:
					System.out.println("Enter the number:");
					int no = sc.nextInt();
					q.enqueue(no);
					System.out.println("enqueued :" + no);
					break;

			case 2:
					q.dequeue();
				    break;
							
			case 3:
					q.printQueue();
			        break;
			       
			case 0:
				    System.out.println("Exiting!!!");
				    break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		} while(ch!=0);
	}
}
