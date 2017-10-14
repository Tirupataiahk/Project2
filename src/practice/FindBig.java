package practice;

import java.util.Scanner;

public class FindBig {

	public static void main(String[] args) {
		
		int a, b, big;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers a, b: ");
		
		a=scan.nextInt();
		b=scan.nextInt();
		
		if(a>b){
			
			big=a;
			
		}else{
			
			big=b;
		}
		System.out.println("Largest of two numbers is:  "+big);

	}

}
