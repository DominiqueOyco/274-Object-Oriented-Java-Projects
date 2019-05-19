package lecture_basic_review;

import java.util.Scanner;

public class InputReview {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Hello, what is your name? ");
		String name = in.nextLine().trim();
		System.out.println("\nNice to meet you " + name + ". My name is Jarvis. How can I help you?");
		String menu = "Please select one of the following: \n1. Make a purchase. \n2. Return an item. \n3. Print an invoice";
		System.out.println(menu);
		
		int selection = Integer.parseInt(in.nextLine().trim());
		boolean isValidSelection; //creating a boolean variable (it will hold either true or false)
		
		do{ //run through the block of code, only checking for the condition at the end.
			if (selection == 1){//decision block #1: the selection is 1.
				System.out.println("You chose to make a purchase");
				isValidSelection = true; //assigning the value 'true' to the boolean variable
			}
			else if (selection == 2){//decision block #2: the selection is 2.
				System.out.println("You chose to return an item.");
				isValidSelection = true; 
			}
			else if (selection == 3){
				System.out.println("You chose to print an invoice.");
				isValidSelection = true;
			}
			else{
				System.out.print("Invalid selection. Please enter a valid selection: ");
				selection = Integer.parseInt(in.nextLine().trim()); //Updating selection to new input
				isValidSelection = false;
			}
		}while(!isValidSelection); //Checks whether isValidSelection is false to iterate again.
	}

}
