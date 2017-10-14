package check;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	
		int num;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		num=scan.nextInt();
		if(num%2==0){
			
			System.out.println("Given number is Even. ");
		}else{
			
			System.out.println("Given number is Odd. ");
		}

	}

}
