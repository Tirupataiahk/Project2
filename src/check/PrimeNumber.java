package check;

import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		int num, i, count=0;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		num=scan.nextInt();
		
		for(i=2;i<num;i++){
			
			if(num%i==0){
				
				count++;
				break;
				
				
			}
		}
		
		if(count==0){
			
			System.out.println("This is "+num+" a prime Number.");
		}
		else{
			
			System.out.println("This is  "+num+" not a prime number. ");
		}

	}

}
