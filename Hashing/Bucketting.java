public class Bucketing 
{
    private int[][] bucket;
    private int maxSize;
    private int slot;

    public void createTable(int size, int slot) 
    {
        maxSize = size;
        this.slot = slot;
        bucket = new int[maxSize][slot];
        for (int i = 0; i < maxSize; i++) 
        {
            for (int j = 0; j < slot; j++)
                bucket[i][j] = -1;
        }
    }

    public void printTable() 
    {
        for (int i = 0; i < maxSize; i++) 
        {
            for (int j = 0; j < slot; j++) 
            {
                if (bucket[i][j] != -1) 
                {
                    System.out.print(bucket[i][j] + "\t");
                } 
                else 
                {
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }
    }
    public void insert(int value) 
    {
        // Calculate the hash value for the given value
        int hash = value % maxSize;
        
        // Initialize the index to -1, indicating not found initially
        int index = -1;
        
        // Iterate through the slots in the bucket at the calculated hash index
        for (int j = 0; j < slot; j++) 
        {
            // If the slot is empty (-1), mark the index and break the loop
            if (bucket[hash][j] == -1) 
            {
                index = j;
                break;
            }
        }
        
        // If an empty slot was found
        if (index != -1) 
        {
            // Place the value in the found empty slot
            bucket[hash][index] = value;
            System.out.println("Inserted " + value + " at index " + hash + "&" + index);
        } 
        else 
        {
            // If no empty slot was found, print a message indicating the bucket is full
            System.out.println("Bucket at index " + hash + " is full. Cannot insert " + value);
        }
    }

    public static void main(String[] args) 
    {
        Bucketing bucketing = new Bucketing();
        bucketing.createTable(3, 3);
      
        bucketing.insert(81);
        bucketing.insert(66);
        bucketing.insert(78);
        bucketing.insert(44);
        bucketing.insert(12);
        bucketing.insert(9);

        bucketing.printTable();
    }
}
