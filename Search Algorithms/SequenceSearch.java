public class Sequence
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

public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Search1 obj=new Search1();
		int arr[]= {22,11,55,77,33,99,1,45,67,98};
		int bin[]= {11,22,33,44,55,66,77,88,99,111};
		System.out.println("enter key to be searched : ");
		int key=sc.nextInt();
		int res=obj.sequenceSearch(arr,key);
		if(res==-1)
			System.out.println("key not found");
		else
			System.out.println("key found");
	}
}
