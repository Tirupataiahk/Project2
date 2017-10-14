package strings;

import java.util.Scanner;

public class RemoveVowels {

	
	public static void main(String[] args) {
		
		String strOrig,strNew;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		strOrig=scan.nextLine();
		System.out.println("Removing Ovels from a String: ["+strOrig+"] \n");
		
		strNew=strOrig.replaceAll("[aeiouAEIOU]", " ");
		
		System.out.println("All Vowels Removed Successfully:  \n\n New String is:  \n");
		
		System.out.println(strNew);

	}

}
