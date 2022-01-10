import java.util.Arrays;

public class ArrayListDS {

	private Object [] list;
	private int size=0;
	
	public ArrayListDS(){
		list= new Object[10];
	}

	
	public void add(Object value){
		if(list.length-size<=5)
			increaseSize();
		list[size++]=value;
		
	}
	
	public void increaseSize(){
		list=Arrays.copyOf(list, list.length*2);
		
	}
	
	public Object get(int index){
		if(index<size)
			return list[index];
		else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	public Object remove(int index){
		if(index<size){
			Object val=list[index];
			list[index]=null;
			int temp=index;
			while(temp<size){
				list[temp]=list[temp+1];
				list[temp+1]=null;
				temp++;
			}
			size--;
			return val;
		}
		else
			throw new ArrayIndexOutOfBoundsException();
		
	}
	public int size(){
		return size;
	}

	
	public static void main(String[] args) {
	
		ArrayListDS obj=new ArrayListDS();
		System.out.println("Size of arraylist " + obj.size());
		obj.add(2);
		obj.add(1);
		obj.add(7);
		obj.add(4);
		obj.add(9);
		System.out.println("Size of arraylist after adding values " + obj.size());
		System.out.println("List of array \n");
		for(int i=0;i<obj.size();i++){
			System.out.print(obj.get(i)+ (", "));
		}
		System.out.println("\nRemove value at index 2: " + obj.remove(2));
		System.out.println("List of array \n");
		for(int i=0;i<obj.size();i++){
			System.out.print(obj.get(i)+ (", "));
		}
		System.out.println("\nSize of arraylist after adding values " + obj.size());


	}

}
