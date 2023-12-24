package LinkedList;
import java.util.*;

public class Employee_list 
{
	Employee root; 
	
	void createList()
	{
		root=null;
	}
	
	void register(Employee e)
	{
		Employee n=e;
		if(root==null)
			root=n;
		else
		{
			Employee t = root;
			while (t.next != null) 
			{
				t = t.next;
			}
			t.next = n;
		}
	}
	
	void search(int key) 
	{
		if (root == null) 
		{
			System.out.println("List is Empty");
		} 
		else 
		{
			Employee t = root;
			while (t != null && key != t.getId())
				t = t.next;
			if (t == null)
				System.out.println(key + " not found in List");
			else
				System.out.println(t.toString() + " found in List");
		}
	}
	
	void deleteKey(int key) 
	{
		if (root == null)   //if empty
			System.out.println("List is Empty");
		else               //not empty
		{
			Employee t = root;
			Employee t2= root;
			while (t!=null && key!= t.getId())
			{
			   t2 = t;
				t = t.next;
			}
			if (t == null)   //not found
				System.out.println(key + " not found in List");
			else
			{
				if(t==root)//case1:left most
		            root=root.next;
		        else if(t.next==null)//case 2:right most
		            t2.next=null;
		        else//case 3:in between
		            t2.next=t.next;
		        System.out.println(" ID "+t.getId()+" deleted");
			}
		}
	}
	
	void updateAT(int id)
	{
		if (root == null) 
		{
			System.out.println("List is Empty");
		} 
		else 
		{
			Employee t = root;
			while (t != null && id != t.getId())
				t = t.next;
			if (t == null)
				System.out.println(id + " not found in List");
			else
				updateDetails(t);
		}
	}
	
	private void updateDetails(Employee t)
	{
	   Scanner sc=new Scanner(System.in);
	   int ch;
	   do
	   {
		   System.out.println("1.UpdateName\n2.UpdateGender\n3.Salary\n0.Exit");
		   ch=sc.nextInt();
		   switch (ch) 
		   {
		   		case 1:
		   			System.out.println("Enter Name : ");
		   			t.setName(sc.next());
		   			break;
		   		case 2:
		   			System.out.println("Enter Gender : ");
		   			t.setGender(sc.next());
		   			break;
		   		case 3:
		   			System.out.println("Enter Salary : ");
		   			t.setSalary(sc.nextInt());
		   			break;
		   		case 0:
		   			System.out.println("Exiting !");
		   			break;
			    default:
				    throw new IllegalArgumentException("Unexpected value: " + ch);
		   }
	   }while(ch!=0);
	}
	
	void printList() 
	{
		if (root == null) 
		{
			System.out.println("List is Empty");
		} 
		else 
		{
			Employee t = root;
			while (t != null) 
			{
				System.out.println(t.toString());
				t = t.next;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Employee_list list=new Employee_list();
		list.createList();
		int ch;
		do
		{
			Employee e=new Employee();
			System.out.println("1.Register Employee\n2.Search Employee\n3.Delete Employee\n4.Update Employee\n5.Print List\n0.Exit");
			System.out.println("enter choice : ");
			ch=sc.nextInt();
			switch (ch) 
			{
			case 1: 
				System.out.println("Enter ID : "); e.setId(sc.nextInt());
				System.out.println("Enter Name : "); e.setName(sc.next());
				System.out.println("Enter Gender : "); e.setGender(sc.next());
				System.out.println("Enter Salary : "); e.setSalary(sc.nextInt());
				list.register(e);
				break;
            case 2: 
            	System.out.println("Enter ID to be searched : ");
				list.search(sc.nextInt());
				break;
            case 3: 
            	System.out.println("Enter ID to be deleted : ");
				list.deleteKey(sc.nextInt());
				break;
            case 4: 
            	System.out.println("Enter ID to be updated : ");
				list.updateAT(sc.nextInt());
				break;
            case 5:
            	list.printList();
            	break;
            case 0: 
				System.out.println("Exiting !");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}while(ch!=0);
	}
}
