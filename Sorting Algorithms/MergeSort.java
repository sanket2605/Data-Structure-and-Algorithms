public class MergerSort
{
void MergeSort(int a[], int start, int end) 
	{
		if (start < end) 
		{
			int mid = (start + end) / 2;
			MergeSort(a, start, mid);// div
			MergeSort(a, mid + 1, end);// div
			Merger(a, start, mid, end);// conquer
		}
	}

	void Merger(int a[], int start, int mid, int end) 
	{// sort and combine
		int temp[] = new int[a.length];
		int i, j, tindex;
		i = start;
		j = mid + 1;
		tindex = start;
		while (i <= mid && j <= end)// compare and copy
		{
			if (a[i] < a[j])
				temp[tindex++] = a[i++];
			else
				temp[tindex++] = a[j++];
		}
		while (i <= mid)// copy leftover from i
			temp[tindex++] = a[i++];
		while (j <= end)// copy leftover from j
			temp[tindex++] = a[j++];
		for (i = start; i <= end; i++)
			a[i] = temp[i];
	}

public static void main(String args[]) 
	{
		int a[] = { 66, 11, 33, 99, 88, 22, 44, 55, 77 };
		SortingAlgo obj = new SortingAlgo();
		obj.print_array(a);
		obj.MergeSort(a, 0, a.length - 1);
		obj.print_array(a);
	}
}
