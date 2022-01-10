
public class BTS {

	Node root;
	
	BTS(){
		
		root = null;
	}
	
	void insert(int key){
		
		root = insertRec(root, key);
		
	}
	
	Node insertRec(Node root, int key){
		
		if(root == null){
			
			root = new Node(key);
			return root;
		}
		if(root.key > key){
			
			root.left = insertRec(root.left, key);
		}
		
		if(root.key < key){
			root.right = insertRec(root.right, key);
		}
		
		return root;
		
	}// end of insertRec
	
	Node search(Node root, int val){
		
		if(root == null || root.key == val){
			return root;
		}
		else if(root.key > val){
			return search(root.left, val);
		}
		else{
			return search(root.right, val);
		}
	}// end of search
	
	void inorder(){
		inorderRec(root);
	}// end inorder

	void inorderRec(Node root){
		
		if(root != null){
			
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
			
		}
		
	}// end of inorderRec
	
	void preorder(){
		preorderRec(root);
	}// end preorder
	
	void preorderRec(Node root){
		
		if(root != null){
			
			System.out.print(root.key + " ");
			preorderRec(root.left);
			preorderRec(root.right);
		}
		
	}// end of preorderRec
	

	void posteorder(){
		postorderRec(root);
	}// end posteorder
	
	void postorderRec(Node root){
		
		if(root != null){
			
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.key + " ");
		}
		
	}// end of postorderRec
	
}//end of BTRS
