package practice;

import java.util.Scanner;

public class AddDigit {

	public static void main(String[] args) {
		
		int num, temp,rem=0,sum=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		
		num=scan.nextInt();
		
		temp=num;
		while(num>0){
			
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of digits of "+temp+" is: "+sum);
	}

}
