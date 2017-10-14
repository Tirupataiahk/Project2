package practice;

import java.util.Scanner;

public class InterchangeNumbers {

	
	public static void main(String[] args) {
		
		int a,b,temp;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any two numbers: ");
		
		System.out.print("A = ");
		a=scan.nextInt();
		System.out.print("B = ");
		b=scan.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Number Interchange Succfully: ");
		
		System.out.println("A =  "+a);
		
		System.out.println("B =  "+b);
		

	}

}
