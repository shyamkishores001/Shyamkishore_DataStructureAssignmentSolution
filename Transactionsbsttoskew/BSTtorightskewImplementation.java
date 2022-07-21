package Transactionsbsttoskew;

public class BSTtorightskewImplementation {
	public Node node;
    static Node parent = null;
    static Node head = null;
   
    
    static void BSTtoSkew(Node value)
    {
       
      
        if(value == null)
        {
            return;
        }
       
        
       
        BSTtoSkew(value.left);
        
        Node right = value.right;
        Node leftNode = value.left;
       
       
        if(head == null)
        {
            head = value;
            value.left = null;
            parent = value;
        }
        else
        {
            parent.right = value;
            value.left = null;
            parent = value;
        }
       
      
      
        BSTtoSkew(right);
        
    }
   
   
    static void print(Node value)
    {
        if(value == null)
        {
            return;
        }
        System.out.print(value.key + " ");
        print(value.right);       
    }
}
