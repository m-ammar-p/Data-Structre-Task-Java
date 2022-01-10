
public class Stack {
	
	private int arr[];
	private int top;
	
	Stack(int size){
		
		arr = new int[size];
		top = -1;
	}
	

	public static void main(String[] args) {
		
		
		Stack st = new Stack(5);
		
		st.push(5);
		st.push(10);
		st.push(15);
		st.push(25);
		st.push(35);
		st.push(40);

		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());

	}
	
	public void push(int value) {
		
		if(!IsFull()) {
			top++;
			arr[top] = value;
			System.out.println("values "+value+" Pushed at arr["+top+"]");
			
		}else {
			
			System.out.println("Stack is Full");
		}
		
	}
	
	public int pop() {
		
		if(!IsEmpty())
			return arr[top--];
		else
		{
			System.out.print("Stack is Empty :");
			return -1;
		}
	}
	
	public boolean IsFull()
	{
		return (top == arr.length-1);
		
	}
	public boolean IsEmpty()
	{
		return (top < 0);
		
	}
	
}
