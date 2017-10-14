package arrays;

import java.util.Scanner;

public class CalcPercentage {

	public static void main(String[] args) {
		
		int marks[]=new int[5];
		int i; float sum=0, avg,perc;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter obtained marks in 5 subjects: ");
		
		for(i=0;i<5;i++){
			
			marks[i]=scan.nextInt();
			sum=sum + marks[i];
					
		}
		
		avg=sum/5;
		perc=(sum/500)*100;
		
		System.out.println("Average marks: "+avg);
		
		System.out.println("Percentage of Marks: "+perc+" %");
		
		

	}

}
