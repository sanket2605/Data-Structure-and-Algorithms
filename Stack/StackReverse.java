package Day01;
import java.util.*;

public class StackReverse 
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
			System.out.print(stack[i]);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Stack : ");
		int size=sc.nextInt();
		
		StackReverse stack=new StackReverse();
		stack.createStack(size);

		StackReverse rev=new StackReverse();
		rev.createStack(size);
		int ch;
		
		do
		{
			System.out.println("\n1.Push \n 2.Pop \n 3.PrintOriginal \n 4.PrintReverse \n 0.Exit");
			ch=sc.nextInt();
			switch (ch) 
			{
			  case 1: 
				  if(!stack.is_full())
				  {
					  System.out.println("Enter number : ");
					  int num=sc.nextInt();
					  stack.push(num);
				  }
				  else
					  System.out.println("Stack is Full");
				  break;
			
			  case 2:
				  if(!stack.is_empty())
				  {
					  int no=stack.pop();
					  rev.push(no);
					  
				  }
				  else
				  {
					  System.out.println("Stack is Empty");
				  }
				  break;
				  
			  case 3:
				  if(!stack.is_empty())
				  {
					  System.out.println("Below is Original Stack");
					  stack.print_stack();
				  }
				  else
				  {
					  System.out.println("Stack is Empty");
				  }  
				  break;
				  
			  case 4:
				  if(!stack.is_empty())
				  {
					  System.out.println("Below is Reversed Stack");
					  stack.print_stack();
				  }
				  else
				  {
					  System.out.println("Stack is Empty");
				  }
				  if(!rev.is_empty())
					{
						System.out.println("Printing Reversed Stack");
						rev.print_stack();	
						System.out.println("**************************************************");
					}
				  else
						System.out.println("Reverse Stack is empty..!!");
				  break;
				  
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}		
		}while(ch!=0);
	}
}
