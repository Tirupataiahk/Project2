package practice;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		float a,b, res;
		char choice,ch;
		
		Scanner scan =new Scanner(System.in);
		
		do{
			System.out.print("1. Addition \n");
			System.out.println("2. Substraction \n");
			System.out.println("3. Multiplication \n");
			System.out.println("4. Division \n");
			System.out.println("5. Exit \n\n");
			System.out.println("Enter Your Choice:  ");
			
			choice=scan.next().charAt(0);
			
			switch(choice){
			
			case '1':System.out.println("Enter any two numbers: ");
			
			a=scan.nextFloat();
			b=scan.nextFloat();
			res=a+b;
			System.out.println("Result: "+res );
			break;
			
			case '2':System.out.println("Enter any two numbers: ");
			
			a=scan.nextFloat();
			b=scan.nextFloat();
			res=a-b;
			System.out.println("Result: "+res );
			break;
			
			case '3':System.out.println("Enter any two numbers: ");
			
				a=scan.nextFloat();
				b=scan.nextFloat();
				res=a*b;
				System.out.println("Result: "+res );
				break;
			
			case '4':System.out.println("Enter any two numbers: ");
			
				a=scan.nextFloat();
				b=scan.nextFloat();
				res=a/b;
				System.out.println("Result: "+res );
			break;
			
			case '5':System.exit(0);
			
				break;
			default: 
				if(choice<=5){
				System.out.println("Wrong choice");
				break;
				}
			}
			System.out.println("\n------------------------------------------\n");
			
		}while(choice!=5);

	}

}
