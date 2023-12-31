public class BubbleSort
{
	void print_array(int a[]) 
	{
		System.out.println("\narray has");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");
	}

void SelectionSort(int a[]) 
	{
		for (int i = 0; i < a.length - 1; i++)// passes
		{
			int min = a[i];
			int pos = i;
			for (int j = i + 1; j < a.length; j++)// sort
			{
				if (a[j] < min) 
				{
					min = a[j];
					pos = j;
				}
			}
			a[pos] = a[i];
			a[i] = min;
		}
	}
  
public static void main(String args[]) 
	{
		int a[] = { 66, 11, 33, 99, 88, 22, 44, 55, 77 };
		SortingAlgo obj = new SortingAlgo();
		obj.print_array(a);
		obj.SelectionSort(a);
		obj.print_array(a);
	}
}
