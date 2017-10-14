package arrays;

import java.util.Scanner;

public class ArithmeticMean {

	
	public static void main(String[] args) {
		
		int i,n,armean, sum=0;
		
		int arr[]=new int[50];
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many numbers do you want enter? ");
		
		n=scan.nextInt();
		for(i=0;i<n;i++){
			
			arr[i]=scan.nextInt();
			sum=sum+arr[i];
		}
		
		armean=sum/n;
		
		System.out.println("Arithmetic mean is: "+ armean);

	}

}
