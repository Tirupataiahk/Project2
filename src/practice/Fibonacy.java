package practice;

import java.util.Scanner;

public class Fibonacy {

	
	public static void main(String[] args) {
		
		int a=0,b=1,c=0,limit;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the limit: ");
		
		limit=scan.nextInt();
		System.out.println("Fibonacy series "+a+" "+ b+" ");
		
		c=a+b;
		
		limit=limit-2;
		
		while(limit>0){
			
			System.out.println(c+" ");
			
			a=b;
			b=c;
			c=a+b;
			limit--;
		}
		

	}

}
