package check;

import java.util.Scanner;

public class AddNumbers {

	
	
	public static void main(String[] args) {
		
		int a, b, sum;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter any two numbers:  ");
		a=scan.nextInt();
		b=scan.nextInt();
		sum=a+b;
		
		System.out.println("Sum of "+a+" and "+b+" is: "+sum);
		
		

	}

}
