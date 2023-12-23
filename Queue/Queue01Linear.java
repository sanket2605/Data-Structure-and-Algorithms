package Day02_Queue;
import java.util.*;

class Queue01 
{
	int front,rear,MaxSize,queue[];
	
	void createQueue(int size)
	{
		MaxSize=size;
		queue=new int[size];
		front=0;
		rear=-1;
	}
	
	void enqueue(int e)
	{
		rear++;
		queue[rear]=e;
	}
	
	boolean is_full()
	{
		if(rear==MaxSize-1)
		{
			return true;
		}
		else
			return false;
	}
	
	int dequeue()
	{
		int temp=queue[front];
		front++;
		return temp;
	}
	
	boolean is_empty()
	{
		if(front>rear)
		{
			return true;
		}
		else
			return false;
	}
	
	void print_queue()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.print(queue[i]);
		}
	}
	
	/*public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Queue01 q=new Queue01();
		System.out.println("enter size of queue :");
		int size=sc.nextInt();
		q.createQueue(size);
		int ch;
		
		do 
		{
			System.out.println("1.enqueue\n2.dequeue\n3.print\n0.exit\n");
			ch = sc.nextInt();
			switch (ch) 
			{
			case 1:
				if (!q.is_full()) 
				{
					System.out.println("Enter the number:");
					int no = sc.nextInt();
					q.enqueue(no);
					System.out.println("entered :" + no);
				} 
				else
					System.out.println("Queue is Full");
							break;

			case 2:
				if (!q.is_empty()) 
				{
					System.out.println("dequeue :" + q.dequeue());
				} 
				else
					System.out.println("Stack is Empty");
							break;
							
			case 3:
				if (!q.is_empty()) 
				{
					q.print_queue();				} 
				else
					System.out.println("Q is Empty");
							break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		} while(ch!=0);
	}*/
}
