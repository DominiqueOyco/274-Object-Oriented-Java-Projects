package week_8_lecture;
/**
 * 
 * @author Jocelyn, Dominique, Chanel, Thomas
 * @version 1.0
 * @since 10-05-17
 *
 */

public class Log {
	/**
	 * this class is to record the time and date of calls being made
	 */

	private String contactNameNumber;
	private String dateTime;
	private String type;
	
	
	public Log () {
		this.contactNameNumber = "";
		this.dateTime = "";
		this.type = "";
	}
	
	/**
	 * This method takes in the contact and records the time and date
	 * @param contactNameNumber
	 * @param dateTime
	 * @param type
	 */
	public Log (String contactNameNumber, String dateTime, String type) {
		this.contactNameNumber = contactNameNumber;
		this.dateTime = dateTime;
		this.type = type;
	}
	
	/**
	 * this method gets the number and matches it with the contact
	 * @returns the contact with the number
	 */
	public String getNameNumber () {
		return this.contactNameNumber;
	}
	
	/**
	 * this method prints the call to what contact was made with the time and date
	 */
	public String toString () {
		return "Contact Name and Number: " + this.contactNameNumber + "\nDate and time of call: " + this.dateTime + "Call type: " + this.type;
	}
}
