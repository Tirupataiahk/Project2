package strings;

import java.util.Scanner;

public class StringRev {

	
	public static void main(String[] args) {
		
		String orig, rev="";
		int i, len;
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the string.  ");
		
		orig=scan.nextLine();
		
		len=orig.length();
		
		for(i=len-1;i>=0;i--){
			
			rev=rev+orig.charAt(i);
		}
		
		System.out.println("Reverse string is: "+rev);
	}

}
