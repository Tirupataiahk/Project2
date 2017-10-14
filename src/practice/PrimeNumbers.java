package practice;

import java.util.Scanner;

public class PrimeNumbers {

	
	public static void main(String[] args) {
		
		int i, j,start,end,count=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the range: ");
		
		System.out.print("Enter the starting number:  ");
		start=scan.nextInt();
		
		System.out.println("Enter the ending Number:  ");
		
		end=scan.nextInt();
		
		System.out.println("Prime numbers between "+start+" and "+end+" is:");
		for(i=start;i<=end;i++){
			
			count=0;
			for(j=2;j<i;j++){
				
				if(i%j==0){
					count++;
					break;
				}
				
				}
			if(count==0){
				
				System.out.println(i+" ");
			}
		}

	}

}
