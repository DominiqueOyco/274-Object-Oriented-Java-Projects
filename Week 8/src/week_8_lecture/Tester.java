package week_8_lecture;

import java.util.ArrayList;
import java.util.Scanner;

import java.time.LocalDateTime;
import java.util.Collections;

/**
 * Tests the entire cellphone program
 */
public class Tester {
	
	public static void main (String[] args) {
		// creates scanner for user input
		Scanner in = new Scanner(System.in);
		
		// creates new phonebook object
		Phonebook phonebook = new Phonebook ();
			
		// gives the user an option to add a contact
		System.out.println("Welcome to the cell phone simulator!");
		System.out.print("Your phonebook is empty! Would you like to add in contacts right now? Enter 'yes' if so: ");
		String addContactsNow = in.nextLine().trim();
			
		String contactName;
		String contactNumber;
		String contactEmail;
		String contactNotes;
	
		while (addContactsNow.equalsIgnoreCase("yes")) {
			System.out.print("Please enter the name of the contact you'd like to add: ");
			contactName = in.nextLine().trim();
			
			System.out.print("Please enter the number of the contact: ");
			contactNumber = in.nextLine().trim();
			
			System.out.print("Contact email: ");
			contactEmail = in.nextLine().trim();
			
			System.out.print("Any notes of the contact: ");
			contactNotes = in.nextLine().trim();
	    		
			// creates new contact object using user-given strings above
			Contact newContact = new Contact(contactName, contactNumber, contactEmail, contactNotes);
			
			// adds new contact object to the phonebook
			phonebook.addContact(newContact);
			
			System.out.println("Would you like to add another contact? Enter 'yes' if so: ");
			addContactsNow = in.nextLine().trim();
		}
		
		if (phonebook.size() > 0) {
			System.out.println("Success! You've added your first few contacts. Here is the list of your current contacts: ");
			phonebook.displayPhonebook();
		}
		
		System.out.println("What would you like to do?");
		System.out.println("1. Make a call (call by number, a contact, or a favorite)\n2. View or edit the phonebook (add, remove, edit contacts)\n3. View or edit favorite contacts(view, add, remove favorites)\n4. View call history (whole call logs or for a particular contact)\n5. Exit (end the simulator)");
		String choice = in.nextLine().trim();
		
		while (!(choice.equals("1")) && !(choice.equals("2")) && !(choice.equals("3")) && !(choice.equals("4")) && !(choice.equals("5"))) {
			System.out.println("Invalid input! Please select a number (1 - 5). ");
			System.out.println("1. Make a call (call by number, a contact, or a favorite)\n2. View or edit the phonebook (add, remove, edit contacts)\n3. View or edit favorite contacts(view, add, remove favorites)\n4. View call history (whole call logs or for a particular contact)\n5. Exit (end the simulator)");
			choice = in.nextLine().trim();
		}
		
		// initializations for some variables used in upcoming while loop
		boolean calling = false; // call state; true when in a call, false when not in a call
		String callWith;
		ArrayList<Contact> favoriteContacts = new ArrayList<Contact>();
		ArrayList<String> callLogsString = new ArrayList<String>();
		

		// each while loop in this main loop keeps the user in until a valid choice is made
		while (!choice.equals("5")) { // M A I N   W H I L E   L O O P - B E G I N
  
			// M A K I N G   A   C A L L
			if (choice.equals("1")) {
				
				// shows choices to user on how they can make a call
				System.out.println("How would you like to make the call?");
				System.out.println("1. Enter a phone number\n2. Enter a name from a phonebook\n3. Select a top favorite contact");
				String callChoice = in.nextLine().trim();
        
				// C A L L C H O I C E   -   B E G I N
				while (!(callChoice.equals("1")) && !(callChoice.equals("2")) && !(callChoice.equals("3")) && !(callChoice.equals("4"))) {
					System.out.println("Invalid input! Please select a number (1 - 3).");
					System.out.println("1. Enter a phone number\n2. Enter a name from a phonebook\n3. Select a top favorite contact\n4. Cancel");
					callChoice = in.nextLine().trim();
				}
				
				// C A L L   B Y   E N T E R I N G   A   P H O N E   N U M B E R 
				if (callChoice.equals("1")) {
					System.out.println("Please enter the phone number you would like to call in the format XXX-XXX-XXXX: "); 
					String callNumber = in.nextLine().trim();
					
					callWith = callNumber; // this is the STRING of the phone number currently in a call with
					calling = true;			// sets call state to true
					System.out.println("You are now in a call with " + callWith + "!");

					
					// creates time stamp
					String callTime =  LocalDateTime.now().toString();
						
					// creates a new log in STRING form, not as a log object of this call
					// created in a string form first, so we can sort to abc order later after all calls are made, then add them to the arraylist
					String logString = callNumber + "   " + callTime + "   " + "outgoing";
					callLogsString.add(logString);
						
				}
				// C A L L  B Y   S E L E C T I N G   A  N A M E   F R O M   T H E   P H O N E B O O K
				else if (callChoice.equals("2")) {
					// check if phonebook is empty
					if (phonebook.size() == 0) {
						System.out.println("Your phonebook is empty!");
					}
					else {
						System.out.println("Please enter the name of the contact you would like to call: ");
						String callName = in.nextLine().trim();
						
						String tryAgain = "";
						while (!(phonebook.contains(callName)) && !(tryAgain.equals("2"))) {
							System.out.println("The name you entered is not in the phonebook!");
							System.out.println("Would you like to try entering a contact name again or return to the main menu?");
							System.out.println("1. Try again\n2. Return to main menu");
							tryAgain = in.nextLine().trim();
							
							while (!(tryAgain.equals("1")) && !(tryAgain.equals("2"))) {
								System.out.println("Invalid input! Please enter a number (1 or 2).");
								System.out.println("Would you like to try entering a contact name again or return to the main menu?");
								System.out.println("1. Try again\n2. Return to main menu");
								tryAgain = in.nextLine().trim();
							}
							
							if (tryAgain.equals("1")) {
								System.out.println("Please enter the name of the contact you would like to call: ");
								callName = in.nextLine().trim();
							}
							else {
								System.out.println("Returning to the main menu...");
								callChoice = "4";
							}
						}
						// checks if the name given by the user is in the phonebook
						if (phonebook.contains(callName)) {
							callWith = phonebook.getContact(callName).getName(); // this is the STRING of the contact's name
							calling = true;
							System.out.println("You are now in a call with " + callWith + "!");
							
							// creates time stamp
							String callTime =  LocalDateTime.now().toString();
							
							// creates a new log in STRING form, not as a log object of this call
							// created in a string form first, so we can sort to abc order later after all calls are made, then add them to the arraylist
							String logString = callName + "   " + callTime + "   " + "outgoing";
							callLogsString.add(logString);
						}
					}
				}
				// C A L L   B Y   S E L E C T I N G   A   F A V O R I T E   C O N T A C T
				else if (callChoice.equals("3")) {
					if (favoriteContacts.size() == 0 ) {
						System.out.println("You do not have any favorite contacts.");
					}
					else {
						System.out.println("Please select the top contact you would like to call: ");
						
						//  D I S P L A Y S   T H E   F A V O R I T E   C O N T A C T S
						for (int i = 1; i <= favoriteContacts.size(); i++) {
							System.out.println(i + ". " + favoriteContacts.get(i));
						}
		
						String callName = in.nextLine().trim(); // user inputs the name of the contact
						Contact contactInFavorites = phonebook.getContact(callName); // gets the contact object for upcoming check
						
						// checks if the contact object, contactInFavorites, is in the arraylist
						// need to do this because the arraylist is full of contacts, not strings
						if (favoriteContacts.contains(contactInFavorites)) {
							callWith = phonebook.getContact(callName).getName(); // this is the STRING of the contact's name
							calling = true; 
							System.out.println("You are now in a call with " + callWith + "!");

							
							// creates time stamp
							String callTime =  LocalDateTime.now().toString();
							
							// creates a new log in STRING form, not as a log object of this call
							// created in a string form first, so we can sort to abc order later after all calls are made, then add them to the arraylist
							String logString = callName + "   " + callTime + "   " + "outgoing";
							callLogsString.add(logString);	
						}
						else {
							System.out.println("The contact name you entered is not in your favorites!"); // need to throw an exception here
						}	
					}
				}
				else if (callChoice.equals("4")) {
					System.out.println("Returning to main menu...");
				}
				else {
					System.out.println("You did not make a valid selection!");
				} // C A L L C H O I C E   -   E N D
			}// M A K I N G   A   C A L L   -   E N D
			
			// V I E W I N G  &  E D I T I N G   T H E   P H O N E B O O K   -   B E G I N
			else if (choice.equals("2")) {
				// gives options to the user on what to do w the phonebook
				System.out.println("What would you like to do with the phonebook?");
				System.out.println("1. View contacts\n2. Edit the phonebook");
				String phonebookChoice = in.nextLine().trim();
					
				// P H O N E B O O K C H O I C E   -   B E G I N
				// ensures correct user input
				while (!(phonebookChoice.equals("1")) && !(phonebookChoice.equals("2"))) {
					System.out.println("Invalid input! Please enter a number (1 or 2).");
					System.out.println("1. View contacts\n2. Edit the phonebook");
					phonebookChoice = in.nextLine().trim();
				}
				
				// D I S P L A Y I N G   T H E  P H O N E B O O K
				// does a check if the phonebook is empty or not
				if (phonebookChoice.equals("1")) {
					if (phonebook.size() == 0) {
						System.out.println("Your phonebook is empty!");
					}
					else {
						// S H O W I N G    A   S I N G L E   C O N T A C T
						System.out.println("Would you like to view a single contact or view all contacts?");
						System.out.println("1. View single contact\n2. View all contacts\n3. Cancel");
						String viewPhonebook = in.nextLine().trim();
						
						while (!(viewPhonebook.equals("1")) && !(viewPhonebook.equals("2")) && !(viewPhonebook.equals("3"))) {
							System.out.println("Invalid input! Please enter a number (1 - 4).");
							System.out.println("1. View single contact\n2. View all contacts\n3. Cancel");
							phonebookChoice = in.nextLine().trim();
						}
						
						if (viewPhonebook.equals("1")) {
							System.out.println("Please enter the name of the contact you would like to see: ");
							contactName = in.nextLine().trim();
							
							if (phonebook.contains(contactName)) {
								phonebook.displaySingleContact(contactName);
							
								// checks if user wants to call this contact
								System.out.println("Would you like to call this contact? Enter 'yes' or 'no': ");
								String callContact = in.nextLine().trim();
								
								if (callContact.equalsIgnoreCase("yes")) {
									callWith = phonebook.getContact(contactName).getName(); // string of contact name being called
									calling = true;
									System.out.println("You are now in a call with " + callWith + "!");
									
									// creates time stamp
									String callTime =  LocalDateTime.now().toString();
									
									// creates a new log in STRING form, not as a log object of this call
									// created in a string form first, so we can sort to abc order later after all calls are made, then add them to the arraylist
									String logString = callWith + "   " + callTime + "   " + "outgoing";
									callLogsString.add(logString);
									
								}
							}
							else {
								System.out.println("No such contact found.");
							}
						}
						// S H O W   A L L   C O N T A C T S
						else if (viewPhonebook.equals("2")) {
							System.out.println("Showing all contacts...");
							phonebook.displayPhonebook();
						}
						else if (viewPhonebook.equals("3")){
							System.out.println("Returning to main menu...");
						}
					}
				}
				// E D I T I N G   T H E   P H O N E B O O K
				else if (phonebookChoice.equals("2")) {
					
					// options on diff things to do w phonebook
					System.out.println("What would you like to do to the phonebook?");
					System.out.println("1. Add a contact\n2.Edit a contact\n3. Remove a contact\n4. Cancel");
					String contactChoice = in.nextLine().trim();					
					
					// C O N T A C T   C H O I C E   L O O P   -   B E G I N
					while (!(contactChoice.equals("1")) && !(contactChoice.equals("2")) && !(contactChoice.equals("3")) && !(contactChoice.equals("4"))) {
						System.out.println("Invalid input! Please enter a number (1 - 4).");
						System.out.println("1. Add a contact\\n2.Edit a contact\\n3. Remove a contact\\n4. Cancel");
						phonebookChoice = in.nextLine().trim();
					}
					
					// A D D I N G   A   C O N T A C T
					if (contactChoice.equals("1")) {
												
						System.out.print("Please enter the name of the contact you'd like to add: ");
						contactName = in.nextLine().trim();
						
						while (phonebook.contains(contactName)) {
							System.out.println("You already have a contact with that name!");
							System.out.print("Please enter the name of the contact you'd like to add: ");
							contactName = in.nextLine().trim();
						}
						
						System.out.print("Please enter the number of the contact: ");
						contactNumber = in.nextLine().trim();
						
						System.out.print("Contact email: ");
						contactEmail = in.nextLine().trim();
						
						System.out.print("Any notes of the contact: ");
						contactNotes = in.nextLine().trim();
						
						// creates new contact object using user-given strings above
						Contact newContact = new Contact(contactName, contactNumber, contactEmail, contactNotes);
						
						// adds new contact object to the phonebook
						phonebook.addContact(newContact);
						
						System.out.println("\nAdded a new contact! \n" + phonebook.getContact(contactName).toString());
					}
					// E D I T I N G   T H E   C O N T A C T   I N F O
					else if (contactChoice.equals("2")) {
						System.out.println("What is the name of the contact you would like to change? ");
						String changeContactName = in.nextLine().trim();
						
						if (phonebook.contains(changeContactName)) {
							Contact changeContact = phonebook.getContact(changeContactName);
							
							// displays options to user
							System.out.println("What would you like to change?");
							System.out.println("1. Name\n2. Number\n3. Email \n4. Notes");
							String changeContactOption = in.nextLine().trim();
							
							// changing name
							if (changeContactOption.equals("1")) {
								System.out.println("Please enter the new name of the contact: ");
								String newName = in.nextLine().trim();
								changeContact.changeName(newName);
							}
							// changing number
							else if (changeContactOption.equals("2")) {
								System.out.println("Please enter the new number of the contact: ");
								String newNumber = in.nextLine().trim();
								changeContact.changeNumber(newNumber);
							}
							// changing email
							else if (changeContactOption.equals("3")) {
								System.out.println("Please enter the new email of the contact: ");
								String newEmail = in.nextLine().trim();
								changeContact.changeEmail(newEmail);
							}
							// changing notes
							else if (changeContactOption.equals("4")) {
								System.out.println("Please enter the new notes of the contact: ");
								String newNotes = in.nextLine().trim();
								changeContact.changeNotes(newNotes);
							}
							else {
								System.out.println("Invalid selection!");
							}
							
							System.out.println("\nHere is the new contact info: \n" + phonebook.getContact(changeContactName).toString());
							
						}
						else {
							System.out.println("No such contact found.");
						}
					}
					// R E M O V I N G   A   C O N T A C T   F R O M   T H E   P H O N E B O O K
					else if (contactChoice.equals("3")) {	
						System.out.print("Please enter the name of the contact you'd like to remove: ");
						String removeContactName = in.nextLine().trim();
						if (phonebook.contains(removeContactName)) {
							phonebook.removeContact(removeContactName);
						}
						else {
							System.out.println(removeContactName + " was not found in your phonebook.");
						}
					}
					else if (contactChoice.equals("4")) {
						System.out.println("Returning to main menu...");
					} // C O N T A C T   C H O I C E   L O O P   E N D
				}// P H O N E B O O K   C H O I C E   -   E N D
			}// V I E W I N G  &  E D I T I N G   T H E   P H O N E B O O K   -   E N D
			
			
			// V I E W I N G   &   E D I T I N G   F A V O R I T E   C O N T A C T S
			else if (choice.equals("3")) {
						
				// displays all fav contacts if there are any
				if (favoriteContacts.size() >= 1) {
					System.out.println("Your current favorite contacts are...");
					for (int i = 1; i <= favoriteContacts.size(); i++) {
						System.out.println(i + ". " + favoriteContacts.get(i - 1));
					}
				}
				else {	System.out.println("You currently do not have any favorite contacts.");	}
					
				// displays options to user
				System.out.println("What would you like to do?");
				System.out.println("1. Add a favorite contact\n2. Remove a favorite contact\n3. Exit");
				String favoriteChoice = in.nextLine().trim();
				
				// F A V O R I T E C H O I C E   L O O P   -   B E G I N
				while (!favoriteChoice.equals("1") && !(favoriteChoice.equals("2")) && !(favoriteChoice.equals("3"))) {
					System.out.println("Invalid input! Please enter a number (1 - 2).");
					System.out.println("1. Add a favorite contact\n2. Remove a favorite contact\n3. Cancel");
					favoriteChoice = in.nextLine().trim();
				}
					
				// A D D I N G   A   F A V O R I T E   C O N T A C T 
				if (favoriteChoice.equals("1")) {
					// checks if there are 5 contacts already
					if (favoriteContacts.size() <= 5) {
						System.out.println("What is the name of the contact from your phonebook you would like to add?");
						String favoriteContactName = in.nextLine().trim();
						
						if (phonebook.contains(favoriteContactName)) {
							Contact addFavoriteContact = phonebook.getContact(favoriteContactName);
							favoriteContacts.add(addFavoriteContact);
							System.out.println(addFavoriteContact + " was added to your favorite contacts.");
						}
						else {
							System.out.println("Contact was not found in your phonebook.");
						}
					}
					else {System.out.println("Reached max 5 contacts! Remove a contact to be able to add another.");}
				}
				// R E M O V I N G   A   F A V O R I T E   C O N T A C T
				else if (favoriteChoice.equals("2")) {
					System.out.println("What is the name of the contact you would like to remove?");
					String favoriteContactName = in.nextLine().trim();
					
					Contact removeFavoriteContact = phonebook.getContact(favoriteContactName);
					favoriteContacts.remove(removeFavoriteContact);
					System.out.println(removeFavoriteContact + " was removed from your favorite contacts.");
				}
				else if (favoriteChoice.equals("3")) {
					System.out.println("Returning to main menu...");
				}
				else {
					System.out.println("You did not make a valid selection!");
				}// F A V O R I T E C H O I C E   L O O P   -   E N D
			}// V I E W I N G   &   E D I T I N G   F A V O R I T E   C O N T A C T S   -   E N D
			
			
			// V I E W   C A L L   H I S T O R Y   -   B E G I N
			else if (choice.equals("4")) {			
	
				// sorts by name
				Collections.sort(callLogsString);
				
				// creates new arraylists for each category of the log
				ArrayList<String> callLogNamesNumbers = new ArrayList<String>();
				ArrayList<String> callLogTimes = new ArrayList<String>();
				ArrayList<String> callLogTypes = new ArrayList<String>();
				ArrayList<Integer> callLogQuantities = new ArrayList<Integer>();
				int callQuantity = 0;
				
				//distributes the log details to their respective arraylists
				String currentContact;
				for (int i = 0; i < callLogsString.size(); i++) {
					currentContact = callLogsString.get(i);
					String[] divided = currentContact.split("   ");
					callLogNamesNumbers.add(divided[0]);
					callLogTimes.add(divided[1]);
					callLogTypes.add(divided[2]);
				}
				
				// gets the quantity times user and a contact have been in a call
				for (int i = 0; i < callLogNamesNumbers.size(); i++) {
					callQuantity = Collections.frequency(callLogNamesNumbers, callLogNamesNumbers.get(i));
					if (callQuantity > 1) {
						while (Collections.frequency(callLogNamesNumbers, callLogNamesNumbers.get(i)) != 1) {
							callLogNamesNumbers.remove(i);
							callLogTimes.remove(i);
							callLogTypes.remove(i);
						}
					}
					callLogQuantities.add(callQuantity);
				}
				
				System.out.println("Would you like to view the whole call history or call logs for a particular contact?");
				System.out.println("1. View whole call history\n2. View call log for a particular contact");
				String callHistoryChoice = in.nextLine().trim();
				
				// P R I N T I N G   T H E   W H O L E   C A L L   L O G
				if (callHistoryChoice.equals("1")) {
					System.out.println("Call history: ");
					for (int i = 0; i < callLogQuantities.size(); i++) {
						
						// prints number of calls w a contact if the quantity is greater than 1
						// only prints this contact's name's first(?) call w the user
						if (callLogQuantities.get(i) > 1) {
							System.out.println("\nContact name or number: " + callLogNamesNumbers.get(i) + "\nDate and time of call: " + callLogTimes.get(i) + "\nCall type: " + callLogTypes.get(i) + "\nNumber of calls: " + callLogQuantities.get(i));
						}
						// prints w/o num of calls if quantity is 1
						else {
							System.out.println("\nContact name or number: " + callLogNamesNumbers.get(i) + "\nDate and time of call: " + callLogTimes.get(i) + "\nCall type: " + callLogTypes.get(i));
						}			
					}
				}
				// P R I N T I N G   T H E   C A L L   L O G   O F   A   S I N G L E   C O N T A C T
				else if (callHistoryChoice.equals("2")) {
					System.out.println("Please enter the name of the contact whose call logs you'd like to see: ");
					String viewLogContactName = in.nextLine().trim();
					
					// creates arraylists that will be sublists 
					ArrayList<String> callLogNamesNumbersSubList;
					ArrayList<String> callLogTimesSubList;
					ArrayList<String> callLogTypesSubList;
					
					if (phonebook.contains(viewLogContactName)) {
						
						// adds the first instance
						int contactIndex = callLogNamesNumbers.indexOf(viewLogContactName);
						Log log = new Log(callLogNamesNumbers.get(contactIndex), callLogTimes.get(contactIndex), callLogTypes.get(contactIndex));
						System.out.println(log.toString());
						
						// makes the size of the sublist smaller until there are no more instances of the call in the arraylist
						while (contactIndex != -1) {
							callLogNamesNumbersSubList = new ArrayList<String>(callLogNamesNumbers.subList(contactIndex, callLogNamesNumbers.size()));
							callLogTimesSubList = new ArrayList<String>(callLogTimes.subList(contactIndex, callLogNamesNumbers.size()));
							callLogTypesSubList = new ArrayList<String>(callLogTypes.subList(contactIndex, callLogNamesNumbers.size()));
							contactIndex = callLogNamesNumbersSubList.indexOf(viewLogContactName);
							
							// creates a log and prints it
							log = new Log(callLogNamesNumbersSubList.get(contactIndex), callLogTimesSubList.get(contactIndex), callLogTypesSubList.get(contactIndex));
							System.out.println(log.toString());
							
							// index = 0 means it's the last value in the array list
							// set to -1 to break the while loop
							if (contactIndex == 0) {
								contactIndex = -1;
							}
						}
					}
					else {
						System.out.println("No such contact found.");
					}
				}
			}	// V I E W   C A L L   H I S T O R Y   -   E N D		
			else if (choice.equals("5")) {
				System.out.println("Thank you for using this program!\nExiting the simulator...");
			}
			System.out.println("\nWhat would you like to do?");
			System.out.println("1. Make a call (call by number, a contact, or a favorite)\n2. View or edit the phonebook (add, remove, edit contacts)\n3. View or edit favorite contacts(view, add, remove favorites)\n4. View call history (whole call logs or for a particular contact)\n5. Exit (end the simulator)");
			choice = in.nextLine().trim(); 
		}
	in.close();
	}	
}
