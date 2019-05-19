package week_3_lecture;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriterDemo {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		/*STEP 1: Create a PrintWriter object to write the new file*/
		String path = "/Users/Pir8/Documents/CECS 274/greenEggs.txt";
		PrintWriter fileOUT = new PrintWriter(path);
		
		/*STEP 2: Write the file */
		fileOUT.print("I do not like green eggs and ham!");
		fileOUT.print("I do like them, Sam I am.");
		
		/*STEP 3: Close the writer, otherwise data may not be written correctly*/
		fileOUT.close(); //if you don't close it, the txt file will be blank because the program is thinking you might add more

	}

}
