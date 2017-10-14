package practice;

import java.util.Scanner;

public class ReverseNumber {

	
	public static void main(String[] args) {
		
		int num, rev=0,rem,temp;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the number:  ");
		
		num=scan.nextInt();
		temp=num;
		while(num>0){
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println("Reverse number of "+temp +" is: "+rev);

	}

}
