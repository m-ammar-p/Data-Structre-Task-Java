
public class BinarySearchTree {

	public static void main(String[] args) {
		
		BTS bst = new BTS();
		
		bst.insert(60);
		bst.insert(20);
		bst.insert(40);
		bst.insert(90);
		bst.insert(70);
		
		Node res = bst.search(bst.root, 90);
	
		if(res == null)
		System.out.println("Value does not Exist");
		else
			System.out.println("Value Exist");
		
		System.out.println("Inorder");
		bst.inorder();
		
		System.out.println("\nPreorder");
		bst.preorder();
		
		System.out.println("\nPostorder");
		bst.posteorder();
		
		
		
	}// end of main
}//end of BinarySearchTree


