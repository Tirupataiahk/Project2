package arrays;

import java.util.Scanner;

public class CalcGrade {

	public static void main(String[] args) {
		
		int i,n,sum=0,avg;
		
		int marks[]=new int[5];
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the 5 subjects marks: ");
		
				
		for(i=0;i<5;i++){
			
			marks[i]=scan.nextInt();
			sum=sum+marks[i];
			
		}
		avg=sum/5;
		
		System.out.print("Your grade is: ");
		if(avg>80){
			
			System.out.print(" A");
		}
		else if(avg>60 && avg<80){
			
			System.out.print(" B");
			
		}
		else if(avg>40 && avg<60){
			
			System.out.print(" C");
		}
		else{
			System.out.print("FAIL");
		}
	}

}
