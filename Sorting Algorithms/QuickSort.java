public class QuickSort
{
	void print_array(int a[]) 
	{
		System.out.println("\narray has");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");
	}

void QuickSort(int a[], int start, int end) 
	{
		int i = start, j = end, pivot = end;
		if (i <= j) 
		{
			while (i < j) 
			{
				while (a[i] < a[pivot])
					i++;
				while (a[j] > a[pivot])
					j--;
				if (i < j) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		if (i < end)
			QuickSort(a, i + 1, end);
		if (j > start)
			QuickSort(a, start, j - 1);
	}
  
public static void main(String args[]) 
	{
		int a[] = { 66, 11, 33, 99, 88, 22, 44, 55, 77 };
		SortingAlgo obj = new SortingAlgo();
		obj.print_array(a);
		obj.QuickSort(a);
		obj.print_array(a);
	}
}
