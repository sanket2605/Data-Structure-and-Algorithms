package Day06_SearchAlgo;
import java.util.*;

public class Search1 
{
	
	int sequenceSearch(int arr[],int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
				return i;
		}
		return (-1);
	}
	
	int binarySearch(int a[],int key,int start,int end)
	{
		if(key<a[start] || key>a[end])
			return (-1);
		else
		{
		if(start<=end)
		{
			int mid=(start+end)/2;
			if(key==a[mid])
				return mid;
			else
			{
				
				if(key<a[mid])
					return binarySearch(a, key, start, mid-1);
				else
					return binarySearch(a, key,mid+1,end);
			}
		}
		else
			return (-1);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Search1 obj=new Search1();
		int arr[]= {22,11,55,77,33,99,1,45,67,98};
		int bin[]= {11,22,33,44,55,66,77,88,99,111};
		System.out.println("enter key to be searched : ");
		int key=sc.nextInt();
		//int res=obj.sequenceSearch(arr,key);
		int res=obj.binarySearch(bin,key,0,bin.length-1);
		if(res==-1)
			System.out.println("key not found");
		else
			System.out.println("key found");
	}
}
