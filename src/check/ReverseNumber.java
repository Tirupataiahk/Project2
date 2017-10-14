package check;

import java.util.Scanner;

public class ReverseNumber {

	
	public static void main(String[] args) {
		
		int num,orig,rem,rev=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a number:  ");
		
		num=scan.nextInt();
		
		orig=num;
		while(num>0){
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(orig==rev){
			
			System.out.println("Given number is a reverse number.");
			
		}
		else{
			System.out.println("Given number is not a reverse number.");
		}
	}

}
