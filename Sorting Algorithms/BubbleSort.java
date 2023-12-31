public class BubbleSort
{
	void print_array(int a[]) 
	{
		System.out.println("\narray has");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");
	}

void BubbleSort(int a[]) 
	{
		boolean flag = true;
		for (int i = 0; i < a.length - 1; i++)// passes
		{
			flag = true;
			for (int j = 0; j < (a.length - 1 - i); j++)// sort
			{
				if (a[j] > a[j + 1]) 
				{
					flag = false;
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
			if (flag == true) 
			{
				System.out.println("\nsorted and done ");
				break;
			} 
			else 
			{
				System.out.println("\npass:" + (i + 1));
			}
		}
	}

public static void main(String args[]) 
	{
		int a[] = { 66, 11, 33, 99, 88, 22, 44, 55, 77 };
		SortingAlgo obj = new SortingAlgo();
		obj.print_array(a);
		obj.BubbleSort(a);
		obj.print_array(a);
	}
}
