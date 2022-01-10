
public class BinarySearchMain {

	public static int binarySearch(int[] arr, int target) {
		
		int start , middle , end;
		start = 0;
		end = arr.length-1;
		
		while (start <=end) {
			
            middle = (start + end)/2;
            
            if (target == arr[middle]) 
                return middle;
            
            if (target < arr[middle])
                end = middle-1; 
            
            if (target > arr[middle])
                start = middle +1;

        }
		return -1;
	}// end of binarySearch
		
		

	
	public static void main(String[] args) {
		
		int[] arr = {33,5,2,7,8,5,1,3,33,44,55,66,23,56,7,8,9};
		
		int result = binarySearch(arr,33);
        
        if(result == -1)
            System.out.println("Not Found");
        else
            System.out.println("Found at "+result);

	}

}
