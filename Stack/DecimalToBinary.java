package Day01;
import java.util.*;

public class DecimalToBinary 
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
		Scanner sc=new Scanner(System.in);
		DecimalToBinary obj=new DecimalToBinary();
		obj.createStack(16);
		System.out.println("Enter number to be converted: ");
		int num=sc.nextInt();		
		while(num>0)
		{
			int binary=num%2;
			num=num/2;
			obj.push(binary);
		}
		while(!obj.is_empty())
		{
			System.out.print(obj.pop());
		}	
	}
}
