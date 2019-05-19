package week_3_lecture;

import java.util.ArrayList;
import java.util.Scanner;

public class FormatFlagsDemo {
	
	public static void main(String[] args){
		
		ArrayList<Double> discountedPrices = new ArrayList<Double>(); 
		Scanner in = new Scanner(System.in);
		
		System.out.println("This program is designed to calculate reduced prices based on a percentage off.\nPlease enter the percent discount:");
		double decimalDiscount = Double.parseDouble(in.nextLine())/100;
		double discountedPrice;
		System.out.println("Type each price followed by enter.  \"DONE\" when finished");
		
		while(in.hasNextDouble()){
			discountedPrice = in.nextDouble() * (1 - decimalDiscount);
			discountedPrices.add(discountedPrice);
		}
		
		int i = 1;
		for(double price : discountedPrices){
			System.out.printf("%-15s$%.2f\n", "Item #" + i, price); 
			//%-15s means insert a string and allow it up to 15 characters long and it is shorter then add whitespace and -15 is to the left
			//"Item #" + i is the item to be inserted to the left
			//%.2f is insert a float in two decimal places and add a newline
			//$ prints the $ to the console and is not part of the formatting
			i++;
		}
		
	}
	

}
