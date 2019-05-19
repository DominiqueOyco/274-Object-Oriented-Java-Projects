package week_3_lecture;
import java.util.Scanner;
import java.io.File;  						//<--------------DO NOT FORGET TO INCLUDE 
import java.io.FileNotFoundException;		//<-------------------THESE PACKAGES


public class ReaderDemo {
		
	// Must throw FileNotFoundException in case file is does not exist
	public static void main(String[] args) throws FileNotFoundException{
		
		/* STEP 1:  Create an object of the file class, pass in the file path/name */
		
		File tollfree = new File("/Users/Pir8/Documents/CECS 274/greeneggs.txt");
		
		
		/* STEP 2:  Create a Scanner object to read the file, pass in the file name*/
		
		Scanner fileIN = new Scanner(tollfree);
		
		
		
		/* STEP 3:  Process the file*/
		while(fileIN.hasNextLine()){
			System.out.println(fileIN.nextLine());
		}
		
	} 

}
