import java.lang.reflect.Array;

public class GenericStack <E> {
	
	public E[] array;
	int size;
	int top;
	
	GenericStack(Class <E> e, int size){
		
		this.size=size;
		array=(E[])Array.newInstance(e,size);
		top=-1;
	}
	
	void push(E value) {
		if(top<size)
			array[++top]=value;
	}
	
	E pop() {
		if(top<0) 
			return null;
		else
			return array[top--];
	}
	E peek() {
		if(top<0)
			return null;
		else
		return array[top];
	}
	int search(E value) {
		for(int i=0;i<array.length;i++) {
			if(value==array[i])
				return i;
			}
		return -1;
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	boolean isFull() {
		if(top==size-1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		

		GenericStack<Integer> stack=new GenericStack<>(Integer.class,10);
		System.out.println(stack.isEmpty());
		stack.push(3);
		stack.push(13);
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.search(13));
		
	}

}
