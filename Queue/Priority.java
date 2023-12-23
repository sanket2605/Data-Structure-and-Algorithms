package Day02_Queue;
import java.util.*;

public class Priority 
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
		rear++;
		queue[rear]=e;
		//sort data in order as per need
		for(int i=front;i<rear;i++)      //passes : bubble sort
		{
			for(int j=front;j<rear;j++)  //sort 
			{
				if(queue[j]>queue[i])
				{
					int temp=queue[j];
					queue[j]=queue[j+1];
					queue[j+1]=temp;
				}
			}
		}
	}
	
	int dequeue()
	{
		int temp=queue[front];
		front++;
		return temp;
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
		Priority q=new Priority();
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
