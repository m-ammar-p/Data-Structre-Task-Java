
public class CicularLinkedList {

	public static void main(String[] args) {
	
		CLinkedList list = new CLinkedList();
		list.addNodeToHead(2);
		list.addNodeToHead(6);
		list.addNodeToHead(3);
		list.addNodeToHead(4);
		
		list.addNodeToTail(10);
		list.addNodeToTail(25);
		
		list.display();
	}

}//end of CircularLinked List

class Node{
	  
	int element;
	  Node next;
	  
	  public Node(int element){
	   this.element = element;
	  }
}// end of Node

class CLinkedList {
	
	  public int size = 0;
	  public Node head = null;
	  public Node tail = null;
	  
	  public void addNodeToHead(int element){
		  Node n = new Node(element);
		  if(size==0){
		   head = n;
		    tail = n;
		   n.next = head;
		  }else{
		   Node temp = head;
		   n.next = temp;
		   head = n;
		   tail.next = head;
		  }
		  size++;
		}// end of addNodeToHead
	  
	  public void addNodeToTail(int element){
		  
		  if
		  (size==0){
		   addNodeToHead(element);
		  }
		  else{
		   Node n = new Node(element);
		   tail.next = n;
		   tail = n;
		   tail.next = head;
		   size++;
		  }
	  }// end of addNodeToTail
	  
	  public void display(){
		  System.out.print("The List So Far: ");
		  Node temp = head;
		  
		  do {
		   System.out.print(" " + temp.element);
		   temp = temp.next;
		  }
		  while(temp != head);
		  {
		  System.out.println();
		}
	  }// end of display
	  
}// end of CLinkedList

