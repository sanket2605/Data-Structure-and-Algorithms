public class InsertionSort 
{
	void print_array(int a[]) 
	{
		System.out.println("\narray has");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");
	}
	
	void InsertionSort(int a[]) 
	{
		for (int i = 0; i < a.length - 1; i++)// passes
		{
			int new_element = a[i + 1];
			int j = i + 1;
			while (j > 0 && a[j - 1] > new_element) 
			{
				a[j] = a[j - 1];
				j--;
			}
			a[j] = new_element;
		}
	}
  public static void main(String args[]) 
	{
		int a[] = { 66, 11, 33, 99, 88, 22, 44, 55, 77 };
		int b[] = { 22, 11, 44, 33, 55, 66, 77, 88, 99 };
		SortingAlgo obj = new SortingAlgo();
		obj.print_array(a);
		obj.InsertionSort(a);
		obj.print_array(a);
	}
}
