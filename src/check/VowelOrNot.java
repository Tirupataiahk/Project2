package check;

import java.util.Scanner;

public class VowelOrNot {

	
	
	public static void main(String[] args) {
		
		char ch;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter a character:  ");
		
		ch=scan.next().charAt(0);
		
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
			
			System.out.println(ch+" is a Vowel.");
		}
		else{
			
			System.out.println(ch+" is not a Vowel.");
		}
		

	}

}
