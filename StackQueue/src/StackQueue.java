import java.util.Scanner;
import java.util.Stack;

public class StackQueue {
	
	public static String reverseString(String str)
	{
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			st.push(ch);
		}
		
		String output="";
		
		for(int i=0;i<str.length();i++)
		{
			output += st.pop();			
		}
	
		return output;
		
	}// end of reverseString




	public static void main(String[] args) {
		
		
		MyStack ms = new MyStack(5);
		
		ms.push(3);
		ms.push(6);
		ms.push(7);
		ms.push(2);
		ms.push(10);
		ms.push(15);
		
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		
		System.out.println("--------------------------");
		MyQueue mq = new MyQueue(5);
		mq.EnQueue(10);
		mq.EnQueue(20);
		mq.EnQueue(30);
		mq.EnQueue(40);
		mq.EnQueue(50);
		mq.EnQueue(60);
		mq.EnQueue(70);
		
		
		System.out.println(mq.DeQueue());
		System.out.println(mq.DeQueue());
		System.out.println(mq.DeQueue());
		System.out.println(mq.DeQueue());
		System.out.println(mq.DeQueue());
		System.out.println(mq.DeQueue());
		
		System.out.println("--------------------------");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter any String");
				
		String str = sc.nextLine();
				
		String result = reverseString(str);
				
		System.out.println("Reversed: "+result);
		
	}
	
}// end of StackQueue

class MyStack{
		
	//LIFO
		private int arr[];
		private int top;
		

		public MyStack(int size){
			
			arr = new int[size];
			top = 0;
			
		}
		
		public void push(int val) {
			
			
			if(!isFull()) {
				
				arr[top] = val;
				System.out.println("value "+val+" Pushed at arr["+top+"]");
				top++;
				
			}
			else {
				System.out.println("Stack is Full");
			}
		}
		
		public int pop() {
			
			if(!isEmty()) {
				
				return arr[--top];
			}
			else {
				
				System.out.print("Stack is Empty :");
				return -1;
			}
		}
		
		
		public boolean isFull() {
			
			return (top == arr.length);
		}
		
		public boolean isEmty() {
			
			return (top == 0);
		}

}// end of MyStack
	 
	 
class MyQueue{
		 
		//FIFOs
		 private int arr2[];
		 private int rear;
		 private int front;
		 private int nItems;;
		 
		 public MyQueue(int size) {
			 
			 arr2 = new int[size];
			 rear = 0;
			 front = 0;
			 nItems = 0;
			 
		 }
		 
		 public void EnQueue(int value)
			{
				if(isFull())
					rear = 0;
				
				arr2[rear] = value;
				System.out.println(value+" is added at arr["+rear+"]");
				rear++;
				nItems++;

			}
		 
		 public int DeQueue()
			{
				if(isEmpty()) 
					front = 0;

				nItems--;
				return arr2[front++];
				
			}
		 
		 public int QueueSize(){
				return nItems;
			}
		 
		 public boolean isFull() {
			 
			 return (rear == arr2.length);
		 }
		 
		 public boolean isEmpty() {
			 
			 return (front == arr2.length);
		 }
		 
		 
}// end of MyQueue


	 

