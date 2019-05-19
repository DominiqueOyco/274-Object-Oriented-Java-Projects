package week_4_lecture;
/**
*
* Purpose: To print the total amount owed for a full cart of groceries to a text file and save it on the user's computer 
* @author Dominique
* @version 1.0
* @since 2017-09-19
* */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PROJECT1 {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(System.in);
		
		/**
		 * Creates an output text file by asking the user for name of the file if the file does not exists if the file does exists 
		 * then the file will be emptied to create a new content within the file.
		 */	
		System.out.println("Before we begin, please enter the name of the text file: ");
		String fileName = in.nextLine().trim();
		String path = "/Users/Pir8/Desktop/Receipts/" + fileName + ".txt";
		//PrintWriter fileOUT = new PrintWriter(path);

		/**
		 * continuously asks the user for the inputs name and the size/weight
		 * stores the name to arraylist productName and the size/weight to an arraylist productsizeWeight
		 */
		ArrayList<String> name  = new ArrayList<String>();
		ArrayList<Double> sizeWeight  = new ArrayList<Double>();
				
		String productName;
		Double productSizeweight;

		do{
			System.out.println("Please enter the name of the item (enter DONE if you're finished): ");
			productName = in.nextLine().trim();
			name.add(productName);		
		}while(!productName.equalsIgnoreCase("DONE"));

		
		do{
			System.out.println("Please enter the size or the weight of the item (enter 00 if you're finished): ");
			productSizeweight = in.nextDouble();
			sizeWeight.add(productSizeweight);
			
		}while(productSizeweight != 00);
				
		System.out.println("How many items of each items do you want to order?: ");
		int amount = in.nextInt();
		
		/**
		 * The program search the text file "pricelist.txt" for the prices of the items entered
		 */

		File pricelist = new File("pricelist.txt");
		
		Scanner fileIN = new Scanner(pricelist);
		
		String currentLine;
		
		while(fileIN.hasNextLine()){
			System.out.println(fileIN.nextLine());
		}
		
		
		/**
		 * Program formats the output so that it lists each item on the left and its subtotal to the right
		 */
		double total = 0.0;
		int counter = 0;
		
		Pattern pattern = Pattern.compile("([\\w]+[\\w|\\s]+[\\w]+[\\W|\\s]+[\\w|\\s]+)([\\d]+[\\D|\\s]+[\\W]+)([\\d|.]+[\\d])");
		Matcher m;
		PrintWriter fileOUT = new PrintWriter(path);
		fileIN = new Scanner(pricelist);
		while(fileIN.hasNextLine()){
			currentLine = fileIN.nextLine(); 
			m = pattern.matcher(currentLine); 
			if(m.find()){	
				/**
				 * This formats the structure of the file when the quantity of an item is greater than 1
				 */		
				double n = Double.parseDouble(m.group(3));
				fileOUT.println("Just Fooding\n123 E. Lechuga St.\nCarrotville, CA 9999\n\n" + "Item: " + m.group(1) + "\t" + name.size() + "@" + m.group(3) + "\t\tSubtotal: " + amount * n);
				for (int i = 0; i < amount; i++) {
					if(amount > 1){
						total = amount * n;
						counter++;
					}
					else{				
						break;		
					}
				}  
				fileOUT.print("\n\nTotal: " + total);
				fileOUT.close();
			}

			/**
			 * This asks the user for the payment of the items
			 */
		
		System.out.print("Would you like to pay now? (Y/N): ");
		String payment = in.nextLine().trim();
		
		if(payment.equalsIgnoreCase("Y")){
			System.out.print("Plese enter your 12 digit card number: ");
			String paymentMethod = in.nextLine().trim();
			
			if(paymentMethod.length() == 12){
				System.out.println("THANK YOU FOR YOUR PURCHASE!");
				System.exit(0);
			}
			
			else{
				System.out.println("Invalid payment method! Please come again!");
				System.exit(0);
			}
		}
		
		else if(payment.equalsIgnoreCase("N")){
			System.out.println("Please come again!");
			System.exit(0);
		}
	}		
	}
		
}



