import java.util.Scanner;
import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		
		int max=0,min=0,maxCount=0,minCount=0;
		int arr[] = new int[10];
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 Inputs");
		
		for (int i = 0; i <10; i++) {
			
			System.out.print(i+". ");
			
			arr[i] = sc.nextInt();
			
		}// input ends
		
		Arrays.sort(arr);
		
		System.out.print(Arrays.toString(arr));
		
		min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (max < arr[i]) {
				
				max = arr[i];
			}
			
			if (min > arr[i]) {
				
				min = arr[i];
			}
			
		}// min max end
		
		for (int i = 0; i < arr.length; i++) {
			
			if (max == arr[i]) {
				
				maxCount++;
			}
			
			if (min == arr[i]) {
				
				minCount++;
			}
		}
		
		System.out.println("\nMin Value: "+min);
		System.out.println("Max Value: "+max);
		
		System.out.println("Smallest Number Count: "+minCount);
		System.out.println("Largest Number Count: "+maxCount);
		
	}

}
