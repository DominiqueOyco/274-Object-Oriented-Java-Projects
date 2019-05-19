package lecture_basic_review;

import java.util.Arrays;
import java.util.Scanner;

public class LabAssignment1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Let's get this party started! Enter the date of your event: ");
		String date = in.nextLine().trim();
		
		System.out.println("Good. Now, what would you like to call your event?");
		String event = in.nextLine().trim();
		
		System.out.println("What is the maximum number of guests allowed?");
		int maxGuests = Integer.parseInt(in.nextLine().trim());
		
		System.out.println("Thank you. Please enter the name of each guest followed by ENTER. When you are done, enter DONE.");
		
		String guestNames[] = new String[maxGuests];
				
		String guestName;
		
		
		int counter = 0; //counts the user inputs in the array list instead of the maximum amount of the arraylist
		
		for (int i = 0; i < maxGuests; i++) {
			System.out.print("Guest Name: ");
			guestName = in.nextLine().trim();
			
			
			if(!guestName.equalsIgnoreCase("DONE")){
				guestNames[i] = guestName;
				counter ++;
			}
			else{
				
				break;
			}
		}  
		
		System.out.println("This is the information on your " + event + " event...\nDate: " + date);
		
		System.out.println("Maximum Number of Guests: " + maxGuests);		

		System.out.println("Current Number of Guests: " + counter);	
		
		System.out.print("Current Guests: \n");
		
		for (int j = 0; j < counter; j++) {
		    System.out.print(guestNames[j] + "\n");
		}  
		
		System.out.println("Have a fun party!");
      
	}

}
