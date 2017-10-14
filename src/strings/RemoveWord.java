package strings;

import java.util.Scanner;

public class RemoveWord {

	
	public static void main(String[] args) {
		
		String strOrig,word;
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter the sentense:  ");
		strOrig=scan.nextLine();
		System.out.print("Enter the which you want to delete: ");
		word=scan.nextLine();
		System.out.println("Deleting all "+word+" from "+strOrig+" ....\n");
		strOrig=strOrig.replaceAll(word, "");
		System.out.println("Specied word is deleted successfully...\n\n New String is: \nn"+strOrig);
		
		
		

	}

}
