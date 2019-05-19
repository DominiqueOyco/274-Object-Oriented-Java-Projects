package week_8_lecture;

public class Contact {
	
	private String contactName;
	private String number;
	private String email;
	private String notes;
	private boolean favorite;
	
	public Contact () {
		this.contactName = "";
		this.number = "";
		this.email = "";
		this.notes = "";
	}
	
	/**
	 * Sets the contact's original name, number, email, and notes
	 * @param contactName - String that store the name of the contact
	 * @param number - String that stores the number of the contact
	 * @param email - String that stores the email of the contact
	 * @param notes - String that stores any necessary information about the contact
	 */
	public Contact (String contactName, String number, String email, String notes) {
		this.contactName = contactName;
		this.number = number;
		this.email = email;
		this.notes = notes;
	}
	
	/**
	 * changes the previous contact's name with a new one
	 * @param newName - the new name of the previous contact
	 */
	public void changeName (String newName) {
		this.contactName = newName;
	}
	
	/**
	 * changes the phone number of the previous contact
	 * @param newNumber - the new number of the previous contact
	 */
	public void changeNumber (String newNumber) {
		this.number = newNumber;
	}
	
	/**
	 * changes the email address of the previous contact
	 * @param newEmail - the new email address of the previous contact
	 */
	public void changeEmail (String newEmail) {
		this.email = newEmail;
	}

	/**
	 * changes the notes about the previous contact
	 * @param newNotes - the new notes of the previous contact
	 */
	public void changeNotes (String newNotes) {
		this.notes = newNotes;
	}
	
	/**
	 * Checks for the name of the contact
	 * @return contactName - the name of the contact
	 */
	public String getName () {
		return this.contactName;
	}
	
	/**
	 * Checks for the number of the contact
	 * @return number - the number of the contact
	 */
	public String getNumber () {
		return this.number;
	}
	
	/**
	 * Checks for the email of the contact
	 * @return email - the email of the contact
	 */
	public String getEmail(){
		return this.email;
	}
	
	/**
	 * Checks for the notes about the contact
	 * @return notes - any notes about the contact
	 */
	public String getNotes(){
		return this.notes;
	}
	
	/**
	 * Sets the favorite contact by setting the boolean favorite to true
	 */
	public void setFavorite () {
		this.favorite = true;
	}
	
	/**
	 * Removes the favorite contact by setting the boolean favorite to false
	 */
	public void removeFavorite () {
		this.favorite = false;
	}
	
	/**
	 * Displays the contact's name, phone number, email address, and any necessary information included
	 */
	public String toString () {
		return ("Contact Name: " + this.contactName + "\nPhone Number: " + this.number + "\nEmail Address: " + this.email + "\nNotes: " + this.notes);
	}
}
