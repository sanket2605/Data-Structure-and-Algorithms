package Day01;
import java.util.*;
//Stack Balance

class Stack_Balance
{
	char stack[];
	int tos, MaxSize;

	void createStack(int size) {
		stack = new char[size];
		MaxSize = size;
		tos = -1;
	}

	void push(char e) {
		tos++;
		stack[tos] = e;
		/*
		 * OR stack[++tos]=e;
		 */
	}
	
	char pop() {
		char temp = stack[tos];
		tos--;
		return (temp);
	}

	/*int peek() {
		return (stack[tos]);
	}*/

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

	void print_stack() 
	{
		for (int i = tos; i > -1; i--)
			System.out.println(stack[i]);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sequence to test");
		String input=sc.nextLine();
		Stack_Balance obj=new Stack_Balance();
		obj.createStack(input.length());
		boolean flag=true;
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
				if(c=='{')
					obj.push(c);
				else if(c=='}')
				{
					if(!obj.is_empty())
					{
						char temp=obj.pop();
					}
					else
					{
						System.out.println(" } is UNEXPECTED");
						flag=false;
					}
				}
		}
		if(!obj.is_empty())
		{
			System.out.println("Error: } is  EXPECTED");
		}
		else if(flag==true)
		{
			System.out.println("Pefectly Balanced");
		}
		//System.out.println("Entered: "+input);
	}
}
