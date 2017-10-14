package strings;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		
		int i,j;
		String temp;
		Scanner scan=new Scanner(System.in);
		
		String names[]=new String[5];
		
		System.out.println("Enter 5 names /words: ");
		
		for(i=0;i<5;i++){
			
			names[i]=scan.nextLine();
		}
		
		System.out.println("Sorting words in alphabetical order..\n");
		
		for(i=0;i<5;i++){
			for(j=1;j<5;j++){
				if(names[j-1].compareToIgnoreCase(names[j])<0);
				temp=names[j-1];
				names[j-1]=names[j];
				names[j]=temp;
				
			}
		}
		System.out.println("Names sorted successfully..\n");
		for(i=0;i<5;i++){
			
			
			System.out.println(names[i]);
					
		}
	}
	

}
