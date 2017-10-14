package practice;

import java.util.Scanner;

public class CentgradeToFahernheit {

	
	public static void main(String[] args) {
	
		float cen;
		double fah;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the temparature in Faherienheit:  ");
		cen=scan.nextFloat();
		
		fah=(1.8*cen)+32;
		
		System.out.println("Temperature in Celcious:  "+fah);
		

	}

}
