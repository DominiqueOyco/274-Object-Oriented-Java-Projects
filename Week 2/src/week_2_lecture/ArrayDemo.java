package week_2_lecture;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	/**
	 * creates a copy of an old phone book but includes additional storage
	 * @param oldPhonebook - an array of strings holding the contacts
	 * @param additional - the number of additional contacts that will be added
	 * */
//	public static String[] extendPhonebook(String[] oldPhonebook, int additional){
//		//NEED TO CREATE AN ARRAY OF SIZE OLD PHONEBOOK + ADDITIONAL CONTACTS
//		int newSize = additional + oldPhonebook.length;
//		String[] tempContacts = new String[newSize]; //Empty array, need to copy old contacts into this array
//		int idx = 0;
//		//Copying the contents of the old phonebook into the larger one
//		for(String contact : oldPhonebook){
//			tempContacts[idx] = contact;
//			idx++;
//		}
//		return tempContacts; //returning the larger array
//	}
	
	public static String[] extendPhonebook(String[] oldPhonebook, int additional){
		int newSize = additional + oldPhonebook.length;
		
		String[] newTempcontacts = Arrays.copyOf(oldPhonebook, newSize);
		
		return newTempcontacts; 
	}
	
	/**
	 * prints the phone book
	 * @param contacts - an array of strings holding the contacts
	 * */
	public static void printPhonebook(String[] contacts){
		int idx = 1;
		for(String contact : contacts){ //This is an enhanced for-loop; you can only use it for access
				//the dummy variable contact will be the handle for each entry of contacts at each iteration
				System.out.printf("%d. %s\n", idx, contact); //%d inserts an integer into the string, %s inserts a string
				//idx is 1 (%d) while %s is the contact
				idx++; 
				
				
			}
	}
	
	/**
	 * removes a contact from the phone book
	 * @param contacts - an array of strings
	 * @param removeIdx - an int holding the index of the contact to be removed
	 * @return 
	 * */


	public static void main(String[] args){
		// --------- INTRO
		System.out.print("Welcome to your phonebook.  How many contacts would you like to store? ");
		Scanner in = new Scanner(System.in);
		int numContacts = Integer.parseInt(in.nextLine().trim());
		//INITIAL DATA STORAGE
		String[] contacts = new String[numContacts]; //declaration & initialization
		String contact; //declaring a string to store the current contact		
		for (int i = 0; i < numContacts; i++){
			System.out.println("Enter name & number: "); //asking for input contact
			contact = in.nextLine().trim(); //accepting the input
			contacts[i] = contact; //storing into the array
		}		
		
		// VERIFICATION OF INPUT
		System.out.println("These are the contacts you stored.");
		printPhonebook(contacts);
		
		// MENU OPTIONS
		String menu = "1. Add more contacts.\n2. Delete a contact.\n3. Print the phonebook.\n4. Exit the program.";
		int selection;
		
		do{
			System.out.println("Please choose one of the following items.\n" + menu);
			selection = Integer.parseInt(in.nextLine().trim());
			
			if(selection == 1){
				System.out.print("How many additional contacts?");
				int additional = Integer.parseInt(in.nextLine().trim());
				contacts = extendPhonebook(contacts, additional); //calling the method & overwriting contacts
				for(int i = numContacts; i < contacts.length; i++){
					System.out.print("Enter name & number: ");
					contacts[i] = in.nextLine().trim();
				}
				numContacts = numContacts + additional; //updating numContacts for future adding
			}
			else if(selection == 3){
				printPhonebook(contacts);
			}
			else if(selection < 1 || selection > 4){
				System.out.println("Invalid selection. Please try again: ");
				selection = Integer.parseInt(in.nextLine().trim());
			}
			
			
		}while(selection != 4);
		
		
	}

}

/**
*INFORMATION FOR THE HOMEWORK
*PASS-BY-VALUE: passing a copy of the original date
*PASS-BY-REFERENCE: passing the address of the original data (direct modification)
*JAVA USES PASS-BY-VALUE BUT SOMETIMES IT BEHAVE LIKES PASS-BY-REFERENCE
**/
