package arrays;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		int i,num,tab;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:  ");
		num=scan.nextInt();
		
		System.out.println("Table of "+num+" is");
		for(i=1;i<=10;i++){
			tab=num*i;
			
			System.out.println(num+" * "+i+" = "+tab+"\n");
			
			
		}
	}

}
