package arrays;

import java.util.Scanner;

public class SmallestElement {

	
	public static void main(String[] args) {
	
		int i,small,size;
		
		int arr[]=new int[50];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Array size:  ");
		
		size=scan.nextInt();
		
		System.out.print("Enter the array Elements: ");
		
		for(i=0;i<size;i++){
			
			arr[i]=scan.nextInt();
		}
		System.out.print("Searching for the smallest Element:  ");
		
		small=arr[0];
		
		for(i=0;i<size;i++){
			if(small>arr[i]){
				
				small=arr[i];
			}
		}
		System.out.println("Smallest Element:  "+small);
	}

}
