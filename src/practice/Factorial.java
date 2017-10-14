package practice;

import java.util.Scanner;

public class Factorial {

	
	
	public static void main(String[] args) {
		
		int i, num, fact=1,temp;
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter the factorial number:  ");
		
		num=scan.nextInt();
		temp=num;
		for(i=num;i>0;i--){
			
			fact=fact*i;
		}
		System.out.println("Factorial of "+temp+ " number is: "+fact);

	}

}
