package practice;

import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		int i,num,count=0;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter a number:  ");
		
		num=scan.nextInt();
		
		for(i=2;i<num;i++){
			
			if(num%i==0){
				
				count++;
				break;
			}
		}
		if(count==0){
			System.out.println(num+" is a prime number.");
			
		}else{
			
			System.out.println(num+" is not a Prime number.");
		}
		

	}

}
