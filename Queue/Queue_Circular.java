package Day02_Queue;

import java.util.Scanner;

public class Queue_Circular 
{
	int front,rear,MaxSize,count,queue[];
	
	void createQueue(int size)
	{
		MaxSize=size;
		queue=new int[size];
		front=0;
		rear=-1;
		count=0;
	}
	
	void enqueue(int e)
	{
		rear=(rear+1)%MaxSize;
		count++;
		queue[rear]=e;
		
	}
	
	int dequeue()
	{
		int temp=queue[front];
		front=(front+1)%MaxSize;
		count--;
		return(temp);	
	}
	
	boolean is_full()
	{
		
		if(count==MaxSize)
		{
			return true;
		}
		else
			return false;
	}
	
	boolean is_empty()
	{
		if(count==0)
		{
			return true;
		}
		else
			return false;
	}
	
	void print_queue()
	{
		int i=front;
		int c=0;
		while(c<count)
		{
		System.out.print(queue[i]+"--");
		i=(i+1)%MaxSize;
		c++;
		}
	}
	
	/*public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Queue_Circular q=new Queue_Circular();
		System.out.println("enter size of queue :");
		int size=sc.nextInt();
		q.createQueue(size);
		int ch;
		
		do 
		{
			System.out.println("1.enqueue\n2.dequeu\n3.print\n0.exit\n");
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
					q.print_queue();
					System.out.println();
				} 
				else
					System.out.println("Q is Empty");
							break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		} while(ch!=0);
	}*/
}
