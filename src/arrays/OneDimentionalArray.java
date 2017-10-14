package arrays;

import java.util.Scanner;

public class OneDimentionalArray {

	
	public static void main(String[] args) {
		
		int arr[] = new int[50];
		int n, i;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("How many Elements you want to store in array? ");
		
		n=scan.nextInt();
		System.out.println("Enter "+n+" Elements Store in Array..");
		
		for(i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		
		
		
		System.out.println("Elements in Array is: \n");
		for(i=0;i<n;i++){
			
			System.out.print(arr[i]+"  ");
		}

	}

}
