package Transactionsbsttoskew;

public class Driver {

	public static void main(String[] args) {
		BSTtorightskewImplementation obj =new BSTtorightskewImplementation();
	    obj.node= new Node(50);
	    obj.node.left = new Node(30);
	    obj.node.right = new Node(60);
	    obj.node.left.left = new Node(10);
	    obj.node.right.left= new Node(55);
		obj.BSTtoSkew(obj.node);
		obj.print(obj.head);

	}

}
