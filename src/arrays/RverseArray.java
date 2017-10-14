package arrays;

import java.util.Scanner;

public class RverseArray {

	
	public static void main(String[] args) {
		
			int i,j,size,temp;
			
			int arr[]=new int[50];
			
			Scanner scan =new Scanner(System.in);
			
			System.out.println("Enter array size: ");
			
			size=scan.nextInt();
			System.out.println("Enter array Elements: ");
			
			for(i=0;i<size;i++){
				
				arr[i]=scan.nextInt();
				
			}
			j=i-1;
			
			i=0;
			while(i<j){
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			
			}
			System.out.println("Reverse Array is: ");
			for(i=0;i<size;i++){
				
				System.out.print(arr[i]+" ");
			}
	}
	

}
