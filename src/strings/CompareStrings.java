package strings;

import java.util.Scanner;

public class CompareStrings {


	public static void main(String[] args) {
	
		String str1,str2;
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter first string:  ");
		
		str1=scan.nextLine();
		
		System.out.println("Enter second string:  ");
		
		str2=scan.nextLine();
		
		if(str1.compareTo(str2)>0){
			
			System.out.println("First string is grater than second string.");
		}
		else if(str1.compareTo(str2)<0){
			System.out.println("First string is smaller than second string.");
		}
		
		else{
			System.out.println("Both strings are equal.");
		}
	}

}
