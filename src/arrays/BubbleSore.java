package arrays;

import java.util.Scanner;

public class BubbleSore {

	
	public static void main(String[] args) {
		
		int i,j,n,temp;
		int arr[]=new int[50];
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter total number of Elements:  ");
		
		n=scan.nextInt();
		
		System.out.println("Enter "+n+" numbers:  ");
		
		for(i=0;i<n;i++){
			
			arr[i]=scan.nextInt();
		}
		System.out.println("Sorting array using Bubble sort.....");
		for(i=0;i<(n-1);i++){
			
			for(j=0;j<(n-i-1);j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array Sorted Successfully...\n\n");
		
		System.out.println("Sorted List in Ascending Order:  \n");
		
		for(i=0;i<n;i++){
			
			System.out.print(arr[i]+" ");
		}
	}

}
