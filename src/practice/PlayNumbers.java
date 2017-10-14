package practice;

import java.util.Scanner;

public class PlayNumbers {

	
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter any two numbers:  ");
		
		a=scan.nextInt();
		
		b=scan.nextInt();
		
		c=a+b;
		
		System.out.println("Addition of "+a+" and "+b+ " is:  "+c );
		
		c=a-b;
		
		System.out.println("Substraction of "+a+" and "+b+ " is:  "+c );
		
		c=a*b;
		
		System.out.println("Multiplication of "+a+" and "+b+ " is:  "+c );
		
		c=a/b;
		
		System.out.println("Division of "+a+" and "+b+ " is:  "+c );
		
		

	}

}
