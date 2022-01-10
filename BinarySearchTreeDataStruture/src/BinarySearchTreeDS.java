
public class BinarySearchTreeDS {

	public static  Node root;
	public BinarySearchTreeDS(){
		this.root = null;
	}
	public boolean find(int val){
		Node current = root;
		while(current!=null){
			if(current.data==val){
				return true;
			}else if(current.data>val){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}// end of find
	
	
	public void insert(int data){
		Node newNode = new Node(data);
		if(root==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		
		while(true){
			parent = current;
			if(data<current.data){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		}// end of while
	}// end of insert
	
	public void inorderRec(Node root){
		if(root!=null){
			inorderRec(root.left);
			System.out.print(" " + root.data);
			inorderRec(root.right);
		}
	}// end of inorderRec
	
	public void preorderRec(Node root){
		if(root!=null){
			System.out.print(" " + root.data);
			inorderRec(root.left);
			inorderRec(root.right);
		}
	}// end of inorderRec
	
	public void postorderRec(Node root){
		if(root!=null){
			inorderRec(root.left);
			inorderRec(root.right);
			System.out.print(" " + root.data);
		}
	}// end of inorderRec
	
}// end of BinarySearchTreeDS
