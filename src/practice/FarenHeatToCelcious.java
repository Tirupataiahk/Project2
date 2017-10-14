package practice;

import java.util.Scanner;

public class FarenHeatToCelcious {

	public static void main(String[] args) {
		
		float fah;
		double cel;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter temparature in to Fahrenheit:  ");
		fah=scan.nextFloat();
		
		cel=(fah-32)/1.8;
		
		
		System.out.println("Temparature in celcious:  "+cel);

	}

}
