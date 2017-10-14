package strings;

import java.util.Scanner;

public class Concatenate {

	
	public static void main(String[] args) {
		
		String str1,str2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first string:  ");
		
		str1=scan.nextLine();
		
		System.out.print("Enter second string: ");
		
		str2=scan.nextLine();
		
		System.out.println("Concatinating string1 in to string2. \n\n");
		
		str1=str1.concat(" "+str2);
		
		System.out.println("Concatinated string is: "+str1);

	}

}
