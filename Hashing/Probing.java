public class Hash_Probing
{
	int hashtable[],MaxSize,count;
	
	void createTable(int size)
	{
		MaxSize=size;
		hashtable=new int[MaxSize];
		count=0;
		for(int i=0;i<hashtable.length;i++)
			hashtable[i]=-1;
	}
	
	boolean isFull()
	{
		if(count==MaxSize)
			return true;
		else
			return false;
	}
	
	boolean isEmpty()
	{
		if(count==0)
			return true;
		else
			return false;
	}
	
	void linearHash(int data)
    {    
          int index=data%MaxSize;
          if(hashtable[index]==-1)
          {
              hashtable[index]=data;
              System.out.println("inserted at "+index); 
              count++;
          }
          else
          {
            int tindex=index;
            while (true)
            {
                if(hashtable[tindex]==-1)
                {
                    hashtable[tindex]=data;
                    System.out.println("inserted at "+tindex+" after handling collision"); 
                    count++;
                    break;
                }
                tindex=(tindex+1)%MaxSize;
            }
                
          }
        }
	
	void printHash()
	{
		for(int i=0;i<hashtable.length;i++)
			System.out.println("number saved at index "+i+" is "+hashtable[i]);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Hash_Probing obj=new Hash_Probing();
		System.out.println("enter size of HashTable :");
		int size=sc.nextInt();
		obj.createTable(size);
		int ch;
		do 
		{
			System.out.println("1.Insert Value\n2.Print Table\n0.Exit\n");
			ch=sc.nextInt();
			switch (ch) 
			{
			case 1: 
				if(obj.isFull())
					System.out.println("HashTable is Full !");
				else
				{
					System.out.println("enter number to be hashed :");
					int no=sc.nextInt();
					obj.linearHash(no);
					System.out.println("Hashing done !");
				}
				break;
			case 2:
				if(obj.isEmpty())
				     System.out.println("HashTable is Empty !");
				else
	                 obj.printHash();
				break;
			case 0:
				System.out.println("Exiting !!!");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}			
		} while(ch!=0);
	}
}
