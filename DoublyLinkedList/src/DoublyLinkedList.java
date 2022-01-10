
public class DoublyLinkedList {

	public static void main(String[] args) {
		
		DLinkedList list = new DLinkedList();
		
		list.addFirst(50);
		list.addFirst(20);
		list.addFirst(30);
		list.insertAtPos(25, 3);
		
		list.removeFirst();
	
		list.addLast(60);
		list.addLast(70);
		
		list.removeLast();
		
		list.search(50);
	
		list.display();
		
	}

}// end DoublyLinkedList

class Node{
	
	private int data;
	private Node nextNode;
	private Node prevNode;
	
	public Node(int d, Node n, Node p) {
		
		data = d;
		nextNode = n;
		prevNode = p;
		
	}
	
	public int getData() {return data;}
	
	public Node getNext() {return nextNode;}
	
	public Node getPrev() {return prevNode;}
	
	public Node setNext(Node n) {return nextNode = n;}
	
	public Node setPrev(Node p) {return prevNode = p;}
	
} // end of Node

class DLinkedList{
	
	private Node head;
	private Node tail;
	//private Node prev;
	//private Node next;
	private int size;
	
	public void addFirst(int value) {
		
		Node n = new Node(value,null,null);
		
	     if(head == null)
	        {
	            head = tail =  n;
	           
	        }
	        else
	        {
	            head.setPrev(n);
	            n.setNext(head);
	            head = n;
	        }
	     
	     size++;
       
	}// end of addFirst
	
	public void addLast(int value) {
		
		 Node n = new Node(value, null, null);        
		 
		 if(tail == null)
	            head = tail = n;
	        else{
	        	
	        	tail.setNext(n);
	    		n.setPrev(tail);
	    		tail = n;
	        }
	        
	        size++;

	}// end of addLast
	
	public void removeFirst() {
		
		if(head !=null) {
			
			head = head.getNext();
		}
		
		size--;
	}
	
	public void removeLast() {
		
		if(tail != null) {
//			prev = tail.getPrev();
//			prev.setNext(null);
			
			tail = tail.getPrev();
			tail = tail.setNext(null);
		}
		size--;
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
	
	public void insertAtPos(int value , int pos)
    {
        Node n = new Node(value, null, null); 
        
        if (pos == 1)
        {
            addFirst(value);
            return;
        }            
        Node ptr = head;
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                Node tmp = ptr.getNext();
                ptr.setNext(n);
                n.setPrev(ptr);
                n.setNext(tmp);
                tmp.setPrev(n);
            }
            ptr = ptr.getNext();            
        }
        size++ ;
    }//end of insertAtPos
	
	public void display() {
		
        Node n = head;
        
        while(n !=null)
        {
            System.out.println(n.getData());
            n = n.getNext();
        }
        
	}// end of display
	
}// end of DLinkedList