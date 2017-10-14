package check;

import java.util.Scanner;

public class LeapYear {

	
	public static void main(String[] args) {
	
		int yr;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the year:  ");
		
		yr=scan.nextInt();
		
		if((yr%4==0)&&(yr%100!=0)){
			
			System.out.println(yr+" : Is a Leap year.");
		}
		else if(yr%100==0)
		{
			System.out.println(yr+" : Is not a leap year.");
			
		}
		else if(yr%400==0)
		{
			System.out.println(yr+" : Is a leap year.");
			
		}
		else
		{
			System.out.println(yr+" : Is not a leap year.");
		}
	}

}
