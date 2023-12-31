public class HeapSort
{
	void print_array(int a[]) 
	{
		System.out.println("\narray has");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");
	}

void HeapSort(int a[])
    {
        int i,j,t,pc;//pc:parent and child ref
        boolean done;
        for(i=a.length-1;i>=0;i--)//bottom to top
        {
            for(j=0;j<=i;j++)//inbetween sort
            {
                pc=j;
                done=true;
                while(pc>=0 && pc/2>=0 && done!=false)//parent child compare for maxheap
                {
                    if(a[pc]>a[pc/2])//child is greater than parent swap
                    {
                        t=a[pc];
                        a[pc]=a[pc/2];
                        a[pc/2]=t;
                        pc=pc/2;//go to parent and compare with its parent
                    }
                    else
                        done=false;
                }
            }
          //swap root with last in the pass  
          t=a[i];
          a[i]=a[0];
          a[0]=t;
        }
    }
  
public static void main(String args[]) 
	{
		int a[] = { 66, 11, 33, 99, 88, 22, 44, 55, 77 };
		SortingAlgo obj = new SortingAlgo();
		obj.print_array(a);
		obj.HeapSort(a);
		obj.print_array(a);
	}
}
