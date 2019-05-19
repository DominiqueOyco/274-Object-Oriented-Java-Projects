package week_5_lecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Pir8
 * TASKS
 * 1. Create a method that will create a copy of a text file
 * 2. Catch any checked exceptions and ask user to correct their mistake
 *
 */
public class TryCatchDemo {
	
	public static void copyFile(String path) throws FileNotFoundException{
		File fileIn = new File(path);
		Scanner fileReader = new Scanner(fileIn);
		PrintWriter fileOut = new PrintWriter("/Users/Pir8/Documents/copycout.rtf");
		String currentLine;
		while(fileReader.hasNextLine()){
			currentLine = fileReader.nextLine();
			System.out.println(currentLine);
			fileOut.println(currentLine);
			
		}
		fileOut.close();
		fileReader.close();
	}
		
	public static void main(String[] args){
	
		boolean exceptionThrown = false;
		do{
		System.out.println("Please enter the path of the file to copy: ");
		Scanner in = new Scanner(System.in);
		String path = in.nextLine();
		if(path.equals("Q")){break;}
		else{
			try {
				copyFile(path);
				exceptionThrown = false;
			} catch (FileNotFoundException exception) {
				exceptionThrown = true;
				System.out.println("File was not found. Please enter a different location or Q to quit.");
			}
		}

	}while(exceptionThrown); //iterates for asking for a file to copy while the exception is thrown
	}
	
}

