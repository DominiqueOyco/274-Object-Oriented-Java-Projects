//package week_8_lecture;
//
//import java.util.ArrayList;
//
//public class Phonebook {
//	
//	private ArrayList<Contact> phonebook;
//	
//	public Phonebook () {
//		this.phonebook = new ArrayList<Contact>();
//	}
//	
//	public boolean contains (String contactName) {
//		boolean contains = false;
//		for (Contact c: phonebook) {
//			String currentName = c.getName();
//			if (currentName.equals(contactName)) {
//				contains = true;
//			}
//			else {
//				contains = false;
//			}
//		}
//		return contains;
//		
//	}
//	
//	public void addContact(Contact contact) {
//		phonebook.add(contact);
//	}
//
//	
//	// should probably do a check in the tester that there aren't contacts w/ same name
//	public void removeContact (String contactName) {
//		int contactNameIndex = phonebook.indexOf(contactName);
//		phonebook.remove(contactNameIndex);
//	}
//	
//	public Contact getContact (String contactName) {
//		Contact contact = null;
//		for (Contact c: phonebook) {
//			String currentName = c.getName();
//			if (currentName.equals(contactName)) {
//				contact = c;
//			}
//			else {
//				System.out.println("No such contact found.");
//			}
//		}	
//		return contact;
//	}
//	
//	public int size () {
//		int size = 0;
//		for (int i = 0; i < phonebook.size(); i++) {
//			size++;
//		}
//		return size;
//	}
//	
//	public void displaySingleContact(String contactName) {
//		// we need to open this in a new frame!! below just prints it to the console
//		for (Contact c: phonebook) {
//			String currentName = c.getName();
//			if (currentName.equals(contactName)) {
//				System.out.println(c.toString());
//			}
//			
//		}
//		  int fWidth = 1280;
//		  int fHeight = 720;
//		  
//
//		  FavoriteContactFrame contact = new FavoriteContactFrame("/Users/Pir8/Desktop/C_dbAxiUwAAmM5e.jpg", fWidth, fHeight, Contact.getName(), Contact.getNumber, Contact.getEmail, Contact.getNotes, "");
//		  contact.displayContactFrame();
//		}
//		
//	
//	public void displayPhonebook () {
//		// we need to open this in a new frame!! below just prints it to the console
//		int counter = 1;
//		for (int i = 0; i < phonebook.size(); i++) {
//			System.out.println(counter + ". " + phonebook.get(i).toString());
//			counter++;
//		}
//
//		}
//
//
//	public static void main (String [] args) {
//		Phonebook hello = new Phonebook();
//		System.out.print(hello.size());
//	}
//}

/**
 * 
 * @author Thomas, Chanelle, Dominique, Jocelyn
 * @version 1.0
 * @since 10-05-17
 *
 */


package week_8_lecture;

import java.util.ArrayList;

/**
 * This class represents a phonebook.
 * To which contacts will be added to it.
 */

public class Phonebook {
	
	private ArrayList<Contact> phonebook;
	
	/**
	 * this method allows contacts to be added to the phonebook
	 */
	
	public Phonebook () {
		this.phonebook = new ArrayList<Contact>();
	}
	
	/**
	 * this method checks if a contact exists in the phonebook
	 * @param contactName is a user input
	 * @return true or false if contact is in or not in the phonebook
	 */
	public boolean contains (String contactName) {
		boolean contains = false;
		for (Contact c: phonebook) {
			String currentName = c.getName();
			if (currentName.equals(contactName)) {
				contains = true;
			}
			else {
				contains = false;
			}
		}
		return contains;
		
	}
	
	/**
	 * this method adds a contact to the phonebook
	 * @param contact adds the contact
	 */
	
	public void addContact(Contact contact) {
		phonebook.add(contact);
	}

	
	/**
	 * this method removes a contact from the phonebook
	 * @param contactName removes a contact from entering a contact name
	 */
	// should probably do a check in the tester that there aren't contacts w/ same name
	public void removeContact (String contactName) {
		int contactNameIndex = phonebook.indexOf(contactName);
		phonebook.remove(contactNameIndex);
	}
	
	/**
	 * This method is used to get contacts from the phonebook 
	 * @param contactName what it will be searching in the phonebook
	 * @return contact This returns the contact
	 */
	
	public Contact getContact (String contactName) {
		Contact contact = null;
		for (Contact c: phonebook) {
			String currentName = c.getName();
			if (currentName.equals(contactName)) {
				contact = c;
			}
			else {
				System.out.println("No such contact found.");
			}
		}	
		return contact;
	}
	
	/**
	 * This method is for the favorite contacts
	 * Bcuz we could only have 5 favorite contacts we have to
	 * keep track of how many contacts have been added as a favorite.
	 * @return size, returns how many favorite contacts there are
	 */
	
	public int size () {
		int size = 0;
		for (int i = 0; i < phonebook.size(); i++) {
			size++;
		}
		return size;
	}
	
	
	/**
	 * This method allows the contact to be displayed
	 * @param contactName singles out one contact from the phonebook to be displayed
	 */
	public void displaySingleContact(String contactName) {
		// we need to open this in a new frame!! below just prints it to the console
		for (Contact c: phonebook) {
			String currentName = c.getName();
			if (currentName.equals(contactName)) {
				System.out.println(c.toString());
			}
		}
		
	}
	
	public void displayPhonebook () {
		// we need to open this in a new frame!! below just prints it to the console
		int counter = 1;
		for (int i = 0; i < phonebook.size(); i++) {
			System.out.println(counter + ". " + phonebook.get(i).toString());
			counter++;
			
			//call favorite contact frame to display the contact
			
			
		}
	}

	public static void main (String [] args) {
		Phonebook hello = new Phonebook();
		System.out.print(hello.size());
	}
}
