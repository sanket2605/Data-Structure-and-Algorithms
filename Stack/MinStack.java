package Day01;
import java.util.*;

public class MinStack 
{
	int stack[], tos, MaxSize;

	void createStack(int size) 
	{
		stack = new int[size];
		MaxSize = size;
		tos = -1;
	}

	void push(int e) 
	{
		tos++;
		stack[tos] = e;
		/*
		 * OR stack[++tos]=e;
		 */
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

	int pop() 
	{
		int n = stack[tos];
		tos--;
		return (n);
	}

	int peek() 
	{
		return (stack[tos]);
	}

	void print_stack() 
	{
		for (int i = tos; i > -1; i--)
			System.out.println(stack[i]);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of stack: ");
		int size=sc.nextInt();
		
		MinStack obj1=new MinStack();
		obj1.createStack(size);
		
		MinStack obj2=new MinStack();
		obj2.createStack(size);	
		
		while(!obj1.is_full())
		{
			System.out.println("enter number to be pushed:");
			int num=sc.nextInt();
			obj1.push(num);
			if(obj2.is_empty())
				obj2.push(num);
			else
			{
				
			}
		}
				
	}
}
