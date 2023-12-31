package Day04_Tree;

public class TreeEx1 
{
    DNode root;
    void createTree()
    {
        root=null;
    }
    
    void insert(DNode r,DNode n)//r:root n:new node
    {
        if(root==null)
            root=n;
        else
        {
            if(n.data<r.data)
            {
                if(r.left==null)
                    r.left=n;
                else
                    insert(r.left,n);
            }
            else
            {
                if(r.right==null)
                    r.right=n;
                else
                    insert(r.right,n);
            }
        }
    }
    
    DNode deletion(DNode r,int key) 
    {
		if(r==null)
			return r;
		else 
		{			
			if(key<r.data)
			{
				r.left=deletion(r.left,key);
			    return r;
			}
			else if(key>r.data) 
			{
				r.right=deletion(r.right,key);
				  return r;
			}			    
			else
				if(r.left==null)
					return r.right;
				else if(r.right==null)
					return r.left;
			    r.data=minValue(r.right);
			    r.right=deletion(r.right,r.data);		
		}
		return r;		
	}
    
    int minValue(DNode r) 
    { 
    	int min=r.data;
    	while(r.left!=null) 
    	{
    		min=r.left.data;
    		r=r.left;
    	}
    	return min;	
    }
    
    boolean searchKey(DNode r,int d) 
    {
   	 if(r!=null)
        {
   		 if(r.data==d)
   			 return true;
   		 else 
   			 {
	   			 if(d<r.data)
	   			
	            return searchKey(r.left,d);//l
	   		    else 
	   			return searchKey(r.right,d);//r
   			 }
        }
   	 return false;
   }

    void inorder(DNode r)
    {
        if(r!=null)
        {
            inorder(r.left);//l
            System.out.print(r.data+",");//p
            inorder(r.right);//r
        }
    }
        
    void preOrder(DNode r)
    {
        if(r!=null)
        {
        	System.out.print(r.data+",");//p
        	preOrder(r.left);//l
        	preOrder(r.right);//r
        }
    }
    void postOrder(DNode r)
    {
        if(r!=null)
        {
        	postOrder(r.left);//l
        	postOrder(r.right);//r
        	System.out.print(r.data+",");//p
        }
    }
    int getHeight(DNode r) {
    	if(r==null){
        	return 0;
        }else
        {
        	int right=getHeight(r.left);//l
        	int left = getHeight(r.right);//r
        	return Math.max(left,right)+1;
        }
    }
    boolean isBalanced(DNode r)
    {
        if(r==null){
        	return true;
        }else
        {
        	int right=getHeight(r.left);//l
        	int left = getHeight(r.right);//r
        	if(left-right==0) {
        		return true;
        	}else
        		return false;
        }
    }
   
    public static void main(String args[])
    {
        TreeEx1 obj=new TreeEx1();
        obj.createTree();//root=null
        DNode n1=new DNode(50);
        obj.insert(obj.root, n1);
        DNode n2=new DNode(20);
        obj.insert(obj.root, n2);
        DNode n3=new DNode(60);
        obj.insert(obj.root, n3);
        DNode n4=new DNode(30);
        obj.insert(obj.root, n4);
        DNode n5=new DNode(100);
        obj.insert(obj.root, n5);
        obj.inorder(obj.root);
        System.out.println();
        obj.preOrder(obj.root);
        System.out.println();
        obj.postOrder(obj.root);
        System.out.println(obj.searchKey(obj.root,100));
        
    }
}