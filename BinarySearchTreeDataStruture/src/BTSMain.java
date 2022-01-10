
public class BTSMain {

	public static void main(String[] args) {
		
		BinarySearchTreeDS b = new BinarySearchTreeDS();
		b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		
		System.out.println("Preorder Tree : ");
		b.preorderRec(b.root);	
		System.out.println("");
		
		System.out.println("Ineorder Tree : ");
		b.inorderRec(b.root);	
		System.out.println("");
		
		System.out.println("Postorder Tree : ");
		b.postorderRec(b.root);	
		System.out.println("");
		
		System.out.println(b.find(25));
		

	}

}
