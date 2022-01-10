
public class SingleLinkedList {

	public static void main(String[] args) {
		
		SLinkedList list = new SLinkedList();
		
		list.addFirst(50);
		list.addFirst(20);
		list.addFirst(30);
		
		list.addLast(60);
		
		list.removeFirst();
		list.removeLast();
		
		list.search(40);
		
		list.display();
		

	}

}// end of SingleLinkedList

class Node{
	
	private int data;
	private Node next;
	
	public Node(int d, Node n) {
		
		data = d;
		next = n;
		
	}
	
	
	public int getData() {return data;}
	
	public Node getNext() {return next;}
	
	public Node setNext (Node n){return next = n;}
	
	
	
}// end of Node

class SLinkedList{
	
	private Node head;
	private Node tail;
	
	public void addFirst(int value) {
		
		Node n = new Node(value,null);
		n.setNext(head);
        head = n;
        
        if(tail == null) {
            tail = n;
        }
       
	}
	
	public void removeFirst() {
		
		if(head !=null) {
			
			head = head.getNext();
		}
	}
	
	public void addLast(int value) {
		
		Node n = new Node(value,null);
		
		if(tail == null)
            head = tail = n;
        else{
        	tail.setNext(n);
    		tail = n;
        }
		
	}
	
	public void removeLast() {
		
		Node ptr = head;
		
		while(ptr.getNext().getNext() != null) {
			
			ptr = ptr.getNext();
		}
		
		ptr = ptr.setNext(null);
	}
	
	public Node search(int value) {
		
		Node ptr = head;
		
		while(ptr != null) {
			
			if(value == ptr.getData()) {
				
				System.out.println("value: "+value+ " Found");
				return ptr;
			}
			
			ptr = ptr.getNext();
			
		}// end of while loop
		
		System.out.println("value: "+value+ " Not Found");
		return null;
	}// end of search
	
	public void display() {
		
        Node n = head;
        
        while(n !=null)
        {
            System.out.println(n.getData());
            n = n.getNext();
        }
        
	}
	
	
}// end of SLinkedList
