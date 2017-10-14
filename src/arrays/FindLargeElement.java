package arrays;

import java.util.Scanner;

public class FindLargeElement {

	
	public static void main(String[] args) {
		
		int large,size,i;
		
		int arr[] =new int[50];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the array Size: ");
		
		size=scan.nextInt();
		
		System.out.println("Enter the array Elements: ");
		
		for(i=0;i<size;i++){
			
			arr[i]=scan.nextInt();
		}
		System.out.println("Search for largest element.....\n\n");
		
		large=arr[0];
		
		for(i=0;i<size;i++){
			
			if(large<arr[i]){
				large=arr[i];
			}
		}
		
		System.out.println("Large Number = "+large);
	}

}
