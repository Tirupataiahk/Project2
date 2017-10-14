package strings;

import java.util.Scanner;

public class UpperToLoyar {

	
	public static void main(String[] args) {
		
		char ch;
		int temp;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter character in Upper case:  ");
		
		ch=scan.next().charAt(0);
		
		temp=(int)ch;
		
		temp=temp+32;
		
		ch=(char) temp;
		
		System.out.println("Equalent character in Lowercase: "+ch);
	}

}
