package Day02_Queue;
import java.util.*;

public class QueueImpl 
{
	int stack[], tos, MaxSize;

	void createQueue(int size) 
	{
		stack = new int[size];
		MaxSize = size;
		tos = -1;
	}

	void enqueue(int e) 
	{
		tos++;
		stack[tos] = e;
		/*
		 * OR stack[++tos]=e;
		 */
	}
	
	int dequeue() 
	{
		int n = stack[tos];
		tos--;
		return (n);
	}

	boolean is_full() 
	{
		if (tos == MaxSize - 1)
			return true;
		else
			return false;
	}

	boolean is_empty() 
	{
		if (tos == -1)
			return true;
		else
			return false;
	}

	int peek() 
	{
		return (stack[tos]);
	}

	void print_queue() 
	{
		for (int i = tos; i > -1; i--)
			System.out.print(stack[i]);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter queue size : ");
		int size=sc.nextInt();
		
		QueueImpl q1=new QueueImpl();
		q1.createQueue(size);
	
		QueueImpl q2=new QueueImpl();
		q2.createQueue(size);
		int ch;
		do 
		{
			System.out.println("1.Enqueue \n 2.Dequeue \n 3.peek \n 4.print \n 0.exit \n");
			ch = sc.nextInt();
			switch (ch) 
			{
			case 1:
				if (!q1.is_full()) 
				{
					System.out.println("Enter the number:");
					int no = sc.nextInt();
					q1.enqueue(no);
					System.out.println("ENQUEUED :" );
				} 
				else
					System.out.println("Stack is Full");
							break;

			case 2:
				while(!q1.is_empty()) 
				{
					int de=q1.dequeue();
					q2.enqueue(de);
				} 
				System.out.println("DEQUEUED :" + q2.dequeue());				
							break;

			/*case 3:
				if (!obj.is_empty()) 
				{
					int no = obj.peek();
					System.out.println("TopMost Element :" + no);
				} 
				else
					System.out.println("Stack is Empty");
							break;*/

			case 4:
				if (!q1.is_empty()) 
				{
					q1.print_queue();
				} 
				else
					System.out.println("Stack is Empty");
							break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		} while (ch!=0);
	}
}
